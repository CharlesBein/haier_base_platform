/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.service.common;

/**
 * [通用的service返回结果]
 *
 * @ProjectName: [gooday-services]
 * @Author: [tophawk]
 * @CreateDate: [2015/2/27 19:53]
 * @Update: [说明本次修改内容] BY[tophawk][2015/2/27]
 * @Version: [v1.0]
 */
public class ServiceResult<T> {
    /**
     * 操作结果
     *
     * @see cn.gooday.service.common.ServiceConstants
     */
    private int code;

    /**
     * 错误信息,如果code是出错，则错误具体提示存在此处
     */
    private String errMsg;

    /**
     * 返回的结果
     */
    private T result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
