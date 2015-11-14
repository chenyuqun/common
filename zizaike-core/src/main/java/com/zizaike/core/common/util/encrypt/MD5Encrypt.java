package com.zizaike.core.common.util.encrypt;

import java.security.MessageDigest;

import org.slf4j.LoggerFactory;

/**
 * 
 * ClassName: MD5Encrypt <br/>  
 * Function:MD5加密类. <br/>  
 * date: 2015年11月14日 下午4:42:56 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public abstract class MD5Encrypt {
	
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MD5Encrypt.class);
	private static final Integer CHAR_LEN = 16;
	 private static final char[] HEX_DIGITS = { // 用来将字节转换成 16 进制表示的字符
	     '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
	/**
	 * 加密为MD5
	 * 
	 * @param source
	 * @return
	 * @throws RuntimeException 无法加密时,throw 该异常
	 */
	public static String encrypt(String source) {

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(source.getBytes("utf-8"));
			byte[] tmp = md.digest(); // MD5 的计算结果是一个 128 位的长整数，
			return HexUtil.encodeHexStr(tmp, true);

		} catch (Exception e) {
			LOGGER.error("md5 encrypt failed,source={0}", e,source);
			throw new RuntimeException("md5 encrypt failed", e);
		}
	}
	
	/**
	 * 
	 * encrypt2UpCase:MD加密后字符为大写形式. <br/>  
	 *  
	 * @author snow.zhang  
	 * @param source
	 * @return  
	 * @since JDK 1.7
	 */
	public static String encrypt2UpCase(String source) {
		String result = encrypt(source);
		return result == null ? null: result.toUpperCase();
	}
	

    /**
     * 加密为MD5
     * 
     * @param source
     * @return
     */
    public static String encoderForString(String source) {
        String s = null;

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(source.getBytes("utf-8"));
            byte[] tmp = md.digest(); // MD5 的计算结果是一个 128 位的长整数，
            // 用字节表示就是 16 个字节
            char[] str = new char[CHAR_LEN * 2]; // 每个字节用 16 进制表示的话，使用两个字符，
            // 所以表示成 16 进制需要 32 个字符
            int k = 0; // 表示转换结果中对应的字符位置
            for (int i = 0; i < CHAR_LEN; i++) { // 从第一个字节开始，对 MD5 的每一个字节
                // 转换成 16 进制字符的转换
                byte byte0 = tmp[i]; // 取第 i 个字节
                str[k++] = HEX_DIGITS[byte0 >>> 4 & 0xf]; // 取字节中高 4 位的数字转换,
                // >>> 为逻辑右移，将符号位一起右移
                str[k++] = HEX_DIGITS[byte0 & 0xf]; // 取字节中低 4 位的数字转换
            }
            s = new String(str); // 换后的结果转换为字符串

        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }


}
