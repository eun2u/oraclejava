package oop12.reflection02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest02 {
	public static void main(String[] args) {
		Class cls = Worker.class;
		
		Constructor[] constructors = cls.getDeclaredConstructors();
		System.out.println("****************************[������]****************************");
		
		for(int i=0;i<constructors.length;i++)
			System.out.println(constructors[i].toString());
		
		System.out.println();
		
		
		Method[] methods = cls.getDeclaredMethods();
		System.out.println("****************************[�޼ҵ�]****************************");
		
		for(int i=0;i<methods.length;i++)
			System.out.println(methods[i].toString());
		
		System.out.println();
		
		Field[] fields = cls.getDeclaredFields(); // getFields()�� private �������� ����
		System.out.println("****************************[�ʵ�]****************************");
		
		for(int i=0;i<fields.length;i++)
			System.out.println(fields[i].toString());
		
		System.out.println();
		
		
	}
}
