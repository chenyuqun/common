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
import com.zizaike.entity.recommend.DestConfig;


/**
 * 
 * ClassName: DestConfigService <br/>  
 * Function: 国家服务. <br/>  
 * date: 2015年11月19日 下午3:23:28 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */

public interface DestConfigService {
    List<DestConfig> query() throws ZZKServiceException;
    
    DestConfig queryByDestId(Integer destId) throws ZZKServiceException;
}
  
