package cn.gooday.logistics.service.order.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gooday.logistics.api.service.LsOrderService;
import cn.gooday.logistics.biz.LsOrderBiz;
import cn.gooday.logistics.model.dto.DepotInfoDto;
import cn.gooday.logistics.model.dto.DepotSearchParam;
import cn.gooday.logistics.model.entity.DepotInfo;
import cn.gooday.service.common.ServiceParam;
import cn.gooday.service.common.ServiceResult;
import cn.gooday.service.common.ServiceTool;
import cn.gooday.service.common.exception.BusinessException;

/**
 * //声明式事务
 */
@Service
public class LsOrderServiceImpl implements LsOrderService {
    @Resource
    private LsOrderBiz lsOrderBiz;

    @Override
    public ServiceResult getLsOrder(ServiceParam<DepotSearchParam> param) {
        //参数校验
        DepotSearchParam info = param.getParam();

        if (info == null || info.getId() == 0) {
            return ServiceTool.buildBusinessFailResult("param", info.toString(), "is not correct!");
        }

        //业务查询返回
        DepotInfo result = lsOrderBiz.getById(info.getId());
        if (result == null)
            throw new BusinessException("depot not found!");
        return ServiceTool.buildSuccessResult(result);
    }
}
