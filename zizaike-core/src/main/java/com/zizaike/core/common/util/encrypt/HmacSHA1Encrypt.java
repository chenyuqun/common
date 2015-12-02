package com.zizaike.core.common.util.encrypt;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * 
 * ClassName: HmacSHA1Encrypt <br/>
 * Function: 原始的Hmac SHA1 加密算法。加密值将转换为40位的16进制字符. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2015年11月14日 下午4:49:59 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public abstract class HmacSHA1Encrypt {

    private static final String CONTENT_CHARSET = "UTF-8";

    private static final String HMAC_ALGORITHM = "HmacSHA1";

    public static String encrypt(String secret, String source) {
        try {
            Mac mac = Mac.getInstance(HMAC_ALGORITHM);
            SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(CONTENT_CHARSET), mac.getAlgorithm());

            mac.init(secretKey);
            byte[] hash = mac.doFinal(source.getBytes(CONTENT_CHARSET));
            return HexUtil.encodeHexStr(hash, false);
        } catch (Exception e) {
            throw new RuntimeException("hmacSHA1 encrypt failed", e);
        }
    }

}
