/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.gooday.logistics.biz.LsOrderBiz;
import cn.gooday.logistics.dao.LogisticsDao;
import cn.gooday.logistics.model.dto.DepotInfoDto;
import cn.gooday.logistics.model.entity.DepotInfo;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-services]
 * @Author: [tophawk]
 * @CreateDate: [2015/6/12 0:02]
 * @Update: [说明本次修改内容] BY[tophawk][2015/6/12]
 * @Version: [v1.0]
 */
@Component(value = "lsOrderBiz")
public class LsOrderBizImpl implements LsOrderBiz{

	@Autowired
    private LogisticsDao logisticsDao;

	@Override
    public DepotInfo getById(Long id){
		return logisticsDao.getById(id);
    }


}
