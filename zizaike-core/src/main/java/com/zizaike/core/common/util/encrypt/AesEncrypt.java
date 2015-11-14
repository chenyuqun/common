package com.zizaike.core.common.util.encrypt;


import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Decoder;

/**
 * 
 * ClassName: AesEncrypt <br/>  
 * Function: AES加解密. <br/>  
 * date: 2015年11月14日 下午4:47:28 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
@SuppressWarnings("restriction")
public class AesEncrypt {
	public static String encrypt(String data,String key,String iv) throws Exception {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            int blockSize = cipher.getBlockSize();
  
            //byte[] dataBytes = data.getBytes("utf-8");
            byte[] dataBytes = data.getBytes();
            int plaintextLength = dataBytes.length;
            if (plaintextLength % blockSize != 0) {
                plaintextLength = plaintextLength + (blockSize - (plaintextLength % blockSize));
            }
  
            byte[] plaintext = new byte[plaintextLength];
            System.arraycopy(dataBytes, 0, plaintext, 0, dataBytes.length);
              
            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());
  
            cipher.init(Cipher.ENCRYPT_MODE, keyspec, ivspec);
            byte[] encrypted = cipher.doFinal(plaintext);
  
            return new sun.misc.BASE64Encoder().encode(encrypted);
  
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
  
    public static String desEncrypt(String data,String key,String iv) throws Exception {
        try
        { 
            byte[] encrypted1 = new BASE64Decoder().decodeBuffer(data);
              
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            SecretKeySpec keyspec = new SecretKeySpec(key.getBytes(), "AES");
            IvParameterSpec ivspec = new IvParameterSpec(iv.getBytes());
              
            cipher.init(Cipher.DECRYPT_MODE, keyspec, ivspec);
   
            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original);
            return originalString;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
