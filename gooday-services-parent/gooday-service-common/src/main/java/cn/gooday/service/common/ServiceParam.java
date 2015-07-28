/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.service.common;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-services]
 * @Author: [tophawk]
 * @CreateDate: [2015/6/11 22:16]
 * @Update: [说明本次修改内容] BY[tophawk][2015/6/11]
 * @Version: [v1.0]
 */
public class ServiceParam<T> {
    private T param;

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }
}
