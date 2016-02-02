package com.zizaike.core.common.util.http;

import java.io.IOException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 专门用于Spring 自动properties注入的HttpComponent
 *
 * @author snow.zhang
 */
public class HttpComponent {

  private static final Logger LOG = LoggerFactory.getLogger(HttpComponent.class);
  private static final int MAX_TOTAL = 100;
  private static final int DEFAULT_TIMEOUT = 200;
  private HttpClient httpClient;
  private ExecutorService executor;

  /**
   * 默认设置的HttpClient
   * <p/>
   * 单个站点最大允许连接:200 单个站点最大允许连接数:200 默认连接超时时间:200ms 默认数据接收超时时间:200ms
   * 
   * @throws Exception
   */
  public HttpComponent() throws Exception {
    this(MAX_TOTAL, MAX_TOTAL, DEFAULT_TIMEOUT, DEFAULT_TIMEOUT, false);

  }

  /**
   * 带参数设置的HttpClient
   *
   * @param maxPerRoute 单个站点最大允许连接
   * @param maxTotal 单个站点最大允许连接数
   * @param connTimeout 连接超时时间
   * @param soTimeout 数据接收超时时间
   * @param staleConnCheck 是否进行陈旧连接检查, 如果不开启, 则启动陈旧连接关闭线程
   */

  public HttpComponent(int maxPerRoute, int maxTotal, int connTimeout, int soTimeout,
      boolean staleConnCheck) throws Exception {
    PoolingClientConnectionManager connectionManager = new PoolingClientConnectionManager();
    connectionManager.setDefaultMaxPerRoute(maxPerRoute);
    connectionManager.setMaxTotal(maxTotal);
    HttpParams httpParams = new BasicHttpParams();
    httpParams.setIntParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, connTimeout);
    httpParams.setIntParameter(CoreConnectionPNames.SO_TIMEOUT, soTimeout);
    httpParams.setBooleanParameter(CoreConnectionPNames.STALE_CONNECTION_CHECK, staleConnCheck);
    if (!staleConnCheck) {
      new IdleConnectionMonitorThread(connectionManager).start();
    }
    /* 跳过SSL证书检查 */
    SSLContext sslcontext = SSLContext.getInstance("TLS");
    TrustManager truseAllManager = new X509TrustManager() {

      public void checkClientTrusted(java.security.cert.X509Certificate[] arg0, String arg1)
          throws CertificateException {}

      public void checkServerTrusted(java.security.cert.X509Certificate[] arg0, String arg1)
          throws CertificateException {}

      public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return null;
      }

    };
    sslcontext.init(null, new TrustManager[] {truseAllManager}, null);
    SSLSocketFactory sf =
        new SSLSocketFactory(sslcontext, SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
    Scheme https = new Scheme("https", 443, sf);
    connectionManager.getSchemeRegistry().register(https);
    httpClient = new DefaultHttpClient(connectionManager, httpParams);
    /* 自适应线程池 */
    executor = Executors.newCachedThreadPool();
  }

  /**
   * Execute t.
   * 
   * @param httpHost the http host
   * @param httpUriRequest the http uri request
   * @param handler the handler
   * @return the t
   * @throws java.io.IOException the iO exception
   */
  @Deprecated
  public <T> T execute(HttpHost httpHost, HttpUriRequest httpUriRequest, ResponseHandler<T> handler)
      throws IOException {
    return httpClient.execute(httpHost, httpUriRequest, handler, new BasicHttpContext());
  }

  /**
   * Execute t.
   *
   * @param httpUriRequest the http uri request
   * @param handler the handler
   * @return the t
   * @throws java.io.IOException the iO exception
   */
  // @Deprecated
  public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<T> handler)
      throws IOException {
    return httpClient.execute(httpUriRequest, handler, new BasicHttpContext());
  }

  /**
   * Execute with log
   *
   * @param httpUriRequest the http uri request
   * @param handler the handler
   * @return the t
   * @throws java.io.IOException the iO exception
   */
  // @Deprecated
  public <T> T executeWithLog(HttpUriRequest httpUriRequest, ResponseHandler<T> handler)
      throws IOException {
    long start = System.currentTimeMillis();
    T result = httpClient.execute(httpUriRequest, handler, new BasicHttpContext());
    LOG.info("send request to: {}, execute time: {}ms", httpUriRequest.getURI(),
        System.currentTimeMillis() - start);
    return result;
  }
  public <T> T executeUriRequestWithLog(HttpUriRequest httpUriRequest, ResponseHandler<T> handler)
          throws IOException {
      long start = System.currentTimeMillis();
      T result = httpClient.execute(httpUriRequest, handler, new BasicHttpContext());
      LOG.info("send request to: {}, execute time: {}ms", httpUriRequest.getURI(),
              System.currentTimeMillis() - start);
      return result;
  }


  public <T> T execute(HttpRequest<T> request) throws IOException {
    HttpUriRequest httpUriRequest = request.createHttpUriRequest();
    // httpUriRequest.setParams(params);
    // HttpUriRequest httpUriRequest = new HttpUriRequest();

    return execute(httpUriRequest, request.getResponseHandler());
  }

  public List<Object> executeBatch(final List<HttpRequest> request) throws IOException {
    List<Future> results = new ArrayList<Future>(request.size());
    for (final HttpRequest httpRequest : request) {
      results.add(executor.submit(new Callable<Object>() {
        @Override
        public Object call() throws Exception {
          return execute(httpRequest);
        }
      }));
    }
    List<Object> result = new ArrayList<Object>();
    int index = 0;
    for (Future future : results) {
      try {
        result.add(future.get(request.get(index).getTimeoutMillis(), TimeUnit.MILLISECONDS));
      } catch (InterruptedException e) {
        LOG.error("InterruptedException, ex={}", e);
        result.add(null);
      } catch (ExecutionException e) {
        LOG.error("ExecutionException, ex={}", e);
        result.add(null);
      } catch (TimeoutException e) {
        LOG.error("TimeoutException, ex={}", e);
        result.add(null);
      }
      index++;
    }
    return result;
  }


  /**
   * Shutdown void.
   */
  public void shutdown() {
    LOG.debug("Connection manager is shutting down");
    httpClient.getConnectionManager().shutdown();
    LOG.debug("Connection manager shut down");
  }

  /**
   * The type Idle connection monitor thread.
   *
   * @author jack.zhang
   */
  public class IdleConnectionMonitorThread extends Thread {
    private final ClientConnectionManager connMgr;
    private volatile boolean shutdown;

    /**
     * Instantiates a new Idle connection monitor thread.
     *
     * @param connMgr the conn mgr
     */
    public IdleConnectionMonitorThread(ClientConnectionManager connMgr) {
      super();
      this.connMgr = connMgr;
    }

    @Override
    public void run() {
      try {
        while (!shutdown) {
          synchronized (this) {
            wait(5000);
            // Close expired connections
            connMgr.closeExpiredConnections();
            // Optionally, close connections
            // that have been idle longer than 30 sec
            connMgr.closeIdleConnections(30, TimeUnit.SECONDS);
          }
        }
      } catch (InterruptedException ex) {
        LOG.warn("exception occur, " + ex.getMessage());
      }
    }

    /**
     * Shutdown void.
     */
    public void shutdown() {
      shutdown = true;
      synchronized (this) {
        notifyAll();
      }
    }
  }

}
