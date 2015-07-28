/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.web.logic.depot.action.v1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.gooday.logistics.web.common.action.BaseAction;
import cn.gooday.logistics.web.common.vo.JsonResult;
import cn.gooday.logistics.web.logic.depot.service.DepotService;
import cn.gooday.logistics.web.logic.depot.vo.Depot;
import cn.gooday.logistics.web.util.config.ConfigUtil;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-ls]
 * @Author: [tophawk]
 * @CreateDate: [2015/6/9 21:43]
 * @Update: [说明本次修改内容] BY[tophawk][2015/6/9]
 * @Version: [v1.0]
 */
@RestController(value="depotAction_v1")
@RequestMapping("/v1/depot")
public class DepotAction extends BaseAction {
    private Logger logger = LoggerFactory.getLogger(DepotAction.class);
    @Autowired
    DepotService depotService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    //@JsonView(JsonResult.NormalView.class)//定义不同的view 隐藏掉一些字段
    public JsonResult<Depot> testGetDepotInfo(@PathVariable long id) {
//        logger.debug("receive:{}",id);
//        Depot depot = new Depot();
//        depot.setId(1);
//        depot.setName("青岛1号仓");
//        depot.setNum(100);

        logger.debug(ConfigUtil.getString("depot.key.test"));
        Depot depot = depotService.getDepotInfo(id);
        //不用捕获异常，异常会用aop统一控制
        return buildJsonResult(depot);
    }

    @RequestMapping(value = "/{id}/{name}", method = RequestMethod.PUT, produces = {"application/json;charset=UTF-8"})
    //@JsonView(JsonResult.NormalView.class)//定义不同的view 隐藏掉一些字段
    public JsonResult<Depot> testPutDepotInfo(@PathVariable long id, @PathVariable String name) {
//        logger.debug("receive:{}",id);
//        Depot depot = new Depot();
//        depot.setId(1);
//        depot.setName("青岛1号仓");
//        depot.setNum(100);
        logger.debug("name:{}", name);
        Depot depot = depotService.getDepotInfo(id);
        //不用捕获异常，异常会用aop统一控制
        return buildJsonResult(depot);
    }
}
