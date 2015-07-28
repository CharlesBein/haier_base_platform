package cn.gooday.logistics.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import cn.gooday.logistics.dao.HmModelDatasetMppingIntDao;
import cn.gooday.logistics.model.entity.HmModelDatasetMppingInt;
import cn.gooday.service.common.dao.mybatis.impl.MybatisBaseGenericDAOImpl;


@Repository("hmModelDatasetMppingDao")
public class HmModelDatasetMppingDaoIntImpl
extends MybatisBaseGenericDAOImpl<HmModelDatasetMppingInt, java.lang.Integer>
implements HmModelDatasetMppingIntDao {
	
	/*
	@Autowired
	@Qualifier("sqlSessionDefault")
	private SqlSessionTemplate sqlSessionB;
	*/
	@Override
	protected SqlSessionTemplate getSession() {
		return null;
	}
	
	/**
	 * 生成UUID主键值。
	 * @param ob HmModelDatasetMpping对象
	 */
	protected void generateId(HmModelDatasetMppingInt ob) {
//		ob.setId(GeneratorKey.genaraId());
	}

}
