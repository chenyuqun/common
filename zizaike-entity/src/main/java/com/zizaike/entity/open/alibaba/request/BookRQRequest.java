/**  
 * Project Name:open-api  <br/>
 * File Name:BookRQ.java  <br/>
 * Package Name:com.zizaike.open.entity.taobao.request  <br/>
 * Date:2016年1月14日下午3:56:38  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.entity.open.alibaba.request;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.zizaike.entity.open.alibaba.XStreamYMDDateConverter;
import com.zizaike.entity.open.alibaba.XStreamYMDHMSDateConverter;

/**
 * ClassName:BookRQ <br/>
 * Function: 创建订单请求. <br/>
 * Date: 2016年1月14日 下午3:56:38 <br/>
 * 
 * @author snow.zhang
 * @version
 * @since JDK 1.7
 * @see
 */
@XStreamAlias("BookRQ")
public class BookRQRequest extends RequestData {
    // TODO 根据 http://open.taobao.com/doc2/detail.htm?spm=0.0.0.0.f6mnDH&treeId=22&articleId=103812&docType=1 把实体类补充完整
    @XStreamAlias("AuthenticationToken")
    private AuthenticationToken authenticationToken;
    /*
     * 淘宝订单id，第三方需根据此id判断订单是否已经存在，以实现幂等和避免重复下单。
     */
    @XStreamAlias("TaoBaoOrderId")
    private long taoBaoOrderId;
    /*
     * 淘宝酒店id
     */
    @XStreamAlias("TaoBaoHotelId")
    private long taoBaoHotelId;
    /*
     * OTA酒店id，即第三方系统中的酒店id
     */
    @XStreamAlias("HotelId")
    private String hotelId;
    /*
     * 淘宝房型id
     */
    @XStreamAlias("TaoBaoRoomTypeId")
    private long taoBaoRoomTypeId;
    /*
     * OTA房型id，即第三方系统中的房型id
     */
    @XStreamAlias("RoomTypeId")
    private String roomTypeId;
    /**
     * 淘宝价格计划id
     */
    @XStreamAlias("TaoBaoRatePlanId")
    private long taoBaoRatePlanId;
    /**
     * OTA价格计划id，即第三方系统中的价格计划id
     */
    @XStreamAlias("RatePlanCode")
    private String ratePlanCode;
    /**
     * 淘宝酒店商品id
     */
    @XStreamAlias("TaoBaoGid")
    private long taoBaoGid;
    /*
     * 入住时间
     */
    @XStreamAlias("CheckIn")
    @XStreamConverter(value = XStreamYMDHMSDateConverter.class)
    private Date checkIn;
    /*
     * 离店时间
     */
    @XStreamAlias("CheckOut")
    @XStreamConverter(value = XStreamYMDHMSDateConverter.class)
    private Date checkOut;
    /*
     * 小时房（时间取Checkin/Checkout对应的具体时间）默认：false
     */
    @XStreamAlias("HourRent")
    private String hourRent;
    /*
     * 最早到店时间
     */
    @XStreamAlias("EarliestArriveTime")
    @XStreamConverter(value = XStreamYMDHMSDateConverter.class)
    private Date earliestArriveTime;
    /*
     * 最晚到店时间
     */
    @XStreamAlias("LatestArriveTime")
    @XStreamConverter(value = XStreamYMDHMSDateConverter.class)
    private Date latestArriveTime;
    /*
     * 房间数量（最大为9）
     */
    @XStreamAlias("RoomNum")
    private int roomNum;
    /*
     * 订单总价（分）
     */
    @XStreamAlias("TotalPrice")
    private long totalPrice;
    /*
     * 卖家优惠金额（卖家红包等），总价（分）
     */
    @XStreamAlias("SellerDiscount")
    private long sellerDiscount;
    /*
     * 去啊平台提供的优惠金额，总价（分）
     */
    @XStreamAlias("AlitripDiscount")
    private long alitripDiscount;
    /*
     * 货币类型（现在只支持一种）
     */
    @XStreamAlias("Currency")
    private String currency;
    /*
     * 支付方式1预付、5面付、6后付（现在只有1、5、6）
     */
    @XStreamAlias("PaymentType")
    private int paymentType;
    /*
     * 联系人姓名
     */
    @XStreamAlias("ContactName")
    private String contactName;
    /*
     * 联系人电话
     */
    @XStreamAlias("ContactTel")
    private String contactTel;
    /*
     * 联系人邮箱
     */
    @XStreamAlias("ContactEmail")
    private String contactEmail;
    /*
     * 每日价格
     */
    @XStreamAlias("DailyInfos")
    private DailyInfos dailyInfos;
    /*
     * 入住人信息
     */
    @XStreamAlias("OrderGuests")
    private OrderGuests orderGuests;
    /*
     * 备注、特殊需求
     */
    @XStreamAlias("Comment")
    private String comment;
    /*
     * OTA会员卡卡号
     */
    @XStreamAlias("MemberCardNo")
    private String memberCardNo;
    /*
     * 担保类型
     */
    @XStreamAlias("GuaranteeType")
    private String guaranteeType;
    /*
     * 发票信息
     */
    @XStreamAlias("ReceiptInfo")
    private ReceiptInfo receiptInfo;
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

    public long getTaoBaoOrderId() {
        return taoBaoOrderId;
    }

    public void setTaoBaoOrderId(long taoBaoOrderId) {
        this.taoBaoOrderId = taoBaoOrderId;
    }

    public long getTaoBaoHotelId() {
        return taoBaoHotelId;
    }

    public void setTaoBaoHotelId(long taoBaoHotelId) {
        this.taoBaoHotelId = taoBaoHotelId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public long getTaoBaoRoomTypeId() {
        return taoBaoRoomTypeId;
    }

    public void setTaoBaoRoomTypeId(long taoBaoRoomTypeId) {
        this.taoBaoRoomTypeId = taoBaoRoomTypeId;
    }

    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public long getTaoBaoRatePlanId() {
        return taoBaoRatePlanId;
    }

    public void setTaoBaoRatePlanId(long taoBaoRatePlanId) {
        this.taoBaoRatePlanId = taoBaoRatePlanId;
    }

    public String getRatePlanCode() {
        return ratePlanCode;
    }

    public void setRatePlanCode(String ratePlanCode) {
        this.ratePlanCode = ratePlanCode;
    }

    public long getTaoBaoGid() {
        return taoBaoGid;
    }

    public void setTaoBaoGid(long taoBaoGid) {
        this.taoBaoGid = taoBaoGid;
    }

    public String getHourRent() {
        return hourRent;
    }

    public void setHourRent(String hourRent) {
        this.hourRent = hourRent;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public long getSellerDiscount() {
        return sellerDiscount;
    }

    public void setSellerDiscount(long sellerDiscount) {
        this.sellerDiscount = sellerDiscount;
    }

    public long getAlitripDiscount() {
        return alitripDiscount;
    }

    public void setAlitripDiscount(long alitripDiscount) {
        this.alitripDiscount = alitripDiscount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getMemberCardNo() {
        return memberCardNo;
    }

    public void setMemberCardNo(String memberCardNo) {
        this.memberCardNo = memberCardNo;
    }

    public String getGuaranteeType() {
        return guaranteeType;
    }

    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }

    public Object getReceiptInfo() {
        return receiptInfo;
    }

    public String getExtensions() {
        return extensions;
    }

    public void setExtensions(String extensions) {
        this.extensions = extensions;
    }

    public OrderGuests getOrderGuests() {
        return orderGuests;
    }

    public void setOrderGuests(OrderGuests orderGuests) {
        this.orderGuests = orderGuests;
    }

    public void setReceiptInfo(ReceiptInfo receiptInfo) {
        this.receiptInfo = receiptInfo;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Date getEarliestArriveTime() {
        return earliestArriveTime;
    }

    public void setEarliestArriveTime(Date earliestArriveTime) {
        this.earliestArriveTime = earliestArriveTime;
    }

    public Date getLatestArriveTime() {
        return latestArriveTime;
    }

    public void setLatestArriveTime(Date latestArriveTime) {
        this.latestArriveTime = latestArriveTime;
    }

    public DailyInfos getDailyInfos() {
        return dailyInfos;
    }

    public void setDailyInfos(DailyInfos dailyInfos) {
        this.dailyInfos = dailyInfos;
    }

    public BookRQRequest() {

    }

    public BookRQRequest(AuthenticationToken authenticationToken, long taoBaoOrderId, long taoBaoHotelId,
            String hotelId, long taoBaoRoomTypeId, String roomTypeId, long taoBaoRatePlanId, String ratePlanCode,
            long taoBaoGid, Date checkIn, Date checkOut, String hourRent, Date earliestArriveTime,
            Date latestArriveTime, int roomNum, long totalPrice, long sellerDiscount, long alitripDiscount,
            String currency, int paymentType, String contactName, String contactTel, String contactEmail,
            DailyInfos dailyInfos, OrderGuests orderGuests, String comment, String memberCardNo, String guaranteeType,
            ReceiptInfo receiptInfo, String extensions) {
        super();
        this.authenticationToken = authenticationToken;
        this.taoBaoOrderId = taoBaoOrderId;
        this.taoBaoHotelId = taoBaoHotelId;
        this.hotelId = hotelId;
        this.taoBaoRoomTypeId = taoBaoRoomTypeId;
        this.roomTypeId = roomTypeId;
        this.taoBaoRatePlanId = taoBaoRatePlanId;
        this.ratePlanCode = ratePlanCode;
        this.taoBaoGid = taoBaoGid;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.hourRent = hourRent;
        this.earliestArriveTime = earliestArriveTime;
        this.latestArriveTime = latestArriveTime;
        this.roomNum = roomNum;
        this.totalPrice = totalPrice;
        this.sellerDiscount = sellerDiscount;
        this.alitripDiscount = alitripDiscount;
        this.currency = currency;
        this.paymentType = paymentType;
        this.contactName = contactName;
        this.contactTel = contactTel;
        this.contactEmail = contactEmail;
        this.dailyInfos = dailyInfos;
        this.orderGuests = orderGuests;
        this.comment = comment;
        this.memberCardNo = memberCardNo;
        this.guaranteeType = guaranteeType;
        this.receiptInfo = receiptInfo;
        this.extensions = extensions;
    }

    @XStreamAlias("DailyInfos")
    private class DailyInfos {
        @XStreamImplicit(itemFieldName = "DailyInfo")
        private List<DailyInfo> dailyInfos = new ArrayList<DailyInfo>();

        public List<DailyInfo> getDailyInfos() {
            return dailyInfos;
        }

        public void setDailyInfos(List<DailyInfo> dailyInfos) {
            this.dailyInfos = dailyInfos;
        }

    }

    @XStreamAlias("DailyInfo")
    private class DailyInfo {
        @XStreamConverter(value = XStreamYMDDateConverter.class)
        @XStreamAlias("Day")
        private Date day;
        @XStreamAlias("Price")
        private Long price;

        public Date getDay() {
            return day;
        }

        public void setDay(Date day) {
            this.day = day;
        }

        public Long getPrice() {
            return price;
        }

        public void setPrice(Long price) {
            this.price = price;
        }

        public DailyInfo() {
        }

        public DailyInfo(Date day, Long price) {
            super();
            this.day = day;
            this.price = price;
        }

        @Override
        public String toString() {
            return "DailyInfo [day=" + day + ", price=" + price + "]";
        }
    }

    @XStreamAlias("OrderGuests")
    public class OrderGuests {
        @XStreamImplicit(itemFieldName = "OrderGuest")
        private List<OrderGuest> orderGuests = new ArrayList<OrderGuest>();

        public List<OrderGuest> getOrderGuests() {
            return orderGuests;
        }

        public void setOrderGuests(List<OrderGuest> orderGuests) {
            this.orderGuests = orderGuests;
        }

    }

    @XStreamAlias("OrderGuest")
    public class OrderGuest {
        /*
         * 姓名
         */
        @XStreamAlias("Name")
        private String name;
        /*
         * 房间序号
         */
        @XStreamAlias("RoomPos")
        private Integer roomPos;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getRoomPos() {
            return roomPos;
        }

        public void setRoomPos(Integer roomPos) {
            this.roomPos = roomPos;
        }

        public OrderGuest() {
        }

        public OrderGuest(String name, Integer roomPos) {
            super();
            this.name = name;
            this.roomPos = roomPos;
        }

        @Override
        public String toString() {
            return "OrderGuest [name=" + name + ", roomPos=" + roomPos + "]";
        }

    }


/**  
 * ClassName:ReceiptInfo <br/>  
 * Function:  发票信息. <br/>  
 * Date:     2016年1月15日 上午11:31:41 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@XStreamAlias("ReceiptInfo")
private class ReceiptInfo {
    /**
     * 发票抬头
     */
    @XStreamAlias("ReceiptTitle")
    private String receiptTitle;
    /**
     * 发
     */
    @XStreamAlias("ReceiptType")
    private String receiptType;
    /**
     * 发票邮寄信息
     */
    @XStreamAlias("ReceiptAddress")
    private String receiptAddress;
    public String getReceiptTitle() {
        return receiptTitle;
    }
    public void setReceiptTitle(String receiptTitle) {
        this.receiptTitle = receiptTitle;
    }
    public String getReceiptType() {
        return receiptType;
    }
    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }
    public String getReceiptAddress() {
        return receiptAddress;
    }
    public void setReceiptAddress(String receiptAddress) {
        this.receiptAddress = receiptAddress;
    }
    public ReceiptInfo(String receiptTitle, String receiptType, String receiptAddress) {
        super();
        this.receiptTitle = receiptTitle;
        this.receiptType = receiptType;
        this.receiptAddress = receiptAddress;
    }
    
}


@Override
public String toString() {
    return "BookRQRequest [authenticationToken=" + authenticationToken + ", taoBaoOrderId=" + taoBaoOrderId
            + ", taoBaoHotelId=" + taoBaoHotelId + ", hotelId=" + hotelId + ", taoBaoRoomTypeId=" + taoBaoRoomTypeId
            + ", roomTypeId=" + roomTypeId + ", taoBaoRatePlanId=" + taoBaoRatePlanId + ", ratePlanCode="
            + ratePlanCode + ", taoBaoGid=" + taoBaoGid + ", checkIn=" + checkIn + ", checkOut=" + checkOut
            + ", hourRent=" + hourRent + ", earliestArriveTime=" + earliestArriveTime + ", latestArriveTime="
            + latestArriveTime + ", roomNum=" + roomNum + ", totalPrice=" + totalPrice + ", sellerDiscount="
            + sellerDiscount + ", alitripDiscount=" + alitripDiscount + ", currency=" + currency + ", paymentType="
            + paymentType + ", contactName=" + contactName + ", contactTel=" + contactTel + ", contactEmail="
            + contactEmail + ", dailyInfos=" + dailyInfos + ", orderGuests=" + orderGuests + ", comment=" + comment
            + ", memberCardNo=" + memberCardNo + ", guaranteeType=" + guaranteeType + ", receiptInfo=" + receiptInfo
            + ", extensions=" + extensions + "]";
}

}
