/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.web.logic.depot.service;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import cn.gooday.logistics.api.service.LsOrderService;
import cn.gooday.logistics.model.dto.DepotSearchParam;
import cn.gooday.logistics.model.entity.DepotInfo;
import cn.gooday.logistics.web.common.service.BaseService;
import cn.gooday.logistics.web.logic.depot.vo.Depot;
import cn.gooday.logistics.web.util.dozer.DozerUtil;
import cn.gooday.logistics.web.util.param.ParamUtil;
import cn.gooday.service.common.ServiceConstants;
import cn.gooday.service.common.ServiceResult;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-ls]
 * @Author: [tophawk]
 * @CreateDate: [2015/6/14 7:46]
 * @Update: [说明本次修改内容] BY[tophawk][2015/6/14]
 * @Version: [v1.0]
 */
@Service
public class DepotService extends BaseService {
    private Logger logger = LoggerFactory.getLogger(DepotService.class);

    @Resource
    LsOrderService lsOrderService;

    public LsOrderService getLsOrderService() {
		return lsOrderService;
	}

	public void setLsOrderService(LsOrderService lsOrderService) {
		this.lsOrderService = lsOrderService;
	}

	public Depot getDepotInfo(long id) {
        DepotSearchParam p = new DepotSearchParam();
        p.setId(id);
        ServiceResult<DepotInfo> ret = lsOrderService.getLsOrder(ParamUtil.buildServiceParam(p));
        if (ret.getCode() == ServiceConstants.RETURN_SUCCESS) {
            try {
                return DozerUtil.convert(ret.getResult(), Depot.class, beanMapper.getObject());
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("service error:{}", e.getMessage());
                throw buildServiceException(e.getMessage());
            }
        } else {
            logger.error("service error:{}", ret.getErrMsg());
            throw buildServiceException(ret);
        }
    }
}
