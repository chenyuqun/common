package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Project Name: code <br/>
 * Function:Remark. <br/>
 * date: 2016/4/6 16:23 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("remark")
public class Remark{
    @XStreamAsAttribute
    @XStreamAlias("seq")
    private Integer seq;
    @XStreamAsAttribute
    @XStreamAlias("value")
    private String value;


    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Remark(Integer seq, String value) {
        super();
        this.seq = seq;
        this.value = value;
    }
}
