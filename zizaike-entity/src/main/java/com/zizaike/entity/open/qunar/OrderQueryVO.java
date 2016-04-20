package com.zizaike.entity.open.qunar;

/**
 * Project Name: code <br/>
 * Function:OrderQueryVO. <br/>
 * date: 2016/4/19 17:56 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
public class OrderQueryVO {
    /**
     * 1个或者多个订单号，最多100个，例如j3gm141219163017759,j3gm141219163017760
     */
    private String orderNums;
    /**
     * hmac = md5(signKey || orderNums)，32位，小写，||为连接符。例如：signKey=asdf, orderNums=xxxx, hmac = md5(asdfxxxx)
     */
    private String hmac;

    public String getOrderNums() {
        return orderNums;
    }

    public void setOrderNums(String orderNums) {
        this.orderNums = orderNums;
    }

    public String getHmac() {
        return hmac;
    }

    public void setHmac(String hmac) {
        this.hmac = hmac;
    }
}
