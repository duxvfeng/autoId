package com.github.autoId.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoId {

    /**
     * @return id类型（默认为雪花id）
     */
    IdType value() default IdType.SNOWFLAKE;

    /**
     * id类型
     */
    enum IdType {
        /**
         * UUID去掉“-”
         */
        UUID,
        /**
         * 雪花id
         */
        SNOWFLAKE
    }
}
