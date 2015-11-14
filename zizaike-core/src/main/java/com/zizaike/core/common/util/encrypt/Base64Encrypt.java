package com.zizaike.core.common.util.encrypt;


import java.io.IOException;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
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
	/**
	 * base64编码的解码器
	 * 
	 * @param source
	 * @return
	 */
	public static final String decode(String source) {
		if (source == null) {
			return null;
		}
		try {
			byte[] buff = new BASE64Decoder().decodeBuffer(source);
			return new String(buff);
		} catch (IOException e) {
		}
		return null;
	}



	/**
	 * base64编码的解码器
	 * 
	 * @param source
	 * @return
	 */
	public static final byte[] decode(byte[] source) {
		if (source == null) {
			return null;
		}
		try {
			return new BASE64Decoder()
					.decodeBuffer(new java.io.ByteArrayInputStream(source));
		} catch (IOException e) {
		}
		return null;
	}

	/**
	 * base64编码的编码器
	 * 
	 * @param source
	 * @return
	 */
	public static final String encode(String source) {
		if (source == null) {
			return null;
		}
		return new BASE64Encoder().encode(source.getBytes());
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
		return new BASE64Encoder().encode(source);
	}
	
}
