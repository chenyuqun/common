/**  
 * Project Name:zizaike-is  <br/>
 * File Name:BaseInfoService.java  <br/>
 * Package Name:com.zizaike.is.open  <br/>
 * Date:2016年3月7日下午5:57:25  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.is.open;  

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.open.OpenDiscount;
import com.zizaike.entity.open.RoomInfoDto;

/**  
 * ClassName:BaseInfoService <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2016年3月7日 下午5:57:25 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public interface BaseInfoService {
    /**
     * 
     * getRefundAndBreakfast: <br/> 
     *  
     * @author alex 
     * @param nid
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    RoomInfoDto getRefundAndBreakfast(int nid)throws ZZKServiceException;

    /**
     *
     * getOpenConfig: <br/>
     *
     * @author alex
     * @param openConfig
     * @return
     * @throws ZZKServiceException
     * @since JDK 1.7
     */
    OpenDiscount getOpenDiscount(OpenDiscount openDiscount)throws ZZKServiceException;
}
  
