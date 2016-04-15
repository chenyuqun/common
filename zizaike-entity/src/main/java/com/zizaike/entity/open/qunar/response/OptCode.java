/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:OptCode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.response  <br/>
 * Date:2016年4月11日上午11:18:32  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:OptCode.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar.response  <br/>
 * Date:2016年4月11日上午11:18:32  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar.response;  
/**  
 * ClassName: OptCode <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason: TODO ADD REASON(可选). <br/>  
 * date: 2016年4月11日 上午11:18:32 <br/>  
 *  
 * @author lin  
 * @version   
 * @since JDK 1.7  
 */
public enum OptCode {
    CONFIRM_ROOM_SUCCESS("CONFIRM_ROOM_SUCCESS","确认有房"),
    CONFIRM_ROOM_FAILURE("CONFIRM_ROOM_FAILURE","确认无房"),
    ARRANGE_ROOM("ARRANGE_ROOM","安排房间"),
    ADD_REMARKS("ADD_REMARKS","添加备注"),
    APPLY_UNSUBSCRIBE("APPLY_UNSUBSCRIBE","申请退款"),
    SEND_SMS("SEND_SMS","发送短信"),
    AGREE_UNSUBSCRBE("AGREE_UNSUBSCRBE","同意退订"),
    REFUSE_UNSUBSCRIBE("REFUSE_UNSUBSCRIBE","拒绝退订");
    private String code;
    private String desc;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    /**  
     * Creates a new instance of OptCode.  
     *  
     * @param code
     * @param desc  
     */  
    
    private OptCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getByCode(String code){
        for(OptCode optCode : values()){
            if(optCode.getCode().equals(code))
                return optCode.getDesc();
        }
        return null;
    }
}
  
