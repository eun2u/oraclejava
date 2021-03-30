package oop14.anno;

import java.lang.annotation.ElementType;

@Target({ElementType.METHOD})
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
	
}
