package com.zizaike.core.common.ranslator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * ClassName: Translate <br/>  
 * Function: 翻译注解. <br/>  
 * date: 2015年11月21日 下午4:25:51 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) 
public @interface Translate {
    
}