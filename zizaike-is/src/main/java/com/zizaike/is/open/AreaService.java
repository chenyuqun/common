/**  
 * Project Name:zizaike-is  <br/>
 * File Name:UserService.java  <br/>
 * Package Name:com.zizaike.is.open  <br/>
 * Date:2016年1月19日下午6:21:09  <br/>
 * Copyright (c) 2016, zizaike.com All Rights Reserved.  
 *  
*/  
  
package com.zizaike.is.open;  

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.open.alibaba.Area;

/**  
 * ClassName:UserService <br/>  
 * Function: 地址服务. <br/>  
 * Date:     2016年1月19日 下午6:21:09 <br/>  
 * @author   snow.zhang  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public interface AreaService {
    /**
     * 
     * findAreaByTypeCode:通过typeCode找Area. <br/>  
     * @author snow.zhang  
     * @param typeCode
     * @return 
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    Area getAreaCodeTypeCode(String typeCode) throws ZZKServiceException;


}
  
