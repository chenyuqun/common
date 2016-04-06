package com.zizaike.entity.open.qunar.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Project Name: code <br/>
 * Function:Meal. <br/>
 * date: 2016/4/5 20:27 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
@XStreamAlias("meal")
public class Meal {
    @XStreamAlias("breakfast")
    private Breakfast breakfast;
    @XStreamAlias("lunch")
    private Lunch lunch;
    @XStreamAlias("dinner")
    private Dinner dinner;

    public Breakfast getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Breakfast breakfast) {
        this.breakfast = breakfast;
    }

    public Lunch getLunch() {
        return lunch;
    }

    public void setLunch(Lunch lunch) {
        this.lunch = lunch;
    }

    public Dinner getDinner() {
        return dinner;
    }

    public void setDinner(Dinner dinner) {
        this.dinner = dinner;
    }


}
