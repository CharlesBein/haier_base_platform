/**
 * 巨商汇平台 版权所有 Copyright@2015
 */
package test;

import javax.annotation.Resource;

import org.junit.Test;

import cn.gooday.logistics.model.dto.DepotSearchParam;
import cn.gooday.logistics.service.order.impl.LsOrderServiceImpl;
import cn.gooday.service.common.ServiceParam;
import cn.gooday.service.common.ServiceResult;
import cn.gooday.service.common.util.LogUtil;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-services]
 * @Author: [hero]
 * @CreateDate: [2015/06/16 0016 14:11]
 * @Update: [说明本次修改内容] BY[admin][2015/06/16 0016]
 * @Version: [v1.0]
 */
public class TestLogisticsService extends SpringConfigLoader {

    @Resource
    private LsOrderServiceImpl lsOrderService;

    @Test
    public void testGetLsOrder(){
        long id = 17;

        DepotSearchParam param = new DepotSearchParam();
        param.setId(id);

        ServiceParam<DepotSearchParam> serviceParam = new ServiceParam<DepotSearchParam>();
        serviceParam.setParam(param);

        ServiceResult serviceResult = lsOrderService.getLsOrder(serviceParam);

        LogUtil.info("------------------->>>>>"+serviceResult.getResult().toString());
    }
}
