package com.zizaike.entity.recommend;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONType;
import com.zizaike.entity.base.ChannelType;
/**
 * 
 * ClassName: SearchStatistics <br/>  
 * Function: 服务查询统计. <br/>  
 * date: 2015年12月8日 下午5:25:13 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
import com.zizaike.entity.solr.BNBServiceType;
/**
 * 
 * ClassName: BNBServiceSearchStatistics <br/>  
 * Function: 服务查询系统. <br/>  
 * date: 2016年4月20日 下午4:44:49 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
@JSONType(ignores={"channel"})
public class BNBServiceSearchStatistics implements Serializable{
    private static final long serialVersionUID = -3713495566076332494L;
    /**
     * 服务类型
     */
    private BNBServiceType bnbServiceType;
    /**
     * 渠道
     */
    private ChannelType channel;
    /**
     * 国家
     */
    private Integer destId;
       
    
    public Integer getDestId() {
        return destId;
    }
    public void setDestId(Integer destId) {
        this.destId = destId;
    }
    public BNBServiceType getBnbServiceType() {
        return bnbServiceType;
    }
    public void setBnbServiceType(BNBServiceType bnbServiceType) {
        this.bnbServiceType = bnbServiceType;
    }
    public ChannelType getChannel() {
        return channel;
    }
    public void setChannel(ChannelType channel) {
        this.channel = channel;
    }
    @Override
    public String toString() {
        return "BNBServiceSearchStatistics [bnbServiceType=" + bnbServiceType + ", channel=" + channel + ", destId="
                + destId + "]";
    }
    
    
}