/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:OptionRuleCode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午2:49:45  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:OptionRuleCode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午2:49:45  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar.response;

import com.zizaike.core.framework.ienum.IEnum;

/**  
 * ClassName:OptionRuleCode <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年4月6日 下午2:49:45 <br/>  
 * @author   lin  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */

public enum OptionRuleCode {
    AIRPORT_PICKUP("AIRPORT_PICKUP", "接机服务"),
    HIGH_SPEED_NETWORK("HIGH_SPEED_NETWORK", "高速无线网"),
    EXTRA_BED("EXTRA_BED", "加床"),
    EXTRA_BREAKFAST("EXTRA_BREAKFAST", "加早餐"),
    OTHERS("OTHERS", "其他");

    private final String code;
    private final String desc;

    /**
     * @param code
     * @param description
     */
    private OptionRuleCode(String code, String description)
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
        for (OptionRuleCode optionRuleCode : values())
        {
            if (optionRuleCode.getCode().equals(code))
            {
                return optionRuleCode.desc;
            }
        }
        return null;
    }
}
  
