package com.zizaike.entity.open.alibaba;

import com.zizaike.core.framework.ienum.IEnum;
/**
 * 
 * ClassName: Action <br/>  
 * Function: MQ动作. <br/>  
 * date: 2016年1月21日 上午11:38:40 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public enum Action implements IEnum{
    /**
     * 新增
     */
    ADD(1),
    /**
     * 更新
     */
    UPDATE(2),
    ;
    private int value;

    private Action(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return this.value;
    }

    public static Action findByValue(int value) {
        if (value == 1) {
            return ADD;
        } else if (value == 2) {
            return UPDATE;
        }  else {
            return null;
        }

    }

}
