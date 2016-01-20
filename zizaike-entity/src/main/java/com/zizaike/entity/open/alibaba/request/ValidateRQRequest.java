/**  
 * Project Name:open-api  <br/>
 * File Name:ValidateRQ.java  <br/>
 * Package Name:com.zizaike.open.entity  <br/>
 * Date:2016年1月13日下午4:22:57  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.alibaba.request;  

import java.util.Date;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.zizaike.entity.open.alibaba.XStreamYMDDateConverter;

/**  
 * ClassName:ValidateRQ <br/>  
 * Function: 验证价格库存接口. <br/>  
 * Date:     2016年1月13日 下午4:22:57 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("ValidateRQ")
public class ValidateRQRequest extends RequestData{
    @XStreamAlias("AuthenticationToken")
    private AuthenticationToken authenticationToken;
    /**
     * 淘宝酒店id
     */
    @XStreamAlias("TaoBaoHotelId")
    private Long taoBaoHotelId;
    /**
     * OTA酒店id，即第三方系统中的酒店id
     */
    @XStreamAlias("HotelId")
    private String hotelId;
    /**
     * 淘宝房型id
     */
    @XStreamAlias("TaoBaoRoomTypeId")
    private Long taoBaoRoomTypeId;
    /**
     * OTA房型id，即第三方系统中的房型id
     */
    @XStreamAlias("RoomTypeId")
    private String roomTypeId;
    /**
     * 淘宝价格计划id
     */
    @XStreamAlias("TaoBaoRatePlanId")
    private Long taoBaoRatePlanId;
    /**
     * OTA价格计划id，即第三方系统中的价格计划id
     */
    @XStreamAlias("RatePlanCode")
    private String ratePlanCode;
    /**
     * 淘宝酒店商品id
     */
    @XStreamAlias("TaoBaoGid")
    private Long taoBaoGid;
    /**
     * 入住时间
     */
     @XStreamAlias("CheckIn")
     @XStreamConverter(value=XStreamYMDDateConverter.class)
    private Date checkIn;
    /**
     * 离店日期
     */
     @XStreamAlias("CheckOut")
     @XStreamConverter(value=XStreamYMDDateConverter.class)
    private Date checkOut;
    /**
     * 房间数量（最大为9）
     */
     @XStreamAlias("RoomNum")
    private Integer roomNum;
    /**
     * 支付方式1预付5面付6信用住
     */
     @XStreamAlias("PaymentType")
    private Integer paymentType;
    /**
     * 扩展字段json，用于处理特殊OTA个性需求添加的扩展字段 {"key":"value"}
     */
     @XStreamAlias("Extensions")
    private String extensions;
    
    public AuthenticationToken getAuthenticationToken() {
        return authenticationToken;
    }
    public void setAuthenticationToken(AuthenticationToken authenticationToken) {
        this.authenticationToken = authenticationToken;
    }
    public Long getTaoBaoHotelId() {
        return taoBaoHotelId;
    }
    public void setTaoBaoHotelId(Long taoBaoHotelId) {
        this.taoBaoHotelId = taoBaoHotelId;
    }
    public String getHotelId() {
        return hotelId;
    }
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }
    public Long getTaoBaoRoomTypeId() {
        return taoBaoRoomTypeId;
    }
    public void setTaoBaoRoomTypeId(Long taoBaoRoomTypeId) {
        this.taoBaoRoomTypeId = taoBaoRoomTypeId;
    }
    public String getRoomTypeId() {
        return roomTypeId;
    }
    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }
    public Long getTaoBaoRatePlanId() {
        return taoBaoRatePlanId;
    }
    public void setTaoBaoRatePlanId(Long taoBaoRatePlanId) {
        this.taoBaoRatePlanId = taoBaoRatePlanId;
    }
    public String getRatePlanCode() {
        return ratePlanCode;
    }
    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }
    public Long getTaoBaoGid() {
        return taoBaoGid;
    }
    public void setTaoBaoGid(Long taoBaoGid) {
        this.taoBaoGid = taoBaoGid;
    }
    public Date getCheckIn() {
        return checkIn;
    }
    public Date getCheckOut() {
        return checkOut;
    }
    
    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }
    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
    public Integer getRoomNum() {
        return roomNum;
    }
    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }
    public Integer getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }
    public String getExtensions() {
        return extensions;
    }
    public void setExtensions(String extensions) {
        this.extensions = extensions;
    }
    public ValidateRQRequest() {
    }
    
    public ValidateRQRequest( AuthenticationToken authenticationToken, Long taoBaoHotelId,
            String hotelId, Long taoBaoRoomTypeId, String roomTypeId, Long taoBaoRatePlanId, String ratePlanCode,
            Long taoBaoGid, Date checkIn, Date checkOut, Integer roomNum, Integer paymentType, String extensions) {
        super();
        this.authenticationToken = authenticationToken;
        this.taoBaoHotelId = taoBaoHotelId;
        this.hotelId = hotelId;
        this.taoBaoRoomTypeId = taoBaoRoomTypeId;
        this.roomTypeId = roomTypeId;
        this.taoBaoRatePlanId = taoBaoRatePlanId;
        this.ratePlanCode = ratePlanCode;
        this.taoBaoGid = taoBaoGid;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.roomNum = roomNum;
        this.paymentType = paymentType;
        this.extensions = extensions;
    }
    
    @Override
    public String toString() {
        return "ValidateRQ [ authenticationToken=" + authenticationToken + ", taoBaoHotelId="
                + taoBaoHotelId + ", hotelId=" + hotelId + ", taoBaoRoomTypeId=" + taoBaoRoomTypeId + ", roomTypeId="
                + roomTypeId + ", taoBaoRatePlanId=" + taoBaoRatePlanId + ", ratePlanCode=" + ratePlanCode
                + ", taoBaoGid=" + taoBaoGid + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", roomNum="
                + roomNum + ", paymentType=" + paymentType + ", extensions=" + extensions + "]";
    }
    public static void main(String[] args) {
        String xml = "<ValidateRQ>"
        +"<AuthenticationToken>"
        +"<Username>taobao</Username>"
        +"<Password>B75!jaJb[eO8</Password>"
        +"<CreateToken>22251178182015010620150107497867981843210904377</CreateToken>"
      +"</AuthenticationToken>"
      +"<TaoBaoHotelId>1357757818</TaoBaoHotelId>"
      +"<HotelId>3FENY3V11P</HotelId>"
      +"<TaoBaoRoomTypeId>5501264818</TaoBaoRoomTypeId>"
     +" <RoomTypeId>3FENY3V11P-RT1241</RoomTypeId>"
      +"<TaoBaoRatePlanId>4978679818</TaoBaoRatePlanId>"
      +"<RatePlanCode>3FENY3V11P-RT1241-RP846</RatePlanCode>"
     +" <TaoBaoGid>3824371818</TaoBaoGid>"
      +"<CheckIn>2015-01-06</CheckIn>"
      +"<CheckOut>2015-01-07</CheckOut>"
      +"<RoomNum>1</RoomNum>"
      +"<PaymentType>1</PaymentType>"
    +"<Extensions>{'searchid':'22251178182015010620150107497867981843210904377'}</Extensions>"
    +" </ValidateRQ>";
        
        XStream stream = new XStream();
        stream.processAnnotations(ValidateRQRequest.class);  
        RequestData validateRQ =  (RequestData) stream.fromXML(xml);
        System.out.println(validateRQ);
    }
    
}
  
