/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.service.common;

/**
 * [公共常量，私有的，不要放在这里]
 *
 * @ProjectName: [gooday-services]
 * @Author: [tophawk]
 * @CreateDate: [2015/2/27 11:45]
 * @Update: [说明本次修改内容] BY[tophawk][2015/2/27]
 * @Version: [v1.0]
 */
public interface ServiceConstants {
    /**
     * 下面是通用的int型返回值约定,错误值都是负数，禁用boolean型返回。
     */
    int RETURN_SUCCESS = 1;
    int RETURN_BUSINESS_FAILURE = -1;//业务错误，业务逻辑错误，包含参数错误
    int RETURN_APPLICATION_FAILURE = -2;//应用错误，包含runtime异常，网络，数据库异常

    int MAX_RESULT_LIMIT = 500;//返回的数据库查询最大条数
}
