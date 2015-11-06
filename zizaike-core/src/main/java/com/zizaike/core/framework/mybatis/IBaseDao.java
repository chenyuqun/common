package com.zizaike.core.framework.mybatis;

import java.io.Serializable;
import java.util.Map;

import com.zizaike.core.common.page.Page;
import com.zizaike.core.common.page.PageList;

/**
 * 
 * ClassName: IBaseDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: 查询基本类. <br/>
 * date: 2015年11月4日 下午3:33:26 <br/>
 * 
 * @author snow.zhang
 * @param <T>
 * @param <PK> 主键
 * @since JDK 1.7
 */
public interface IBaseDao<T, PK extends Serializable> {

    /**
     * insertSelective
     * 
     * @param entity
     * @return
     */
    int insertSelective(T entity);

    /**
     * updateByPK
     * 
     * @param entity
     * @return
     * @throws Exception
     */
    int updateByPrimaryKeySelective(T entity) throws Exception;

    /**
     * 
     * selectByPrimaryKey:主键查询. <br/>
     * 
     * @author bin.zhang
     * @param id
     * @return
     * @throws Exception
     * @since JDK 1.7
     */
    T selectByPrimaryKey(PK id) throws Exception;

    /**
     * queryPage
     * 
     * @param page
     * @param paramMap
     * @return
     * @throws Exception
     */
    PageList<T> queryPage(Page page, Map<String, Object> paramMap) throws Exception;

    /**
     * delete
     * 
     * @param paramMap
     * @return
     * @throws Exception
     */
    int delete(Map<String, Object> paramMap) throws Exception;

    /**
     * deleteByPK
     * 
     * @param id
     * @return
     * @throws Exception
     */
    int deleteByPrimaryKey(PK id) throws Exception;

}
