/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.web.logic.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gooday.logistics.api.service.HmModelDatasetMppingIntService;
import cn.gooday.logistics.model.entity.HmModelDatasetMppingInt;
import cn.gooday.logistics.web.common.service.BaseService;
import cn.gooday.logistics.web.logic.demo.vo.HmModelDatasetMppingIntVo;
import cn.gooday.logistics.web.util.dozer.DozerUtil;
import cn.gooday.service.common.ServiceConstants;
import cn.gooday.service.common.ServiceResult;
import cn.gooday.service.common.util.page.IGenericPage;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-logistics-web]
 * @Author: [tophawk]
 * @CreateDate: [2015/7/2 7:46]
 * @Update: [说明本次修改内容] BY[tophawk][2015/7/2]
 * @Version: [v1.0]
 */
@SuppressWarnings("unchecked")
@Service
public class DemoService extends BaseService {
    private Logger logger = LoggerFactory.getLogger(DemoService.class);
    
    @Autowired
    HmModelDatasetMppingIntService hmModelDatasetMppingIntService;
    
	public HmModelDatasetMppingIntVo getById(Integer id) {
        ServiceResult<HmModelDatasetMppingInt> ret = hmModelDatasetMppingIntService.getById(id);
        if (ret.getCode() == ServiceConstants.RETURN_SUCCESS) {
            try {
            	//VO对象和DTO对象转换，有属性不一样的需要做配置
                return DozerUtil.convert(ret.getResult(), HmModelDatasetMppingIntVo.class, beanMapper.getObject());
            } catch (Exception e) {
                logger.error("service error:{}", e.getMessage());
                throw buildServiceException(e.getMessage());
            }
        } else {
            logger.error("service error:{}", ret.getErrMsg());
            throw buildServiceException(ret);
        }
    }
    
    
    public IGenericPage<HmModelDatasetMppingInt> findPageBy(HmModelDatasetMppingInt param,int currentPage,int rows,String sort,String dir) {
        ServiceResult<IGenericPage<HmModelDatasetMppingInt>> ret = hmModelDatasetMppingIntService.findPageByParam(param, currentPage, rows, sort, dir);
        if (ret.getCode() == ServiceConstants.RETURN_SUCCESS) {
            try {
            	//VO对象和DTO对象转换，这里的例子不做转换
//                return DozerUtil.convert(ret.getResult(), HmModelDatasetMppingIntVo.class, beanMapper.getObject());
            	return ret.getResult();
            } catch (Exception e) {
                logger.error("service error:{}", e.getMessage());
                throw buildServiceException(e.getMessage());
            }
        } else {
            logger.error("service error:{}", ret.getErrMsg());
            throw buildServiceException(ret);
        }
    }
    
    
    public boolean saveOrUpdate(HmModelDatasetMppingInt param) {
        ServiceResult<Boolean> ret = hmModelDatasetMppingIntService.saveOrUpdate(param);
        if (ret.getCode() == ServiceConstants.RETURN_SUCCESS) {
            try {
            	return ret.getResult();
            } catch (Exception e) {
                logger.error("service error:{}", e.getMessage());
                throw buildServiceException(e.getMessage());
            }
        } else {
            logger.error("service error:{}", ret.getErrMsg());
            throw buildServiceException(ret);
        }
    }
    
   
}
