package com.techoffice.mybatis.generator.config.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SqlMapperMappings {

	SqlMapperMapping[] value();
	SqlMapperMapping[] exceptionFields() default {};
}
