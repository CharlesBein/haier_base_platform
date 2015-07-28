/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.service.common;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-services]
 * @Author: [tophawk]
 * @CreateDate: [2015/2/28 17:23]
 * @Update: [说明本次修改内容] BY[tophawk][2015/2/28]
 * @Version: [v1.0]
 */
public class ServiceTool{
    /**
     * 返回成功信息
     * @param obj
     * @return
     */
    public static ServiceResult buildSuccessResult(Object obj){
        ServiceResult result = new ServiceResult();
        result.setResult(obj);
        result.setCode(ServiceConstants.RETURN_SUCCESS);
        result.setErrMsg(null);
        return result;
    }
    /**
     * 返回应用错误信息，包含网络和数据库错误，runtime异常等
     * @param msg
     * @return
     */
    public static ServiceResult buildApplicationFailResult(String ... msg){
        ServiceResult result = new ServiceResult();
        result.setResult(null);
        result.setCode(ServiceConstants.RETURN_APPLICATION_FAILURE);
        result.setErrMsg(buildString(msg));
        return result;
    }
    /**
     * 返回业务逻辑错误信息，包含参数错误等
     * @param msg
     * @return
     */
    public static ServiceResult buildBusinessFailResult(String ... msg){
        ServiceResult result = new ServiceResult();
        result.setResult(null);
        result.setCode(ServiceConstants.RETURN_BUSINESS_FAILURE);
        result.setErrMsg(buildString(msg));
        return result;
    }

    /**
     * 字符串链接
     * @param str
     * @return
     */
    public static String buildString(String ...str){
        StringBuilder buf = new StringBuilder();
        for(String s:str){
            buf.append(s);
        }
        return buf.toString();
    }
}
