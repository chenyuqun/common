package com.zizaike.core.framework.cache;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.alibaba.fastjson.TypeReference;
import com.zizaike.core.framework.exception.ZZKServiceException;

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
public interface CacheDao {

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
    <T> T get(CacheKeyPrefix prefix, String key, Class<T> clazz) throws ZZKServiceException;

    /**
     * 
     * get:引用类型. <br/>
     * 
     * @author snow.zhang
     * @param prefix
     * @param key
     * @param reference
     * @return
     * @throws ZZKServiceException
     * @since JDK 1.7
     */
    <T> T get(CacheKeyPrefix prefix, String key, TypeReference<T> reference) throws ZZKServiceException;

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
    <T> List<T> gets(CacheKeyPrefix prefix, Collection<String> keys, Class<T> clazz) throws ZZKServiceException;

    /**
     * 
     * set:设置对象，不同实现对序列化实现有不同方式. <br/>
     * 
     * @author snow.zhang
     * @param prefix
     * @param key
     * @param value 缓存对象，对于不同的缓存实现，对对象有不同要求，比如Memcached需要对象实现序列化接口，具体参见不同子类
     * @since JDK 1.7
     */
    void set(CacheKeyPrefix prefix, String key, Object value) throws ZZKServiceException;

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
    void setEx(CacheKeyPrefix prefix, String key, Object value, int seconds) throws ZZKServiceException;

    /**
     * 
     * delete: 删除键. <br/>
     * 
     * @author snow.zhang
     * @param prefix
     * @param key
     * @since JDK 1.7
     */
    Long delete(CacheKeyPrefix prefix, String key) throws ZZKServiceException;

    /****
     * 获取Key剩余有效时间。
     * 
     * @author snow.zhang
     * @param prefix 前缀
     * @param key 键
     * @return int 失效时间，单位秒 当 key 不存在或没有设置生存时间时，返回 -1
     */
    Long getKeyExpiresIn(CacheKeyPrefix prefix, String key) throws ZZKServiceException;

    /****
     * 判断键是否存在
     * 
     * @author snow.zhang
     *
     * @param prefix 前缀
     * @param key 键
     * @return boolean 存在返回<code>true</code>，不存在返回<code>false</code>
     */
    boolean exist(CacheKeyPrefix prefix, String key) throws ZZKServiceException;

    /**
     * 有序集合元素自增长
     * 
     * @param prefix
     * @param key
     * @param score
     * @param member
     * @throws ZZKServiceException
     */
    void zincrby(CacheKeyPrefix prefix, String key, double score, String member) throws ZZKServiceException;

    /**
     * 得到 top 有序集合元素
     * 
     * @param prefix
     * @param key
     * @param start
     * @param end
     * @return
     */
    Set zrevrangeWithScores(CacheKeyPrefix prefix, String key, long start, long end) throws ZZKServiceException;
}
