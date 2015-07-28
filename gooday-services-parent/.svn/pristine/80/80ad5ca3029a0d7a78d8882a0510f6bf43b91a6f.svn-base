/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.aspect;

import cn.gooday.service.common.ServiceConstants;
import cn.gooday.service.common.ServiceResult;
import cn.gooday.service.common.ServiceTool;
import cn.gooday.service.common.exception.ApplicationException;
import cn.gooday.service.common.exception.BusinessException;
import cn.gooday.service.common.util.LogUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday_dubbo_service]
 * @Author: [tophawk]
 * @CreateDate: [2015/5/12 10:58]
 * @Update: [说明本次修改内容] BY[tophawk][2015/5/12]
 * @Version: [v1.0]
 */
@Aspect
@Component
@Order(0) //配置文件中的声明式事务的order要大于0才会生效
public class ExceptionAspect {

    /**
     * 配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
     */
    @Pointcut("execution(* cn.gooday.service.logistics.impl..*(..))")
    public void aspect() {
    }

    @Around("aspect()")
    public ServiceResult around(JoinPoint joinPoint) {
        LogUtil.debug("===============START");
        ServiceResult result;

        try {
            result = (ServiceResult) ((ProceedingJoinPoint) joinPoint).proceed();
        } catch (Throwable e) {
            LogUtil.err(e);
            if(e instanceof BusinessException){
                return ServiceTool.buildBusinessFailResult(e.getMessage());
            }else{
                return ServiceTool.buildApplicationFailResult(e.getMessage());
            }
        }

        LogUtil.debug("===============END");
        return result;
    }
}
