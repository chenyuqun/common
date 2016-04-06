package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import java.util.List;

/**
 * Project Name: code <br/>
 * Function:Remarks. <br/>
 * date: 2016/4/6 15:29 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("remarks")
public class Remarks {
    private List<Remark> remarks;

    public List<Remark> getRemarks() {
        return remarks;
    }

    public void setRemarks(List<Remark> remarks) {
        this.remarks = remarks;
    }

}
