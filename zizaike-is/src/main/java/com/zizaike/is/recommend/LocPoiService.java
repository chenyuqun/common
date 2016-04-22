package com.zizaike.is.recommend;

import java.util.List;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.recommend.LocPoi;

/**
 * 
 * ClassName: LocPoiDao <br/>  
 * Function: poi. <br/>  
 * date: 2016年4月18日 下午3:46:39 <br/>  
 *  
 * @author snow.zhang  
 * @version   
 * @since JDK 1.7
 */
public interface LocPoiService {
   /**
    * 
    * queryLoctPoi:景点查询. <br/>  
    *  
    * @author snow.zhang  
    * @param poiName
    * @return
    * @throws ZZKServiceException  
    * @since JDK 1.7
    */
    List<LocPoi> queryLocPoi (String poiName)throws ZZKServiceException;
}