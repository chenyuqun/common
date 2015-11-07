package com.zizaike.core.framework.cache;

/**
 * 
 * ClassName: CounterService <br/>
 * Function: 计数服务. <br/>
 * date: 2015年11月7日 下午5:48:04 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public interface CounterService {
    /**
     * 
     * ClassName: Counter <br/>
     * Function: 计数类. <br/>
     * date: 2015年11月7日 下午5:48:36 <br/>
     * 
     * @author snow.zhang
     * @version CounterService
     * @since JDK 1.7
     */
    enum Counter implements CacheKeyPrefix {
        Counter;

        @Override
        public String getPrefix() {
            return "Counter";
        }

    }

    /****
     * 初始化计数器. 计数器已存在时，将重置计数器。
     * 
     * @author snow.zhang
     *
     * @param counter 计数器名称
     * @param value 初始化值
     * @return long 初始化值
     */
    long initCounter(String counter, long value);

    /****
     * 初始化指定失效时间的计数器. 计数器已存在时，将重置计数器。
     * 
     * @author snow.zhang
     *
     * @param counter 计数器名称
     * @param value 计数器初始化值
     * @param expiresIn 过期时间，单位秒
     * @return long 初始化值
     */
    long initCounter(String counter, long value, int expiresIn);

    /****
     * 获得计数器
     * 
     * @author snow.zhang
     *
     * @param counter 计数器名称
     * @return long 计数器值，计数器不存在时返回 -1
     */
    long getCounter(String counter);

    /****
     * 计数器+1
     * 
     * @author snow.zhang
     *
     * @param counter 计数器名称
     * @return long 计数器增加后值，计数器不存在时，返回-1
     */
    long incr(String counter);

    /****
     * 计数器加指定值
     * 
     * @author snow.zhang
     *
     * @param counter 基数器名称
     * @param incrBy 增加值，计数器不存在时，设置为指定值
     * @return long 计数器增加后值
     */
    long incrBy(String counter, long incrBy);

    /****
     * 删除计数器
     * 
     * @author snow.zhang
     *
     * @param counter 计数器名称
     */
    void deleteCounter(String counter);

    /***
     * 计数器减1
     * 
     * @author snow.zhang
     *
     * @param counter
     * @return
     * @throws SystemException
     */
    long decr(String counter);

    /****
     * 计数器减指定值
     * 
     * @author snow.zhang
     *
     * @param counter
     * @param decrBy
     * @return
     * @throws SystemException
     */
    long decrBy(String counter, long decrBy);

}
