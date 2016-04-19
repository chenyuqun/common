package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Project Name: code <br/>
 * Function:BedType. <br/>
 * date: 2016/4/5 15:06 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("bedType")
public class BedType {
    @XStreamAsAttribute
    @XStreamAlias("relation")
    private String relation;
    @XStreamImplicit(itemFieldName = "beds")
    private List<Beds> beds;

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public List<Beds> getBeds() {
        return beds;
    }

    public void setBeds(List<Beds> beds) {
        this.beds = beds;
    }

    @Override
    public String toString() {
        return "BedType [relation=" + relation + ", beds=" + beds + "]";
    }
    
}
