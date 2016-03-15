/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:OrderStatus.java  <br/>
 * Package Name:com.zizaike.entity.order.response  <br/>
 * Date:2016年2月27日下午4:39:51  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.order.response;  
/**  
 * ClassName:OrderStatus <br/>  
 * Function: 订单状态. <br/>  
 * Date:     2016年2月27日 下午4:39:51 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class OrderStatus {
    /**
     * 发送中
     */
    public static final int SENGIND = 0;
    /**
     * 已发送
     */
    public static final int SENDED = 1;
    /**
     * 发送失败
     */
    public static final int SEND_FAILURE = 2;
    /**
     * 酒店确认成功
     */
    public static final int HOTEL_CONFIRM_SUCCESS = 3;
    /**
     * 酒店拒绝
     */
    public static final int HOTEL_REFUSE = 4;
    /**
     * 其他
     */
    public static final int OTHER = 5;
    /**
     * 订单不存在
     */
    public static final int ORDER_NO_EXIST = 6;
}
  
