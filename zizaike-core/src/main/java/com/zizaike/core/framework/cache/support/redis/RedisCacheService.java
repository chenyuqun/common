package com.zizaike.core.framework.cache.support.redis;

import java.util.List;
import java.util.Map;

import com.zizaike.core.framework.cache.CacheKeyPrefix;
import com.zizaike.core.framework.cache.CacheService;
import com.zizaike.core.framework.cache.CounterService;

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
public interface RedisCacheService extends CacheService, CounterService {

    /****
     * <p>
     * resource暴露方法，通过暴露resource对象，调用者获得了足够的自由区操作Redis底层的资源。<br>
     * 调用者，无需关心池化的资源return的问题。<br>
     * 具体生成的resource，以配置的pool类型为准<br>
     * {@code JedisPool}生成的resource为Jedis对象<br>
     * {@code ShardedJedisPool}生成的resource为ShardJedis对象<br>
     * 
     * @author snow.zhang
     *
     * @return
     */
    Object doWithJedisCommands(JedisCommandsCallback jedisCommandsCallback);

    /***
     * hash set
     * 
     * @author snow.zhang
     *
     * @param prefix 键前缀
     * @param key 键
     * @param value 值
     */
    void hset(CacheKeyPrefix prefix, String key, String field, String value);

    /****
     * 
     * @author snow.zhang
     *
     * @param prefix
     * @param key
     * @param field
     * @return
     */
    String hget(CacheKeyPrefix prefix, String key, String field);

    /****
     * 
     * @author snow.zhang
     * @since 2014年5月20日
     *
     * @param prefix
     * @param key
     * @param field
     */
    void hdel(CacheKeyPrefix prefix, String key, String field);

    boolean hexist(CacheKeyPrefix prefix, String key, String field);
    void hmset(CacheKeyPrefix prefix, String key, Object javaBean, String... ignoreFields);
    void hmset(CacheKeyPrefix prefix, String key, Map<String, String> value);

    /****
     * 
     * @author snow.zhang
     *
     * @param prefix
     * @param key
     * @param fields
     * @return
     */
    List<String> hmget(CacheKeyPrefix prefix, String key, String... fields);

    // ///事务相关
    /**
     * 监测，加上乐观锁
     * 
     * @param prefix
     * @param key
     */
    void watch(CacheKeyPrefix prefix, String key);

    /**
     * 取消监测
     * 
     * @param prefix
     * @param key
     */
    void unwatch(CacheKeyPrefix prefix, String key);

    /**
     * 事务中，倒累加器
     * 
     * @param counter
     */
    Object decrByMulti(String counter);

    /**
     * 事务中，倒累加器，增加乐观锁
     * 
     * @param counter
     */
    Object decrByWatchedMulti(String counter);

    Object rpushPipelined(CacheKeyPrefix prefix, String key, List<Object> value);

    Object rpush(CacheKeyPrefix prefix, String key, Object value);

    Object lpop(CacheKeyPrefix prefix, String key);

    Object llen(CacheKeyPrefix prefix, String key);

    Object ltrim(CacheKeyPrefix prefix, String key, long start, long end);


    Object ping();


}