/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:requiredActionCode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.request  <br/>
 * Date:2016年4月8日上午10:17:23  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:requiredActionCode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.request  <br/>
 * Date:2016年4月8日上午10:17:23  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar.request;  

/**  
 * ClassName: requiredAction <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2016年4月8日 上午10:17:23 <br/>  
 *  
 * @author lin  
 * @version   
 * @since JDK 1.7  
 */
public enum requiredActionCode {
    CONFIRM_ROOM_SUCCESS("CONFIRM_ROOM_SUCCESS","确认成功"),
    CONFIRM_ROOM_FAILURE("CONFIRM_ROOM_FAILURE","确认失败");
    private final String code;
    private final String desc;
    public String getCode() {
        return code;
    }
    public String getDesc() {
        return desc;
    }
    /**  
     * Creates a new instance of requiredAction.  
     * @param code
     * @param desc  
     */  
    
    private requiredActionCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    public static String getByCode(String code){
        for(requiredActionCode req: values()){
            if(req.getCode().equals(code))
                return req.desc;
        }
        return null;
    }
}
  
