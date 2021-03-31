package oop14.anno;

import java.lang.reflect.Method;
public class PrintAnnoTest {
	public static void main(String[] args) {
		//Service 클래스로부터 메소드 정보를 얻음(리플렉션)
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method: declaredMethods) {
			//PrintAnnotation이 적용되었는지 확인
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//메소드 이름 출력
				System.out.println("["+method.getName()+"]");
				
				//PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				for(int i=0;i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				//메소드 호출
				try {
					method.invoke(new Service());
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
		}
	}
}
