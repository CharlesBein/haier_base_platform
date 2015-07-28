/*
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.service.common.util;

import org.apache.commons.lang.StringUtils;

import java.util.Iterator;

/**
 * [字符串操作封装]
 *
 * @ProjectName: [gooday-services]
 * @Author: [tophawk]
 * @CreateDate: [2015/2/27 14:02]
 * @Update: [说明本次修改内容] BY[tophawk][2015/2/27]
 * @Version: [v1.0]
 */
public class StringUtil {
    /**
     * 判断空串
     * @param s
     * @return
     */
    public static boolean isEmpty(String s) {
        if (null != s) s = s.trim();
        return StringUtils.isEmpty(s);
    }

    /**
     * 连接字符串
     * @param iter
     * @param separator
     * @return
     */
    public static String join(Iterator iter,String separator){
        return StringUtils.join(iter,separator);
    }
            /**
             * 字符串拆分为数组，无NPE
             * @param sourceStr
             * @param splitChar
             * @return
             */
    public static String[] split(String sourceStr,String splitChar){
        return StringUtils.split(sourceStr,splitChar);
    }

    /**
     * [字符参数过滤]
     * @param input
     * @return
     */
    public static String xssTranslate(String input){
        //先去掉前后的控制符
        input = StringUtils.trim(input);

        //目前仅开放尖括号和双引号的转义还原，如有其他需求另行添加
        input = input.replaceAll( "&lt;","<").replaceAll( "&gt;",">");
        input = input.replaceAll("&quot;","\"");
        return input;
    }
}
