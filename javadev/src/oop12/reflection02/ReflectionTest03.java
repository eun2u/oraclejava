package oop12.reflection02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest03 {
	public static void main(String[] args) {
		Worker worker=new Worker("채소연",1);
		
		Class cls = worker.getClass();
		
		try {
			Object obj = cls.getConstructor().newInstance();
			if(obj instanceof Worker) {
				System.out.println("Worker 클래스의 인스턴스입니다.");
			}
			System.out.println("worker hashcode : " +worker.hashCode());
			System.out.println("obj hashcode : " +obj.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
}
