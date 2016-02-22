package com.zizaike.core.common.util.http;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zizaike.core.common.collection.CollectionUtil;

public class HttpRequest<T> implements Serializable {

  public static final String UTF8 = "UTF-8";

  /**
   * * 请求方法
   *
   * @author snow.zhang
   * @since 2014年5月27日
   */
  public static enum RequestMethod {
    GET, POST, PUT, DELETE;

  }

  /**
   * * 请求参数
   *
   * @author bin.zhang
   * @since 2014年5月14日
   */
  public static class RequestParameter implements org.apache.http.NameValuePair,
      org.apache.http.Header {

    private String name;

    private String value;

    @Override
    public HeaderElement[] getElements() throws ParseException {
      return null;
    }

    @Override
    public String getName() {
      return name;
    }

    @Override
    public String getValue() {
      return value;
    }

    public RequestParameter(String name, String value) {
      super();
      this.name = name;
      this.value = value;
    }


  }

  /**
   * 请求方法 **
   */
  private RequestMethod method;

  /**
   * 请求URI **
   */
  private URI uri;

  /**
   * 编码方式**
   */
  private String charset = UTF8;

  private ContentType contentType = ContentType.APPLICATION_FORM_URLENCODED;

  /**
   * HTTP 请求体**
   */
  private HttpEntity httpEntity;

  /**
   * 是否为Json请求，设为true，请求内容类型将会设置为application/json**
   */
  private boolean isJsonRequest = false;

  /**
   * 处理handler**
   */
  private ResponseHandler<T> responseHandler;

  /**
   * 超时时间, 毫秒级**
   */
  private int timeoutMillis = 200;

  /**
   * 请求头 **
   */
  private List<RequestParameter> headers = CollectionUtil.newArrayList();

  /**
   * 请求参数 **
   */
  private Map<String, RequestParameter> parameters = CollectionUtil.newHashMap();

  public ResponseHandler<T> getResponseHandler() {
    return responseHandler;
  }

  public HttpRequest<T> setResponseHandler(ResponseHandler<T> responseHandler) {
    this.responseHandler = responseHandler;
    return this;
  }

  protected HttpRequest(URI uri, RequestMethod method, String charset) {
    this.uri = uri;
    this.method = method;
    if (Charset.isSupported(charset)) {
      this.charset = charset;
    }
  }

  /**
   * * 创建GET请求
   *
   * @param uri
   * @return
   */
  public static <T> HttpRequest<T> createGetRequest(String uri, Object... pathParam) {
    return createRequest(uri, RequestMethod.GET, UTF8, pathParam);
  }


  /**
   * * 创建GET请求
   *
   * @param uri
   * @return
   * @author bin.zhang
   * @since 2014年5月27日
   */
  public static <T> HttpRequest<T> createGetRequest(URI uri) {
    return createRequest(uri, RequestMethod.GET, UTF8);
  }

  /**
   * * 创建POST请求
   *
   * @param uri
   * @param charset
   * @return
   */
  public static <T> HttpRequest<T> createPostRequest(String uri, String charset,
      Object... pathParam) {
    return createRequest(uri, RequestMethod.POST, charset, pathParam);
  }

  /**
   * * 创建POST请求
   *
   * @param uri
   * @param charset
   * @return
   */
  public static <T> HttpRequest<T> createPostRequest(URI uri, String charset) {
    return createRequest(uri, RequestMethod.POST, charset);
  }

  /**
   * * 创建指定Method的请求
   *
   * @param uri
   * @param method
   * @param charset
   * @return
   */
  public static <T> HttpRequest<T> createRequest(URI uri, RequestMethod method, String charset) {
    return new HttpRequest(uri, method, charset);
  }

  /**
   * * 创建指定Method的请求
   *
   * @param uri 请求URI，如果是REST URI，like ${userId}支持path参数替换
   * @param method 请求方法
   * @param charset 字符集
   * @param pathParam path参数
   * @return
   */
  public static <T> HttpRequest<T> createRequest(String uri, RequestMethod method, String charset,
      Object... pathParam) {
    return createRequest(createURI(uri, pathParam), method, charset);
  }


  private static URI createURI(String uri2, Object[] pathParam) {
    if (pathParam != null && pathParam.length > 0) {
      uri2 = java.text.MessageFormat.format(uri2, pathParam);
    }
    return URI.create(uri2);
  }

  /**
   * *
   *
   * @param name
   * @param value
   * @return
   * @author bin.zhang
   * @since 2014年5月27日
   */
  public HttpRequest addHeader(String name, String value) {
    this.headers.add(new RequestParameter(name, value));
    return this;
  }

  /**
   * *
   *
   * @param name
   * @param value
   * @return
   */
  public HttpRequest addParameter(String name, String value) {
    this.parameters.put(name, new RequestParameter(name, value));
    return this;
  }

  /**
   * * 支持JavaBean使用JSONField注解. 目前，ignore只对普通JavaBean其作用
   *
   * @param paramter
   * @param ignore
   * @return
   */
  public HttpRequest addParameters(Object paramter, String... ignore) {
    if (paramter == null) {
      throw new NullPointerException("paramter could not null");
    }
    // Class clazz = paramter.getClass();
    // if(clazz.isArray() || )
    if (paramter != null) {
      Object object = JSON.toJSON(paramter);
      if (object instanceof JSONObject) {
        JSONObject jsonObject = (JSONObject) object;
        Set<String> keySet = jsonObject.keySet();
        for (String key : keySet) {
          String value = jsonObject.getString(key);
          if (StringUtils.isBlank(key) || StringUtils.isBlank(value)) {
            continue;
          }
          if (ignore != null && ArrayUtils.contains(ignore, key)) {
            continue;
          }
          addParameter(key, value);
        }
      } else if (object instanceof JSONArray) {
      }
    }
    return this;
  }

  /**
   * * 以MAP形式添加参数
   *
   * @param paramterMap
   * @param ignore
   * @return
   * @author bin.zhang
   * @since 2014年5月27日
   */
  public HttpRequest addParameters(Map<String, String> paramterMap, String... ignore) {
    if (paramterMap != null) {
      for (Entry<String, String> entry : paramterMap.entrySet()) {
        if (StringUtils.isBlank(entry.getKey()) || StringUtils.isBlank(entry.getValue())) {
          continue;
        }
        if (ignore != null && ArrayUtils.contains(ignore, entry.getKey())) {
          continue;
        }
        this.addParameter(entry.getKey(), entry.getValue());
      }
    }
    return this;
  }

  /**
   * * 批量添加请求参数
   *
   * @param parameters
   * @return
   */
  public HttpRequest<T> addParameters(Collection<RequestParameter> parameters) {
    // this.parameters.addAll(parameters);
    return this;
  }


  public RequestMethod getMethod() {
    return method;
  }

  public String getCharset() {
    return charset;
  }

  public List<RequestParameter> getHeaders() {
    return headers;
  }

  public Collection<RequestParameter> getParameters() {
    return parameters.values();
  }


  public ContentType getContentType() {
    return contentType;
  }

  public HttpRequest<T> setContentType(String contentType) {
    this.contentType = ContentType.create(contentType, charset);
    // this.contentType = contentType;
    return this;
  }

  public HttpEntity getHttpEntity() {
    return httpEntity;
  }

  public HttpRequest<T> setHttpEntity(HttpEntity httpEntity) {
    this.httpEntity = httpEntity;
    return this;
  }

  public URI getUri() {
    return uri;
  }

  public boolean isJsonRequest() {
    return isJsonRequest;
  }

  /*
   * public HttpRequest setJsonRequest(boolean isJsonRequest) { this.isJsonRequest = isJsonRequest;
   * addHeader("Content-Type", "application/json;charset="+charset); return this; }
   */

  public HttpUriRequest createHttpUriRequest() {
    HttpUriRequest request = null;
    switch (method) {
      case GET:
        request = new HttpGet(uri);
        break;
      case POST:
        request = new HttpPost(uri);
        // request.setParams(arg0);
        break;
      case DELETE:
        request = new HttpDelete(uri);
        break;
      case PUT:
        request = new HttpPut(uri);
        break;
      default:
        throw new UnsupportedOperationException("unsupported method now");
    }
    if (headers.size() > 0) {
      for (RequestParameter header : headers) {
        request.addHeader(header.name, header.value);
      }
    }

    // request.s
    if (parameters != null && parameters.size() > 0) {
      if (request instanceof HttpEntityEnclosingRequest) {
        HttpEntityEnclosingRequest httpEntityEnclosingRequest =
            (HttpEntityEnclosingRequest) request;
        try {
          if (httpEntity != null) {
            httpEntityEnclosingRequest.setEntity(httpEntity);
          } else {
            List<NameValuePair> list = new ArrayList<NameValuePair>(parameters.values());
            httpEntityEnclosingRequest.setEntity(new UrlEncodedFormEntity(list, getCharset()));
          }
        } catch (UnsupportedEncodingException e) {
          // TODO Auto-generated catch block
          // e.printStackTrace();
          // throw new SystemE
        }
      }
    }
    request.addHeader("contentType", contentType.toString());
    return request;
  }

  public int getTimeoutMillis() {
    return timeoutMillis;
  }

  public void setTimeoutMillis(int timeoutMillis) {
    this.timeoutMillis = timeoutMillis;
  }

  /**
     *
     */
  private static final long serialVersionUID = 1876778722478477053L;

}
