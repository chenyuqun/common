/**  
 * Project Name:zizaike-core  <br/>
 * File Name:GenericMyIbatisDao.java  <br/>
 * Package Name:com.zizaike.core.framework.mybatis.impl  <br/>
 * Date:2015年11月4日下午3:36:42  <br/>
 * Copyright (c) 2015, zizaike.com All Rights Reserved.  
 *  
 */

package com.zizaike.core.framework.mybatis.impl;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zizaike.core.common.page.Page;
import com.zizaike.core.common.page.PageList;
import com.zizaike.core.common.util.ReflectionUtils;
import com.zizaike.core.framework.mybatis.IBaseDao;

/**
 * 
 * ClassName: GenericMyIbatisDao <br/>
 * Function: 基本dao. <br/>
 * date: 2015年11月4日 下午3:42:45 <br/>
 * 
 * @author snow.zhang
 * @param <T> object
 * @param <PK> 主键
 * @since JDK 1.7
 */
public abstract class GenericMyIbatisDao<T, PK extends Serializable> extends SqlSessionDaoSupport implements
        IBaseDao<T, PK> {
    protected final Logger log = LoggerFactory.getLogger(getClass());
    private Class<T> entityClass;
    private String entityClassName;
    private String selectByPrimaryKey;
    private String delete;
    private String deleteByPrimaryKey;
    private String insertSelective;
    private String count;
    private String queryPage;
    private String updateByPrimaryKeySelective;
    private String queryByUUID;
    private Map map;

    public GenericMyIbatisDao() {
        this.entityClass = ReflectionUtils.getSuperClassGenericType(getClass());
        this.entityClassName = this.entityClass.getSimpleName();

        log.debug("GenericIbatisDao() " + entityClassName);
        this.count = MessageFormat.format("{0}.count", new Object[] { this.entityClassName });
        this.selectByPrimaryKey = MessageFormat.format("{0}.selectByPrimaryKey", new Object[] { this.entityClassName });
        this.delete = MessageFormat.format("{0}.delete", new Object[] { this.entityClassName });
        this.deleteByPrimaryKey = MessageFormat.format("{0}.deleteByPrimaryKey", new Object[] { this.entityClassName });
        this.insertSelective = MessageFormat.format("{0}.insertSelective", new Object[] { this.entityClassName });
        this.queryPage = MessageFormat.format("{0}.queryPage", new Object[] { this.entityClassName });
        this.updateByPrimaryKeySelective = MessageFormat.format("{0}.updateByPrimaryKeySelective",
                new Object[] { this.entityClassName });
        this.queryByUUID = MessageFormat.format("{0}.queryByUUID", new Object[] { this.entityClassName });
    }

    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    /**
     * 增加
     * 
     * @return
     * @throws Exception
     */
    public int insertSelective(T entity) {
        int result = -1;
        try {
            result = this.getSqlSession().insert(this.insertSelective, entity);
        } catch (Exception e) {
            logger.error("新增失败！" + e);
        }
        return result;
    }

    /**
     * 根据主键更新信息
     * 
     * @return
     * @throws Exception
     */
    public int updateByPrimaryKeySelective(T entity) {
        int result = -1;
        try {
            result = this.getSqlSession().update(this.updateByPrimaryKeySelective, entity);
        } catch (Exception e) {
            logger.error("更新失败！" + e);
        }
        return result;
    }

    /**
     * 根据主键查询
     * 
     * @param id
     * @return
     * @throws Exception
     */
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public T selectByPrimaryKey(PK id) throws Exception {
        return this.getSqlSession().selectOne(this.selectByPrimaryKey, id);
    }

    public PageList<T> queryPage(Page page, Map<String, Object> paramMap) throws Exception {
        int totalCount = ((Integer) this.getSqlSession().selectOne(this.count, paramMap)).intValue();
        if (paramMap == null) {
            Map<String, Object> map = new HashMap<String, Object>();
            paramMap.putAll(map);
        }
        page.setTotalCount(totalCount);
        paramMap.put("startIndex", page.getStartIndex());// 设置起始
        paramMap.put("pageSize", page.getPageSize());// 设置结束

        List<T> list = this.getSqlSession().selectList(this.queryPage, paramMap);// 查询结果

        PageList<T> pagingList = new PageList<T>(list, page);

        return pagingList;
    }

    /**
     * 删除
     * 
     * @param entity
     * @return influencdRow
     * @throws Exception
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int delete(Map<String, Object> paramMap) throws Exception {
        int influencdRow = 0;

        influencdRow = getSqlSession().delete(this.delete, paramMap);

        return influencdRow;
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public int deleteByPrimaryKey(PK id) throws Exception {

        int influencdRow = 0;

        influencdRow = getSqlSession().delete(this.deleteByPrimaryKey, id);

        return influencdRow;
    }

}
