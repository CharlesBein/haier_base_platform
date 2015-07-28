package cn.gooday.logistics.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import cn.gooday.logistics.dao.LogisticsDao;
import cn.gooday.logistics.model.entity.DepotInfo;
import cn.gooday.logistics.model.entity.HmModelDatasetMppingInt;
import cn.gooday.service.common.dao.mybatis.impl.MybatisBaseGenericDAOImpl;

@Repository("logisticsDao")
public class LogisticsDaoImpl extends MybatisBaseGenericDAOImpl<DepotInfo, java.lang.Long> implements LogisticsDao {

	/**
	 * 生成UUID主键值。
	 * @param ob HmModelDatasetMpping对象
	 */
	protected void generateId(HmModelDatasetMppingInt ob) {
//		ob.setId(GeneratorKey.genaraId());
	}

	@Override
	protected SqlSessionTemplate getSession() {
		return null;
	}
	
}
