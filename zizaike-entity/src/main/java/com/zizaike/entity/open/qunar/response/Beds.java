package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Project Name: code <br/>
 * Function:Beds. <br/>
 * date: 2016/4/5 15:24 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("beds")
public class Beds {
    /**
     * 此床型的id，如果提供了多种房型，在Reservation API中的bedChoice节点会用到此值。
     */
    @XStreamAsAttribute
    @XStreamAlias("seq")
    private String seq;
    /**
     * 参照枚举BedTypeCode，不确定填OTHERS
     */
    @XStreamAsAttribute
    @XStreamAlias("code")
    private BedTypeCode code;

    @XStreamAsAttribute
    @XStreamAlias("desc")
    private String desc;

    @XStreamAsAttribute
    @XStreamAlias("count")
    private Integer count;

    @XStreamAsAttribute
    @XStreamAlias("size")
    private String size;

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public BedTypeCode getCode() {
        return code;
    }

    public void setCode(BedTypeCode code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
