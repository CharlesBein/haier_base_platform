package cn.gooday.logistics.biz.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.gooday.logistics.biz.HmModelDatasetMppingIntBiz;
import cn.gooday.logistics.dao.HmModelDatasetMppingIntDao;
import cn.gooday.logistics.model.entity.HmModelDatasetMppingInt;
import cn.gooday.service.common.util.page.IGenericPage;



@Component("hmModelDatasetMppingIntBiz")
public class HmModelDatasetMppingIntBizImpl implements HmModelDatasetMppingIntBiz {
	@Autowired
	private HmModelDatasetMppingIntDao hmModelDatasetMppingIntDao;

	
	public HmModelDatasetMppingInt getById(Integer id) {
		return hmModelDatasetMppingIntDao.getById(id);
	}

	
	public Integer deleteByIds(Integer[] ids) {
		return hmModelDatasetMppingIntDao.deleteByIds(ids);

	}

	
	public boolean save(HmModelDatasetMppingInt ob) {
		return hmModelDatasetMppingIntDao.save(ob) > 0;
	}

	
	public boolean update(HmModelDatasetMppingInt ob) {
		return hmModelDatasetMppingIntDao.update(ob) > 0;
	}

	
	public boolean saveOrUpdate(HmModelDatasetMppingInt ob) {
		if (ob != null) {
			// 如果ID不为空说明是修改的实例，为更新操作
			if (ob.getId()!=null && ob.getId()>0) {
				return hmModelDatasetMppingIntDao.update(ob) > 0;
			} else {
				return hmModelDatasetMppingIntDao.save(ob) > 0;
			}
		}
		return false;
	}

	
	public IGenericPage<HmModelDatasetMppingInt> findPageByParam(
			HmModelDatasetMppingInt param,
			int currentPage,
			int rows,
			String sort,
			String dir) {
		return hmModelDatasetMppingIntDao.findPageBy(
				wrapParams(param), currentPage, rows, sort, dir);
	}

	
	public Integer getCountByParam(HmModelDatasetMppingInt param) {
		return hmModelDatasetMppingIntDao.getCountBy(wrapParams(param));
	}

	
	public List<HmModelDatasetMppingInt> findByParam(
			HmModelDatasetMppingInt param,
			String sort,
			String dir) {
		return hmModelDatasetMppingIntDao.findListBy(
				wrapParams(param), sort, dir);
	}

	private HmModelDatasetMppingInt wrapParams(HmModelDatasetMppingInt param) {
		if(param != null){
			if(StringUtils.isNotEmpty(param.getModelId())){
				param.setModelId("%"+param.getModelId()+"%");
			}
			if(StringUtils.isNotEmpty(param.getDatasetIds())){
				param.setDatasetIds("%"+param.getDatasetIds()+"%");
			}
			if(StringUtils.isNotEmpty(param.getMappingInfo())){
				param.setMappingInfo("%"+param.getMappingInfo()+"%");
			}
			if(StringUtils.isNotEmpty(param.getRemark())){
				param.setRemark("%"+param.getRemark()+"%");
			}
			if(StringUtils.isNotEmpty(param.getType())){
				param.setType("%"+param.getType()+"%");
			}
		}
		return param;
	}

}
