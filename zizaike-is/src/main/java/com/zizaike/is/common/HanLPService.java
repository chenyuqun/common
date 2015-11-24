/**  
 * Project Name:common-service  <br/>
 * File Name:HanLP.java  <br/>
 * Package Name:com.zizaike.common  <br/>
 * Date:2015年11月20日下午8:52:58  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.is.common;  
/**  
 * ClassName:HanLPService <br/>  
 * Function: 简体转换服务. <br/>  
 * Date:     2015年11月20日 下午8:52:58 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public interface  HanLPService{
    /**
     * 
     * convertToTraditionalChinese:简体转繁体. <br/>  
     *  
     * @author snow.zhang  
     * @param str
     * @return  
     * @since JDK 1.7
     */
    String convertToTraditionalChinese(String str);
    /**
     * 
     * convertToSimplifiedChinese:繁体转简体. <br/>  
     *  
     * @author snow.zhang  
     * @param str
     * @return  
     * @since JDK 1.7
     */
    String convertToSimplifiedChinese(String str);
}
  
