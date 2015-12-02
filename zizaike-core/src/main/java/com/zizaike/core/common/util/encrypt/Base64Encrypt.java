package com.zizaike.core.common.util.encrypt;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * ClassName: Base64Encrypt <br/>
 * Function: Base64 加密解密. <br/>
 * date: 2015年11月14日 下午4:48:15 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
@SuppressWarnings("restriction")
public abstract class Base64Encrypt {
    private static final Logger LOG = LoggerFactory.getLogger(AesEncrypt.class);

    /**
     * base64编码的解码器
     * 
     * @param source
     * @return
     */
    public static final String decode(String source) {
        byte[] buff = decode(source.getBytes());
        return new String(buff);
    }

    public static final byte[] decode(byte[] source) {
        if (source == null) {
            return null;
        }
        byte[] b = Base64.decodeBase64(new java.io.ByteArrayInputStream(source).toString());
        return b;
    }
    /**
     * 
     * encode:编. <br/>  
     * @author snow.zhang  
     * @param sourceStr
     * @return  
     * @since JDK 1.7
     */
    public static final String encode(String sourceStr) {
        return encode(sourceStr.getBytes());
    }

    /**
     * base64编码的编码器
     * 
     * @param source
     * @return
     */
    public static final String encode(byte[] source) {
        if (source == null) {
            return null;
        }
        return Base64.encodeBase64String(source);
    }

}
