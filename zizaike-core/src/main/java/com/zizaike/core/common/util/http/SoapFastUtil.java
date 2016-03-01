package com.zizaike.core.common.util.http;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 
 * ClassName: SoapFastUtil <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: SOAP的公共方法调用 <br/>
 * date: 2015年3月9日 下午1:40:33 <br/>
 * 
 * @author bin.zhang
 * @version
 * @since JDK 1.6
 */
public class SoapFastUtil {
  private static Logger logger = LoggerFactory.getLogger(SoapFastUtil.class);
  public static String soap_pref = "soap_template";
  private HttpProxyUtil httpProxy;
  public SoapFastUtil(HttpProxyUtil httpProxyUtil) {
      this.httpProxy = httpProxyUtil;
}
  /**
   * 发送http post请求soap服务
   * 
   * @param urlString
   * @param methodName
   * @param header
   * @param search
   * @return
   * @throws Exception
   */
  public  String post(Map model, String prefix, String template, String url, String SOAPAction)
      throws Exception {
    long date = System.currentTimeMillis();
    // 如果有目录则加上目录,没有目录就是在根目录下
    String dir = prefix.equals("") ? template : prefix + "/" + template;
    String templatePath = VelocityUtils.class.getClassLoader().getResource(dir).getFile();
    logger.debug("templatePath:" + templatePath);
    String filePath = VelocityUtils.class.getClassLoader().getResource("").getFile();
    filePath += template + date;
    String xmlReqeust = VelocityUtils.getSOAPRequest(model, filePath, templatePath);
    logger.debug("xmlReqeust:" + xmlReqeust);
   String result =  httpProxy.httpPostXml(url, xmlReqeust);
    return result;
  }

  /**
   * 发送http post请求soap服务
   * 
   * @param urlString
   * @param methodName
   * @param header
   * @param search
   * @return
   * @throws Exception
   */
  public static String post(String paramXml, URL url, String SOAPAction) throws Exception {
    long date = System.currentTimeMillis();
    // 如果有目录则加上目录,没有目录就是在根目录下
    logger.debug("xmlReqeust:" + paramXml);
    HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
    byte[] buf = paramXml.getBytes();
    httpConn.setRequestProperty("Content-Length", String.valueOf(buf.length));
    httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
    httpConn.setRequestProperty("soapActionString", SOAPAction);
    httpConn.setRequestMethod("POST");
    httpConn.setDoOutput(true);
    httpConn.setDoInput(true);
    OutputStream out = httpConn.getOutputStream();
    out.write(buf);
    out.close();
    byte[] datas = readInputStream(httpConn.getInputStream());
    String result = new String(datas);
    httpConn.disconnect();
    logger.debug("result:" + result);
    return result;
  }

  /**
   * 从输入流中读取数据
   * 
   * @param inStream
   * @return
   * @throws Exception
   */
  public static byte[] readInputStream(InputStream inStream) throws Exception {
    ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    byte[] buffer = new byte[1024];
    int len = 0;
    while ((len = inStream.read(buffer)) != -1) {
      outStream.write(buffer, 0, len);
    }
    byte[] data = outStream.toByteArray();// 网页的二进制数据
    outStream.close();
    inStream.close();
    return data;
  }

}
