package com.zizaike.is.open;

import com.zizaike.entity.open.HomestayDocking;

import java.util.List;

/**
 * Project Name: code <br/>
 * Function:QunarService. <br/>
 * date: 2016/3/3113:51 <br/>
 *
 * @author alex
 * @since JDK 1.7
 */
public interface QunarService {
    /**
     *
     * 返回需要给Qunar的所有酒店信息. <br/>
     * @author alex
     * @param
     * @since JDK 1.7
     */
    String getHotelList();

    /**
     * 获得所有推送的民宿 房型信息
     */
    List<HomestayDocking> queryAll();
}
