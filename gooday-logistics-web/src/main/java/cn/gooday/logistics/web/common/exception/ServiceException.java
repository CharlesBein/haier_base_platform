/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.web.common.exception;

import cn.gooday.service.common.ServiceConstants;
import cn.gooday.service.common.ServiceResult;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-ls]
 * @Author: [tophawk]
 * @CreateDate: [2015/6/14 8:54]
 * @Update: [说明本次修改内容] BY[tophawk][2015/6/14]
 * @Version: [v1.0]
 */
public class ServiceException extends RuntimeException {
    public ServiceException(String msg){
        super(msg);
    }
}
