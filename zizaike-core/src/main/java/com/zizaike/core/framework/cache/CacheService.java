package com.zizaike.core.framework.cache;

import java.util.Collection;
import java.util.List;

/**
 * 
 * ClassName: CacheService <br/>
 * Function: 缓存服务. <br/>
 * Reason: 缓存服务. <br/>
 * date: 2015年11月7日 下午5:39:05 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public interface CacheService {

    /**
     * 
     * get:获取指定key的. <br/>
     * 
     * @author snow.zhang
     * @param prefix 前缀
     * @param key 键
     * @param clazz
     * @return
     * @since JDK 1.7
     */
    <T> T get(CacheKeyPrefix prefix, String key, Class<T> clazz);

    /**
     * 
     * gets:批量获取. <br/>  
     *  
     * @author snow.zhang  
     * @param prefix
     * @param keys
     * @param clazz
     * @return  
     * @since JDK 1.7
     */
    <T> List<T> gets(CacheKeyPrefix prefix, Collection<String> keys, Class<T> clazz);

    
    /**
     * 
     * set:设置对象，不同实现对序列化实现有不同方式. <br/>  
     *  
     * @author snow.zhang  
     * @param prefix
     * @param key
     * @param value  缓存对象，对于不同的缓存实现，对对象有不同要求，比如Memcached需要对象实现序列化接口，具体参见不同子类
     * @since JDK 1.7
     */
    void set(CacheKeyPrefix prefix, String key, Object value);

    
    /**
     * 
     * set:设置指定过期时间的对象，不同实现对序列化实现有不同方式. <br/>  
     *  
     * @author snow.zhang  
     * @param prefix
     * @param key
     * @param value 缓存对象，对于不同的缓存实现，对对象有不同要求，比如Memcached需要对象实现序列化接口，具体参见不同子类
     * @param expiresIn  
     * @since JDK 1.7
     */
    void set(CacheKeyPrefix prefix, String key, Object value, int expiresIn);

    /**
     * 
     * delete: 删除键. <br/>  
     *  
     * @author snow.zhang  
     * @param prefix
     * @param key  
     * @since JDK 1.7
     */
    void delete(CacheKeyPrefix prefix, String key);

    /****
     * 获取Key剩余有效时间。
     * 
     * @author snow.zhang
     * @param prefix 前缀
     * @param key 键
     * @return int 失效时间，单位秒 当 key 不存在或没有设置生存时间时，返回 -1
     */
    int getKeyExpiresIn(CacheKeyPrefix prefix, String key);

    /****
     * 判断键是否存在
     * 
     * @author snow.zhang
     *
     * @param prefix 前缀
     * @param key 键
     * @return boolean 存在返回<code>true</code>，不存在返回<code>false</code>
     */
    boolean exist(CacheKeyPrefix prefix, String key);

}
