package com.mark.util;


import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @description mybatis自定义扫描注解
 * @author maliqiang
 * @version 1.0
 * @since 2017年5月25日
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MyBatisRepository {
    String value() default "";
}
