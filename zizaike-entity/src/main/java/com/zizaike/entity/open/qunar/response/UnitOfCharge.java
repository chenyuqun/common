/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:UnitOfCharge.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午3:28:51  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:UnitOfCharge.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午3:28:51  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar.response;

/**
 * ClassName:UnitOfCharge <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年4月6日 下午3:28:51 <br/>  
 * @author   lin  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */

public enum UnitOfCharge {
    PER_TIME("PER_TIME", "每次"),
    PER_DAY("PER_DAY", "每天"),
    PER_ITEM("PER_ITEM", "每份"),
    PER_PERSON_TIME("PER_PERSON_TIME", "每人次"),
    PER_HOUR("PER_HOUR", "每小时");

    private final String code;
    private final String desc;

    /**
     * @param code
     * @param description
     */
    private UnitOfCharge(String code, String description)
    {
        this.code = code;
        this.desc = description;
    }

    /**
     * @return
     * @desc 返回code
     */
    public String getCode()
    {
        return code;
    }

    /**
     * @return
     * @desc 返回desc
     */
    public String getDesc()
    {
        return desc;
    }

    /**
     * 通过code获取desc
     * @param code
     */
    public static String getByCode(String code)
    {
        for (UnitOfCharge unitOfCharge : values())
        {
            if (unitOfCharge.getCode().equals(code))
            {
                return unitOfCharge.desc;
            }
        }
        return null;
    }
}
  
