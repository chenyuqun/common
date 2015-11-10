package com.zizaike.core.framework.cache.support.redis;

import com.zizaike.core.framework.cache.CacheDao;
import com.zizaike.core.framework.cache.CounterDao;

/**
 * 
 * ClassName: RedisCacheService <br/>
 * Function: snow.zhang. <br/>
 * date: 2015年11月7日 下午5:51:32 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public interface RedisCacheDao extends CacheDao, CounterDao {


    Object ping();


}