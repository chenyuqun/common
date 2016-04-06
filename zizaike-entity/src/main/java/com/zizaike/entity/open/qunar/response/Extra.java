package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Project Name: code <br/>
 * Function:Extra. <br/>
 * date: 2016/4/6 19:13 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("property")
public class Extra {
    @XStreamAsAttribute
    @XStreamAlias("key")
    private String key;
    @XStreamAsAttribute
    @XStreamAlias("value")
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Extra(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
