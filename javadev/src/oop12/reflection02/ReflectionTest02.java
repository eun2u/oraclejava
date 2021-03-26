package oop12.reflection02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest02 {
	public static void main(String[] args) {
		Class cls = Worker.class;
		
		Constructor[] constructors = cls.getDeclaredConstructors();
		System.out.println("****************************[생성자]****************************");
		
		for(int i=0;i<constructors.length;i++)
			System.out.println(constructors[i].toString());
		
		System.out.println();
		
		
		Method[] methods = cls.getDeclaredMethods();
		System.out.println("****************************[메소드]****************************");
		
		for(int i=0;i<methods.length;i++)
			System.out.println(methods[i].toString());
		
		System.out.println();
		
		Field[] fields = cls.getDeclaredFields(); // getFields()는 private 보여주지 않음
		System.out.println("****************************[필드]****************************");
		
		for(int i=0;i<fields.length;i++)
			System.out.println(fields[i].toString());
		
		System.out.println();
		
		
	}
}
