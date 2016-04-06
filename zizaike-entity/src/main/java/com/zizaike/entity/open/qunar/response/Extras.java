package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;

/**
 * Project Name: code <br/>
 * Function:Extras. <br/>
 * date: 2016/4/6 19:13 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("extras")
public class Extras {
    private List<Extra> extras;

    public List<Extra> getExtras() {
        return extras;
    }

    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }
}
