package com.zizaike.entity.solr.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * 所有dest的枚举
 * Function:Dest. <br/>
 * date: 2016/5/9 19:30 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
public enum Dest {
    TAIWAN(10,"台湾"),
    JAPAN(11,"日本"),
    CHINA(12,"中国大陆"),
    USA(13,"美国"),
    HONG_KONG(14,"香港"),
    KOREA(15,"韩国");
    private final int value;
    private final String text;

    private  Dest(int value,String text) {
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return this.value;
    }
    public String getText() {
        return this.text;
    }

    //通过ID获取显示名称
    public static String findText(Integer value) {
        if(value == null){
            return "";
        }
        Dest [] arrays =  Dest.values();
        for( Dest w : arrays){
            if(w.getValue() == value) {
                return w.getText();
            }
        }
        return "";
    }

    //获得所有的枚举值和类型
    public static Map<Integer,String> getDest(){
        Map<Integer,String> destMap = new HashMap<Integer,String>();
        Dest [] arrays =  Dest.values();
        for( Dest w : arrays){
            destMap.put(w.getValue(), w.getText());
        }
        return destMap;

    }



}
