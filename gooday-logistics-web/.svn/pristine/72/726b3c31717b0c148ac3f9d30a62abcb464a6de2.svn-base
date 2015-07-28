/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.web.logic.demo.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.gooday.logistics.api.service.HmModelDatasetMppingIntService;
import cn.gooday.logistics.model.entity.HmModelDatasetMppingInt;
import cn.gooday.logistics.web.common.action.BaseAction;
import cn.gooday.logistics.web.common.vo.JsonResult;
import cn.gooday.logistics.web.logic.demo.service.DemoService;
import cn.gooday.logistics.web.logic.demo.vo.HmModelDatasetMppingIntVo;
import cn.gooday.service.common.util.page.IGenericPage;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-logistics-web]
 * @Author: [tophawk]
 * @CreateDate: [2015/7/2 21:43]
 * @Update: [说明本次修改内容] BY[tophawk][2015/7/2]
 * @Version: [v1.0]
 */
@SuppressWarnings({"unchecked","unused"})
@RestController
@RequestMapping("/demo")
public class HmModelDatasetMppingIntAction extends BaseAction{
	private Logger logger = LoggerFactory.getLogger(HmModelDatasetMppingIntAction.class);

    @Autowired
    DemoService demoService;
    /**
     * 根据ID获取
     * @param id
     * @return
     */
    @RequestMapping(value = "/getById",method= RequestMethod.GET,produces={"application/json;charset=UTF-8"})
    public JsonResult<HmModelDatasetMppingInt> testGetById(Integer id ) {
    	HmModelDatasetMppingIntVo hmModelDatasetMppingIntVo = demoService.getById(id);
        return buildJsonResult(hmModelDatasetMppingIntVo);
    }
    
    /**
     * 分页查询
     * @param param
     * @return
     */
    @RequestMapping(value = "/findPageBy",method= RequestMethod.GET,produces={"application/json;charset=UTF-8"})
    public JsonResult<IGenericPage<HmModelDatasetMppingInt>> testFindPageBy(HmModelDatasetMppingInt param) {
    	IGenericPage<HmModelDatasetMppingInt> page = demoService.findPageBy(param, 1, 10, "id", "desc");
        return buildJsonResult(page);
    }
    
    /**
     * 新增
     * @param param
     * @return
     */
	@RequestMapping(value = "/save",method= RequestMethod.GET,produces={"application/json;charset=UTF-8"})
    public JsonResult<IGenericPage<HmModelDatasetMppingInt>> testSave(HmModelDatasetMppingInt param) {
    	boolean isOk = demoService.saveOrUpdate(param);
        return buildJsonResult(isOk);
    }
    
    
    /**
     * 修改
     * @param param
     * @return
     */
    @RequestMapping(value = "/update",method= RequestMethod.GET,produces={"application/json;charset=UTF-8"})
    public JsonResult<IGenericPage<HmModelDatasetMppingInt>> testUpdate(HmModelDatasetMppingInt param) {
    	demoService.saveOrUpdate(param);
        return buildJsonResult(null);
    }
    
}
