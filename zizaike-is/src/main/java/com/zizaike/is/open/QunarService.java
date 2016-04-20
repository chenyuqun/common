package com.zizaike.is.open;

import com.alibaba.fastjson.JSONObject;
import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.open.HomestayDocking;
import com.zizaike.entity.open.qunar.OrderQueryVO;
import com.zizaike.entity.open.qunar.OtaOptVO;

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
     * 预订
     * @author alex
     * @param xml
     * @return
     */
    String  book(String xml);

    /**
     *
     * cancelBooking: 取消预订<br/>
     *
     * @author lin
     * @param xml
     * @return
     * @throws ZZKServiceException
     * @since JDK 1.7
     */
    String cancelBooking(String xml) throws ZZKServiceException;

    /**
     * 查询
     * @author alex
     * @param xml
     * @return
     */
    String query(String xml);

    /**
     *查询qunar的订单信息
     * @return
     */
    String qunarOrderQuery(String orderNums);

    /**
     * 操作qunar订单
     */
    JSONObject qunarOrderOpt(OtaOptVO otaOptVO);

}
