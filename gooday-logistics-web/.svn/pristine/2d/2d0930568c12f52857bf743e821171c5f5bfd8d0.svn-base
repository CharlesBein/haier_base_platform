/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.web.common.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gooday.logistics.web.common.vo.JsonResult;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-ls]
 * @Author: [tophawk]
 * @CreateDate: [2015/6/14 22:33]
 * @Update: [说明本次修改内容] BY[tophawk][2015/6/14]
 * @Version: [v1.0]
 */
@Order(5)
@ControllerAdvice
public class ExceptionAdvice {
    private Logger logger = LoggerFactory.getLogger(ExceptionAdvice.class);

    @ExceptionHandler(ServiceException.class)
    @JsonView(JsonResult.ErrorView.class)//定义不同的view 隐藏掉一些字段
    //@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public JsonResult handleServerException(ServiceException ex) {
        ex.printStackTrace();
        logger.error("exception<service>:{}",ex.getMessage());
        return new JsonResult(null,false,ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @JsonView(JsonResult.ErrorView.class)//定义不同的view 隐藏掉一些字段
    //@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public JsonResult handleAllException(Exception ex) {
        ex.printStackTrace();
        logger.error("exception<all>:{}",ex.getMessage());
        return new JsonResult(null,false,"internal error!!");
    }
}
