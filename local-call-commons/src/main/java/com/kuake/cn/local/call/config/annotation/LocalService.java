package com.kuake.cn.local.call.config.annotation;

import java.lang.annotation.*;

/**
 * @author chenliqiang001
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface LocalService {
    /**
     * 接口的类对象
     **/
    Class<?> interfaceClass() default void.class;
}
