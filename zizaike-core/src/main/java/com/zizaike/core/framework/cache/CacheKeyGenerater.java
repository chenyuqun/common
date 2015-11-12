package com.zizaike.core.framework.cache;

import org.apache.commons.lang3.StringUtils;





/**
 * 
 * ClassName: CacheKeyGenerater <br/>  
 * Function: 缓存Key生成器. <br/>  
 * date: 2015年11月9日 上午9:47:44 <br/>  
 *  
 * @author snow.zhang  
 * @version  
 * @since JDK 1.7
 */
public abstract class CacheKeyGenerater {
	protected static final String SPLIT_CHAR = ":";
	
	/**
	 * 
	 * generateCacheKey:生成缓存key. <br/>  
	 *  
	 * @author snow.zhang  
	 * @param prefix
	 * @param keys
	 * @return  
	 * @since JDK 1.7
	 */
	public static String generateCacheKey(CacheKeyPrefix prefix,Object ... keys){
		
		if(prefix == null || keys == null){
			throw new IllegalArgumentException("prefix or keys is null");
		}
		StringBuilder sb = new StringBuilder();
        if(StringUtils.isNotEmpty(prefix.getPrefix())){
		    sb.append(prefix.getPrefix());
		    sb.append(SPLIT_CHAR);
        }
		for(Object key:keys){
			sb.append(key).append(SPLIT_CHAR);
		}
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}
	
	/**
	 * 
	 * generateCacheKeyBytes:生成缓存key. <br/>  
	 *  
	 * @author snow.zhang  
	 * @param prefix
	 * @param keys
	 * @return  
	 * @since JDK 1.7
	 */
	public static byte[] generateCacheKeyBytes(CacheKeyPrefix prefix,Object ... keys){
		
		return generateCacheKey(prefix, keys).getBytes();
	}
}
