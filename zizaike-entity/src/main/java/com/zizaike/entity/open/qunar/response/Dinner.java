package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Project Name: code <br/>
 * Function:Dinner. <br/>
 * date: 2016/4/6 14:13 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("dinner")
public class Dinner{
    @XStreamAsAttribute
    @XStreamAlias("count")
    private String count;

    @XStreamAsAttribute
    @XStreamAlias("desc")
    private String desc;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Dinner(String count, String desc) {
        this.count = count;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Dinner [count=" + count + ", desc=" + desc + "]";
    }
    
}
