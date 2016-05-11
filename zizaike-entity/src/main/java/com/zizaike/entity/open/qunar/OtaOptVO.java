package com.zizaike.entity.open.qunar;

import com.zizaike.entity.open.qunar.response.OptCode;

import java.io.Serializable;

/**
 * Project Name: code <br/>
 * Function:OtaOpeVO. <br/>
 * date: 2016/4/19 17:57 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
public class OtaOptVO implements Serializable{

    private static final long serialVersionUID = -8234646273413556371L;
    /**
     * 需要更新的订单号
     */
    private String orderNum;
    /**
     * 需要更新的订单号
     */
    private OptCode opt;
    /**
     * hmac=md5(signKey || orderNum || opt || ...), 32 位,
     小写, ||是字符串连接符, ... 是可选参数money;
     举例说明：signKey=asdf, orderNums=xxxx, opt=CONFIRM_ROOM_SUCCESS,
     hmac = md5(asdfxxxxCONFIRM_ROOM_SUCCESS)
     */
    private String hnmac;
    /**
     * 添加备注
     */
    private String remark;
    /**
     * smsContent不能为空，1-60个字符。
     例如：你好，你预订的xxx酒店xxx房型已满房，我们已经免费为您升级为高级房，请放心入住
     */
    private String smsContent;
    /**
     *需要返还给消费者的金额，币别为RMB
     */
    private String money;

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public OptCode getOpt() {
        return opt;
    }

    public void setOpt(OptCode opt) {
        this.opt = opt;
    }

    public String getHnmac() {
        return hnmac;
    }

    public void setHnmac(String hnmac) {
        this.hnmac = hnmac;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
