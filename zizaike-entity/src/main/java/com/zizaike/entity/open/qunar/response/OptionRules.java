package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import java.util.List;

/**
 * Project Name: code <br/>
 * Function:OptionRules. <br/>
 * date: 2016/4/6 16:36 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("optionRules")
public class OptionRules {
    private List<OptionRule> optionRules;

    public List<OptionRule> getOptionRules() {
        return optionRules;
    }

    public void setOptionRules(List<OptionRule> optionRules) {
        this.optionRules = optionRules;
    }


}
