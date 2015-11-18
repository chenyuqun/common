/**  
 * Project Name:zizaike-is  <br/>
 * File Name:LoctypeService.java  <br/>
 * Package Name:com.zizaike.is.loctype  <br/>
 * Date:2015年11月10日下午1:48:03  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
*/  

package com.zizaike.is.recommend;  

import java.util.List;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.recommend.hot.Loctype;
import com.zizaike.entity.recommend.hot.Recommend;

/**  
 * ClassName:LoctypeService <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   地址 <br/>  
 * Date:     2015年11月10日 下午1:48:03 <br/>  
 * @author   alex  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */

public interface LoctypeService {
    /**
     * 
     * quryLoctype:查询地址信息. <br/>  
     *  
     * @author alex  
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    List<Loctype> queryLoctype (Loctype loctype) throws ZZKServiceException;
    /**
     * 
     * queryByAreaLevel:查询所有国家的行政级别是:省、市的数据. <br/>  
     *  
     * @author snow.zhang  
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    List<Loctype> queryByAreaLevel ()throws ZZKServiceException;
    
}
  
