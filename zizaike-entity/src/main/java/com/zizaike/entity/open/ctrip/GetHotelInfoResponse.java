/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:SetAdaperRoomPriceRequest.java  <br/>
 * Package Name:com.zizaike.entity.open.ctrip  <br/>
 * Date:2016年2月3日上午10:06:57  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.ctrip;  

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.zizaike.entity.open.alibaba.request.RequestData;

/**
 * 
 * ClassName: GetHotelInfoResponse <br/>  
 * Function: 获得ctrip的酒店信息. <br/>  
 * date: 2016年2月29日 下午6:35:03 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
@XStreamAlias("GetHotelInfoResponse")
public class GetHotelInfoResponse extends RequestData implements Serializable{
    private static final long serialVersionUID = -1330202513269208829L;
    /**
     * 
     */
    @XStreamAlias("TotalPage")
    private Integer totalPage;
    @XStreamAlias("CurrentPage")
    private Integer currentPage;
    @XStreamAlias("TotalNum")
    private Integer totalNum;
    @XStreamImplicit(itemFieldName = "HotelList")
    private List<Hotel> hotel = new ArrayList<Hotel>();
    public Integer getTotalPage() {
        return totalPage;
    }
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
    public Integer getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
    public Integer getTotalNum() {
        return totalNum;
    }
    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }
    public List<Hotel> getHotel() {
        return hotel;
    }
    public void setHotel(List<Hotel> hotel) {
        this.hotel = hotel;
    }
    
    @Override
    public String toString() {
        return "GetHotelInfoResponse [totalPage=" + totalPage + ", currentPage=" + currentPage + ", totalNum="
                + totalNum + ", hotel=" + hotel + "]";
    }
    public static void main(String[] args) {
        String xml =   "<GetHotelInfoResponse>"
                + "<TotalPage>1</TotalPage>"
                + "<CurrentPage>1</CurrentPage>"
                + "<TotalNum>2</TotalNum>"
                + "<HotelList>"
                  + "<Hotel>89236</Hotel>"
                  + "<HotelName>黄河大饭店</HotelName>"
                  + "<CountryName>中国</CountryName>"
                  + "<CityName>上海</CityName>"
                  + "<Address/>"
                  + "<Telephone/>"
                + "</HotelList>"
                + "<HotelList>"
                  + "<Hotel>89237</Hotel>"
                  + "<HotelName>长江大饭店</HotelName>"
                  + "<CountryName>中国</CountryName>"
                  + "<CityName>上海</CityName>"
                  + "<Address/>"
                  + "<Telephone/>"
                + "</HotelList>"
              + "</GetHotelInfoResponse>";
        
        XStream stream = new XStream();
        stream.processAnnotations(GetHotelInfoResponse.class);
        GetHotelInfoResponse obj = (GetHotelInfoResponse) stream.fromXML(xml);
        System.out.println(obj);
    }
    
}
  
