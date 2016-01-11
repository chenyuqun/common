/**  
 * Project Name:zizaike-entity  <br/>
 * File Name:language.java  <br/>
 * Package Name:com.zizaike.entity.common  <br/>
 * Date:2016年1月10日下午6:35:52  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.entity.common;  

import com.zizaike.core.framework.ienum.IEnum;

/**  
 * ClassName:language <br/>  
 * Function: 语言. <br/>  
 * Date:     2016年1月10日 下午6:35:52 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public enum Langue implements IEnum{
    /**
     * 繁体
     */
    ZH_TW(10),
    /**
     * 中文简体
     */
    ZH_CN(14),;
    private int value;
    private Langue(int value){
        this.value = value;
    }
    @Override
    public int getValue() {
        return this.value;
    }
    
    public static Langue findByValue(int value) {
        if (value ==10) {
            return ZH_TW;
        } else if (value == 14) {
            return ZH_CN;
        }  else {
            return null;
        }

    }
    
}
  
