/**
 * 巨商汇平台 版权所有 Copyright@2014
 */
package cn.gooday.logistics.aspect;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * [标识MyBatis的DAO]
 *
 * @ProjectName: [com.jsh.oauth.server]
 * @Author: [liuxiaolong]
 * @CreateDate: [2015/5/13 15:09]
 * @Update: [说明本次修改内容] BY[liuxiaolong][2015/5/13]
 * @Version: [v1.0]
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatisRepository {
    String value() default "";
}
