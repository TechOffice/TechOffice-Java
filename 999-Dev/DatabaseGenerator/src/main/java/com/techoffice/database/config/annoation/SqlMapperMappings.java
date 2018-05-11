package com.techoffice.database.config.annoation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SqlMapperMappings {

	SqlMapperMapping[] value();
	SqlMapperMapping[] exceptionFields() default {};
}