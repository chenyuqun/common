package com.zizaike.core.common.util.sign;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zizaike.core.common.util.encrypt.MD5Encrypt;

/**
 * 
 * ClassName: SignUtil <br/>
 * Function: 提供对接口调用过程中参数验签相关方法. <br/>
 * date: 2015年11月14日 下午4:50:52 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public class SignUtil {
    public static final String API_KEY = "apiKey";
    public static final String API_SIGN = "apiSign";
    public static final String API_SECRET = "apiSecret";
    private static final Logger LOG = LoggerFactory.getLogger(SignUtil.class);

    /**
     * 
     * 功能描述：对参数进行加密得到验签结果 输入参数：<按照参数定义顺序>
     * 
     * @param params 参数列表map,不包含api_sign关键字；若传递了，则会去除在加密
     * @param apiSecret 加密密钥 返回值: 类型 <说明>
     * @return 加密后的字符串
     * @throw 异常描述
     */
    public static String getSign(Map<String, String> params, String apiSecret) {
        String sign = "";
        if (params.containsKey(API_SIGN)) {
            params.remove(API_SIGN);
        }
        sign = signParamValue(params, apiSecret);
        return sign;

    }

    /**
     * MD5签名
     * 
     * @param params
     * @param apiSecret
     * @return
     */
    private static String signParamValue(Map<String, String> params, String apiSecret) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> sortParams = sortMap(params);
        for (Map.Entry<String, String> entry : sortParams.entrySet()) {
            if (StringUtils.isBlank(entry.getKey()) || StringUtils.isBlank(entry.getValue())) {
                continue;
            }
            sb.append(entry.getValue());
        }
        sb.append(apiSecret);
        String strParam = sb.toString();
        String result = MD5Encrypt.encrypt(strParam);
        return result;
    }

    /**
     * 
     * sortMap:TreeMap 对map进行排序处理. <br/>
     * 
     * @author snow.zhang
     * @param oParam
     * @return
     * @since JDK 1.7
     */
    private static Map<String, String> sortMap(Map<String, String> oParam) {

        if (oParam instanceof TreeMap) {
            return oParam;
        } else {
            Map<String, String> params = new TreeMap<String, String>();
            for (Entry<String, String> e : oParam.entrySet()) {
                params.put(e.getKey(), e.getValue());
            }
            return params;
        }
    }

   /**
    * 
    * mapToStr:功能描述：将map转成url参数方式：key1=value1&key2=value2. <br/>  
    *  
    * @author snow.zhang  
    * @param paramMap
    * @return  
    * @since JDK 1.7
    */
    public static String mapToStr(Map<String, String> paramMap) {
        StringBuffer buffer = new StringBuffer();
        for (Entry<String, String> e : paramMap.entrySet()) {
            if (StringUtils.isBlank(e.getKey()) || StringUtils.isBlank(e.getValue())) {
                continue;
            }
            buffer.append(e.getKey() + "=" + e.getValue());
            buffer.append("&");
        }
        buffer.deleteCharAt(buffer.length() - 1);
        return buffer.toString();
    }
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("service", "order.updateOrderStatus");
        map.put("field", "id");
        map.put("user_token", "32423424");
        map.put("apiKey", "6cd0f0bd288704f76711ff404f82c06c");
        String apiSecret = "888888";
        String signResult = SignUtil.getSign(map, apiSecret);
        LOG.info(signResult);

    }
}
