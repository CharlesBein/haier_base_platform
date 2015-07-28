/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.web.common.service;

import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

import cn.gooday.logistics.web.common.exception.ServiceException;
import cn.gooday.service.common.ServiceConstants;
import cn.gooday.service.common.ServiceResult;

/**
 * [基类]
 *
 * @ProjectName: [gooday-ls]
 * @Author: [tophawk]
 * @CreateDate: [2015/6/14 7:50]
 * @Update: [说明本次修改内容] BY[tophawk][2015/6/14]
 * @Version: [v1.0]
 */
public class BaseService {
    @Autowired
    protected DozerBeanMapperFactoryBean beanMapper;

    /**
     * 过滤异常信息
     * @return
     */
    public ServiceException buildServiceException(ServiceResult ret){
        //转换相应错误信息到前端
        switch(ret.getCode()){
            case ServiceConstants.RETURN_APPLICATION_FAILURE:
                return new ServiceException("internal server error!");
            default://如果是系统异常，则不暴露细节给前端客户
                return new ServiceException(ret.getErrMsg());
        }
    }

    /**
     * 异常信息
     * @return
     */
    public ServiceException buildServiceException(String msg){
        //转换相应错误信息到前端
       return new ServiceException(msg);

    }
}
