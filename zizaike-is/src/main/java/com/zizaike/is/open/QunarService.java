package com.zizaike.is.open;

import com.zizaike.core.framework.exception.ZZKServiceException;
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
     * @since JDK 1.7
     */
    String getHotelList();

    /**
     * 获得所有推送的民宿 房型信息
     * @author alex
     * @since JDK 1.7
     */
    List<HomestayDocking> queryAll();

    /**
     *
     * 报价个借口数据. <br/>
     * @author alex
     * @param xml
     * @since JDK 1.7
     */
    String getPriceResponse(String xml);

    /**
     *qunar预定
     */
    String  book(String xml);



}
