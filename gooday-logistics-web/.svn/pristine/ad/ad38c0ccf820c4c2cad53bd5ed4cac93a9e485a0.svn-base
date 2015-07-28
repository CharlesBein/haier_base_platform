/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.web.util.map;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * []
 *
 * @ProjectName: [gooday-services]
 * @Author: [tophawk]
 * @CreateDate: [2015/2/27 14:07]
 * @Update: [说明本次修改内容] BY[tophawk][2015/2/27]
 * @Version: [v1.0]
 */
public class MapUtil {
    /**
     * 用户获取map data
     *
     * @param obj
     * @return
     */
    public static String getString(Object obj) {
        return (obj == null) ? "" : String.valueOf(obj);
    }

    /**
     * 用于获取map data,出错返回0
     *
     * @param obj
     * @return
     */
    public static Integer getInteger(Object obj) {
        try {
            return (obj == null || obj.equals("")) ? 0 : new Integer(obj.toString());
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    /**
     * 用于获取map data 出错返回0
     *
     * @param obj
     * @return
     */
    public static Double getDouble(Object obj) {
        try {
            return (obj == null || obj.equals("")) ? 0 : new Double(obj.toString());
        } catch (NumberFormatException ex) {
            return 0d;
        }
    }

    /**
     * 用于获取map data 出错返回0
     *
     * @param obj
     * @return
     */
    public static Long getLong(Object obj) {
        try {
            return (obj == null || obj.equals("")) ? 0 : new Long(obj.toString());
        } catch (NumberFormatException ex) {
            return 0l;
        }
    }

    public static void main(String args[]) {
    }
}
