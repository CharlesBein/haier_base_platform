/**
 * 巨商汇平台 版权所有 Copyright@2015
 */
package test;

import cn.gooday.service.common.ServiceResult;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * [简短描述该类的功能]
 *
 * @ProjectName: [gooday-services]
 * @Author: [cuiyan]
 * @CreateDate: [2015/3/25 18:28]
 * @Update: [说明本次修改内容] BY[cuiyan][2015/3/25]
 * @Version: [v1.0]
 */
public class TestLsSearchService {

     @Test
    public void testQueryLsSiListJsonStr(){
        Map paramMap = new LinkedHashMap();//参数
        paramMap.put("shopid","365");
        paramMap.put("orderid","");
        paramMap.put("stime","2012-01-01 00:00:00");
        paramMap.put("etime","2015-03-05 00:00:00");
        paramMap.put("reqno","233");
        paramMap.put("retsize","1000");
        //ServiceResult result = lsSearchService.queryLsSiListJsonStr(paramMap);
        //System.out.print(result.getResult().toString());
    }
}
