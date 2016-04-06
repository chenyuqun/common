/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:BedType.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午2:16:49  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
/**  
 * Project Name:zizaike-entity <br/> 
 * File Name:BedType.java  <br/>
 * Package Name:com.zizaike.entity.open.qunar  <br/>
 * Date:2016年4月6日下午2:16:49  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved. 
 *  
 */  
  
package com.zizaike.entity.open.qunar;  
import com.zizaike.core.framework.ienum.IEnum;
/**  
 * ClassName:BedType <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年4月6日 下午2:16:49 <br/>  
 * @author   lin  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */

public enum BedType implements IEnum{
    /**
     * 单人床
     */
    SINGLE(1),
    /**
     * 大床
     */
    DOUBLE(2),
    /**
     * 上下铺
     */
    BUNK(3),
    /**
     * 通铺
     */
    DORM_BED(4),
    /**
     * 榻榻米
     */
    TATAMI(5),
    /**
     * 水床
     */
    WANTER_BED(6),
    /**
     * 圆床
     */
    ROUND_BED(7),
    /**
     * 折叠床
     */
    FOLDING_BED(8),
    /**
     * 婴儿床
     */
    BABY_COT(9),
    /**
     * 拼床
     */
    CONNECTED_BED(10),
    /**
     * 其他
     */
    OTHERS(11),
    ;

    private int value;
    
    private BedType(int value){
        this.value = value;
    }
    @Override
    public int getValue(){
        return this.value;
    }
    public static BedType findeByValue(int value) {
        if(value == 1){
            return SINGLE;
        }else if(value == 2){
            return DOUBLE;
        }else if(value == 3){
            return BUNK;
        }else if(value == 4){
            return DORM_BED;
        }else if(value == 5){
            return TATAMI;
        }else if(value == 6){
            return WANTER_BED;
        }else if(value == 7){
            return ROUND_BED;
        }else if(value == 8){
            return FOLDING_BED;
        }else if(value == 9){
            return BABY_COT;
        }else if(value == 10){
            return CONNECTED_BED;
        }else if(value ==11){
            return OTHERS;
        }else {     
        return null;}
    }

}
  
