package com.zizaike.core.framework.exception.open;

import com.zizaike.core.framework.exception.IErrorCode;

/**
 * 
 * ClassName: RYErrorCode <br/>
 * Function: . <br/>
 * date: 2015年10月28日 上午11:11:34 <br/>
 *
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 */
public enum ErrorCodeFields implements IErrorCode {
    /**
     * 系统异常
     */
    SYSTEM_ERROR("10000", "system error"),
    /**
     *返回异常
     */
    OPEN_RETURN_ERROR("10001", "返回异常"),
    /**
     * 通信错误
     */
    NETWORK_ERROR("10004","network error"),
    /** 用户不存在 **/
    USER_NOT_FOUND_ERROR("10001", "user not found error"),
    /** 用户名或密码不存在 **/
    USERNAME_OR_PASSWORD_ERROR("10002", "username or password error"),
    /**
     * 地址没有找到
     */
    AREA_NOT_FOUND_ERROR("10003", "area not found error"),
    /**
     * 户型映射不存在
     */
    ROOM_TYPE_NOT_MAPPING_ERROR("10004", "room type not mapping error"),
    ROOM_FULL_NOT_BOOK_ERROR("-1", "表示满房（不可预定）"),
    RP_ERROR("-2", "标识RP失效"),
    OTHER_NOT_BOOK_ERROR("-3", "其他不可预定"),
    /**
     * 预定订单错误
     */
    BOOK_FAILURE("-100","生成订单失败"),
    BOOK_PARAMS_ERROR("-116","参数错误"),
    BOOK_HOTEL_NOT_EXIST("-113","酒店id不存在"),
    BOOK_ROOMTYPE_NOT_EXIST("-114","房型不存在"),
    BOOK_RATEPLAN_NOT_EXIST("-115","价格政策不存在"),
    BOOK_OVER_ROOM_LIMIT("-107","预定房间数超过限制"),
    BOOK_CHECKIN_ERROR("-108","最早到店时间不合法"),
    BOOK_CHECKOUT_ERROR("-109","最晚到店时间不合法"),
    BOOK_CONTACT_NAME_ERROR("-110","联系人姓名不合法"),
    BOOK_CONTACT_PHONE_ERROR("-111","联系电话不合法"),
    BOOK_OVER_PEOPLE_LIMIT("-112","超过入住人数限制"),
    BOOK_ALREARD_ERROR("-106","重复预定"),
    /**
     * 查询错误
     */
    QUERY_FAILURE("-300","查询失败"),
    QUERY_ERROR_CUSTOM("-301","自定义"),    
    QUERY_ORDER_NOT_EXIST("-302","订单不存在"),
    /**
     * cancel错误
     */
    CANCEL_FAILURE("-200","取消失败"),
    CANCEL_ORDER_NOT_EXIST("-204","不存在此订单"),
    CANCEL_ORDER_ALREADY_CANCELLED("-205","订单已取消"),
    CANCEL_NOT_PAID("-206","订单未付款，取消失败"),
    CANCEL_NOT_ALLOWED("-207","订单未确认，订单不可取消"),
    CANCEL_PAID_ALREADY("-208","已付款订单，不可取消"),
    CANCEL_OTHER_REASON("-209","其他原因不可取消"),
    CANCEL_REFUND_CHANGE("-210","由于退款金额发生变化，订单取消失败"),
    ;

    private String errorCode;

    private String errorMsg;

    private ErrorCodeFields(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
    public String getErrorCode() {
        return this.errorCode;
    }
    
    public ErrorCodeFields setErrorMsgAndReturn(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }


}
