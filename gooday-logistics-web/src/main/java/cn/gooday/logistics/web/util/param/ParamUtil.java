/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.web.util.param;

import cn.gooday.service.common.ServiceParam;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-ls]
 * @Author: [tophawk]
 * @CreateDate: [2015/6/14 8:06]
 * @Update: [说明本次修改内容] BY[tophawk][2015/6/14]
 * @Version: [v1.0]
 */
public class ParamUtil {
    public static <T> ServiceParam buildServiceParam(T obj){
        ServiceParam<T> param = new ServiceParam();
        param.setParam(obj);
        return param;
    }
}
