package cn.gooday.logistics.service.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gooday.logistics.api.service.HmModelDatasetMppingIntService;
import cn.gooday.logistics.biz.HmModelDatasetMppingIntBiz;
import cn.gooday.logistics.model.entity.HmModelDatasetMppingInt;
import cn.gooday.service.common.ServiceResult;
import cn.gooday.service.common.ServiceTool;
import cn.gooday.service.common.exception.BusinessException;
import cn.gooday.service.common.util.page.IGenericPage;

@SuppressWarnings("rawtypes")
@Service("hmModelDatasetMppingIntService")
public class HmModelDatasetMppingIntServiceImpl implements HmModelDatasetMppingIntService {
	@Autowired
	private HmModelDatasetMppingIntBiz hmModelDatasetMppingIntBiz;

	
	public ServiceResult getById(Integer id) {
		if (id == null || id <= 0) {
            return ServiceTool.buildBusinessFailResult("param", id+"", "is not correct!");
        }
		//业务查询返回
		HmModelDatasetMppingInt result = hmModelDatasetMppingIntBiz.getById(id);
		if (result == null)
            throw new BusinessException("depot not found!");
		return ServiceTool.buildSuccessResult(result);
	}
	
	
	public ServiceResult saveOrUpdate(HmModelDatasetMppingInt ob) {
		if (ob == null) {
            return ServiceTool.buildBusinessFailResult("param", "HmModelDatasetMppingInt", "is not correct!");
        }
		boolean result = false;
		// 如果ID不为空说明是修改的实例，为更新操作
		if (ob.getId()!=null && ob.getId()>0) {
			result =  hmModelDatasetMppingIntBiz.update(ob);
		} else {
			result = hmModelDatasetMppingIntBiz.save(ob);
		}
		if (!result)
            throw new BusinessException("saveOrUpdate is failed!");
		return ServiceTool.buildSuccessResult(result);
	}

	
	public ServiceResult findPageByParam(HmModelDatasetMppingInt param,int currentPage,int rows,String sort,String dir) {
		IGenericPage<HmModelDatasetMppingInt> result = hmModelDatasetMppingIntBiz.findPageByParam(
				param, currentPage, rows, sort, dir);
		if (result == null || result.getTotalCount()<=0)
            throw new BusinessException("HmModelDatasetMppingInt not found!");
		return ServiceTool.buildSuccessResult(result);
	}

	
	public Integer deleteByIds(Integer[] ids) {
		return hmModelDatasetMppingIntBiz.deleteByIds(ids);

	}

	
	public boolean save(HmModelDatasetMppingInt ob) {
		return hmModelDatasetMppingIntBiz.save(ob);
	}

	
	public boolean update(HmModelDatasetMppingInt ob) {
		return hmModelDatasetMppingIntBiz.update(ob);
	}

	
	

	
	public Integer getCountByParam(HmModelDatasetMppingInt param) {
		return hmModelDatasetMppingIntBiz.getCountByParam(param);
	}

	
	public List<HmModelDatasetMppingInt> findByParam(
			HmModelDatasetMppingInt param,
			String sort,
			String dir) {
		return hmModelDatasetMppingIntBiz.findByParam(
				param, sort, dir);
	}

	

}
