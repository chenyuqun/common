package com.zizaike.core.framework.cache.support.redis;



/**
 * 
 * ClassName: JedisCommandsCallback <br/>  
 * Function: 执行Jedis命令. <br/>  
 * date: 2015年11月7日 下午5:53:01 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public interface JedisCommandsCallback {
	
	/****
	 * 执行Jedis命令
	 * @author snow.zhang
	 *
	 * @param pool
	 * @return
	 */
	Object executeWithJedisCommonds(Object jedisCommands);
}
