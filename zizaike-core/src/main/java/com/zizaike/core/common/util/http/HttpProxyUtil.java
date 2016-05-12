package com.zizaike.core.common.util.http;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 
 * ClassName: HttpProxyUtil <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: http请求代理工具类. <br/>
 * date: 2015年9月8日 下午2:00:07 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.6
 */

public class HttpProxyUtil {

  private static final String ENCODE_VALUE = "UTF-8";
  private static final int MAX_PER_ROUTE = 100;
  private static final int MAX_TOTAL = 100;
  private static final int DEFAULT_TIMEOUT = 200;
  private static final int TIMEOUT = 200;
  private HttpComponent httpComponent;

  /**
   * 带参数设置的HttpClient
   *
   * @param maxPerRoute 单个站点最大允许连接
   * @param maxTotal 最大允许连接数
   * @param connTimeout 连接超时时间
   * @param soTimeout 数据接收超时时间
   * @param staleConnCheck 是否进行陈旧连接检查, 如果不开启, 则启动陈旧连接关闭线程
   */
  public HttpProxyUtil(int maxPerRoute, int maxTotal, int connTimeout, int soTimeout,
      boolean staleConnCheck) throws Exception {
    httpComponent =
        new HttpComponent(maxPerRoute, maxTotal, connTimeout, soTimeout, staleConnCheck);

  }

  public HttpProxyUtil() throws Exception {
    this(MAX_PER_ROUTE, MAX_TOTAL, DEFAULT_TIMEOUT, TIMEOUT, true);
  }

  public JSONObject httpPost(String url, Map<String, String> params) throws IOException, Exception {
    List<NameValuePair> pair = new ArrayList<NameValuePair>();
    if (params != null) {
      for (Map.Entry<String, String> entry : params.entrySet()) {
        pair.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
      }
    }
    String json = JSONObject.toJSONString(params);
    StringEntity input = new StringEntity(json);
    input.setContentType("application/json;charset=UTF-8");
    HttpPost post = new HttpPost(url);
    post.setEntity(input);
    post.setHeader(new BasicHeader(HTTP.CONTENT_TYPE, "application/json;charset=UTF-8"));
    JSONObject result = httpComponent.executeWithLog(post, new JSONObjectResponseHandler());
    return result;

  }

  public JSONObject httpUrlPOST(String url, Map<String, String> params) throws IOException {
    List<NameValuePair> pair = new ArrayList<NameValuePair>();
    if (params != null) {
      for (Map.Entry<String, String> entry : params.entrySet()) {
        pair.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
      }
      url = url + "?" + URLEncodedUtils.format(pair, ENCODE_VALUE);
    }
    HttpPost post = new HttpPost(url);
    JSONObject result = httpComponent.executeWithLog(post, new JSONObjectResponseHandler());
    return result;
  }
  /**
   * 
   * httpPostXml:post xml. <br/>  
   *  
   * @author snow.zhang  
   * @param url
   * @param xml
   * @return
   * @throws IOException
   * @throws Exception  
   * @since JDK 1.7
   */
  public String httpPostXml(String url, String xml) throws IOException, Exception {
      StringEntity input = new StringEntity(xml, "UTF-8");
      //input.setContentType("text/xml; charset=UTF-8");
      HttpPost post = new HttpPost(url);
      post.setEntity(input);
      post.setHeader(new BasicHeader(HTTP.CONTENT_TYPE, "text/xml;charset=UTF-8"));
      String result = (String)httpComponent.executeUriRequestWithLog(post, new StringResponseHandler());
      return result;
      
  }

  public JSONObject httpPut(String url, Map<String, String> params) throws IOException {

    List<NameValuePair> pair = new ArrayList<NameValuePair>();
    if (params != null) {
      for (Map.Entry<String, String> entry : params.entrySet()) {
        pair.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
      }
    }
    HttpEntity entity = new UrlEncodedFormEntity(pair, ENCODE_VALUE);
    HttpPut put = new HttpPut(url);
    put.setEntity(entity);
    JSONObject result = httpComponent.executeWithLog(put, new JSONObjectResponseHandler());
    return result;
  }

  public JSONObject httpGet(String url) throws IOException {
    return httpGet(url, null);
  }

  public JSONObject httpGet(String url, Map<String, String> params) throws IOException {
    List<NameValuePair> pair = new ArrayList<NameValuePair>();
    if (params != null) {
      for (Map.Entry<String, String> entry : params.entrySet()) {
        pair.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
      }
      url = url + "?" + URLEncodedUtils.format(pair, ENCODE_VALUE);
    }
    HttpGet get = new HttpGet(url);
    JSONObject result = httpComponent.executeWithLog(get, new JSONObjectResponseHandler());
    return result;
  }

  public String httpGetXMl(String url, Map<String, String> params) throws IOException {
    List<NameValuePair> pair = new ArrayList<NameValuePair>();
    if (params != null) {
      for (Map.Entry<String, String> entry : params.entrySet()) {
        pair.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
      }
      url = url + "?" + URLEncodedUtils.format(pair, ENCODE_VALUE);
    }
    HttpGet get = new HttpGet(url);
    String result = (String)httpComponent.executeUriRequestWithLog(get, new StringResponseHandler());
    return result;
  }

  public JSONObject httpDel(String url) throws IOException {
    return httpDel(url, null);
  }

  public JSONObject httpDel(String url, Map<String, String> params) throws IOException {
    List<NameValuePair> pair = new ArrayList<NameValuePair>();
    if (params != null) {
      for (Map.Entry<String, String> entry : params.entrySet()) {
        pair.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
      }
      url = url + "?" + URLEncodedUtils.format(pair, ENCODE_VALUE);
    }
    HttpDelete del = new HttpDelete(url);
    JSONObject result = httpComponent.executeWithLog(del, new JSONObjectResponseHandler());
    return result;
  }

  private class JSONObjectResponseHandler implements ResponseHandler<JSONObject> {

    public static final int HTTP_UNSUCCESS_CODE = 200;

    @Override
    public JSONObject handleResponse(HttpResponse response) throws IOException {
      StatusLine statusLine = response.getStatusLine();
      HttpEntity entity = response.getEntity();
      if (statusLine.getStatusCode() > HTTP_UNSUCCESS_CODE) {
        String errMsg = EntityUtils.toString(entity);
        throw new HttpResponseException(statusLine.getStatusCode(), errMsg);
      }
      return handle(entity);
    }

    public JSONObject handle(HttpEntity entity) throws IOException {
      return JSON.parseObject(EntityUtils.toString(entity));
    }
  }
  private class StringResponseHandler implements ResponseHandler<String> {
      
      public static final int HTTP_UNSUCCESS_CODE = 200;
      
      @Override
      public String handleResponse(HttpResponse response) throws IOException {
          StatusLine statusLine = response.getStatusLine();
          HttpEntity entity = response.getEntity();
          if (statusLine.getStatusCode() > HTTP_UNSUCCESS_CODE) {
              String errMsg = EntityUtils.toString(entity);
              throw new HttpResponseException(statusLine.getStatusCode(), errMsg);
          }
          return EntityUtils.toString(entity);
      }
      
      public JSONObject handle(HttpEntity entity) throws IOException {
          return JSON.parseObject(EntityUtils.toString(entity));
      }
  }
}
