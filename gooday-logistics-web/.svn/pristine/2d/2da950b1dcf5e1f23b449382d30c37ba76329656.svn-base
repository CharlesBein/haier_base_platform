/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.web.common.aspect;

import cn.gooday.logistics.web.common.vo.JsonResult;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * [做调用安全方面的拦截]
 *
 * @ProjectName: [gooday_ls]
 * @Author: [tophawk]
 * @CreateDate: [2015/6/12 10:58]
 * @Update: [说明本次修改内容] BY[tophawk][2015/6/15]
 * @Version: [v1.0]
 */

@Component
@Order(3)
@Aspect
public class SecureAspect {
    private Logger logger = LoggerFactory.getLogger(SecureAspect.class);

    /**
     * 配置切入点,该方法无方法体,主要为方便同类中其他方法使用此处配置的切入点
     */
//    @Pointcut("execution(* cn.gooday.logistics.logic.*.action.*(..))")
    @Pointcut("execution(* cn.gooday.logistics.logic.*.action..*(..))")

    public void aspect() {
    }

    @Around("aspect()")
    public JsonResult around(JoinPoint joinPoint) {
        System.out.println("===============START=========");
        JsonResult result;

        //TODO 先默认对所有方法都验证串
        Object params[] = joinPoint.getArgs();
        int len = params.length;
        for (int i = 0; i < len; i++) {
            params[i] = buildSecureParam(params[i]);
        }
//        for (Object o : param) {
//            System.out.println(o);
//            o = buildSecureParam(o);
//            System.out.println(o);
////            if(o.equals("_s")){
////                if(SecureUtil.validSecureToken(o))
////            }
//        }

        try {
            result = (JsonResult) ((ProceedingJoinPoint) joinPoint).proceed(params);
            //加入secure
            result.setSecure("xxxxxxx");
        } catch (Throwable e) {
            e.printStackTrace();
            logger.error(e.getMessage());
            result = new JsonResult(null, false, "unknown error!");
        }

        System.out.println("===============END=========");
        return result;
    }

    /**
     * 对String类型进行html过滤
     *
     * @param param
     * @return
     */
    private Object buildSecureParam(Object param) {
        if (param instanceof String) {
            String paramTmp = (String) param;
            paramTmp = paramTmp.replaceAll("<", "&lt;");
            paramTmp = paramTmp.replaceAll(">", "&gt;");
            paramTmp = paramTmp.replaceAll("&", "&amp;");
            paramTmp = paramTmp.replaceAll("\"", "&quot;");
            paramTmp = paramTmp.replaceAll("'", "&apos;");
            return paramTmp;
        }
        return param;
    }
}
