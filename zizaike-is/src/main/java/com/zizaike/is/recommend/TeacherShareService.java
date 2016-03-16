package com.zizaike.is.recommend;

import com.zizaike.core.framework.exception.ZZKServiceException;
import com.zizaike.entity.recommend.TeacherShare;

import java.util.List;

/**
 *
 * ClassName: SearchStatisticsService <br/>
 * Function:讲师服务. <br/>
 * date: 2016年3月14日 下午4:26:14 <br/>
 *
 * @author alex
 * @version
 * @since JDK 1.7
 */
public interface TeacherShareService {
    /**
     * 
     * query:query对象. <br/>  
     * @author alex 
     * @return
     * @throws ZZKServiceException  
     * @since JDK 1.7
     */
    List<TeacherShare> query() throws ZZKServiceException;
}
