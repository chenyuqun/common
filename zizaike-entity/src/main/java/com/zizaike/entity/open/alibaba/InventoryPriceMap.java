/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:InventoryPrice.java  <br/>
 * Package Name:com.zizaike.entity.open.alibaba  <br/>
 * Date:2016年1月22日下午3:51:15  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.open.alibaba;  

import java.io.Serializable;
import java.util.List;

/**  
 * ClassName:InventoryPrice <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年1月22日 下午3:51:15 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class InventoryPriceMap implements Serializable{

    /**  
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).  
     * @since JDK 1.7
     */
    private static final long serialVersionUID = -787759915965616080L;
    Action action;
    /**
     * 房型编号
     */
    private String outRid;
    /**
     * rateplan_code
     */
    private String rateplanCode;
    /**
     * 供应商
     */
    private String vendor;
    /**
     * 价格data
     */
    private List<InventoryPrice> data;
    
    public Action getAction() {
        return action;
    }
    public void setAction(Action action) {
        this.action = action;
    }
    public String getOutRid() {
        return outRid;
    }
    public void setOutRid(String outRid) {
        this.outRid = outRid;
    }
    public String getRateplanCode() {
        return rateplanCode;
    }
    public void setRateplanCode(String rateplanCode) {
        this.rateplanCode = rateplanCode;
    }
    public String getVendor() {
        return vendor;
    }
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    public List<InventoryPrice> getData() {
        return data;
    }
    public void setData(List<InventoryPrice> data) {
        this.data = data;
    }
    
    
    
}
  
