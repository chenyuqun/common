package com.zizaike.core.common.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 
 * ClassName: ReflectionUtils <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: 反射. <br/>  
 * date: 2015年11月4日 下午3:47:06 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public class ReflectionUtils {

    /**
     * 通过反射获取T类型
     * 
     * @param 传入类型
     * @return 返回泛型中第一个类型
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static <T> Class<T> getSuperClassGenericType(final Class clazz) {
        return getSuperClassGenricType(clazz, 0);
    }

    /**
     * 
     * @param clazz
     * @param index 默认为0
     * @return 返回泛型中的类型
     */
    @SuppressWarnings({ "rawtypes" })
    public static Class getSuperClassGenricType(final Class clazz, final int index) {

        Type genType = clazz.getGenericSuperclass();// 获取父类

        if (!(genType instanceof ParameterizedType)) {
            return Object.class;
        }

        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();// 获取父类的泛型

        if (index >= params.length || index < 0) {
            return Object.class;
        }
        if (!(params[index] instanceof Class)) {
            return Object.class;
        }

        return (Class) params[index];
    }

}