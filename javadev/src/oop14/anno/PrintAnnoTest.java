package oop14.anno;

import java.lang.reflect.Method;
public class PrintAnnoTest {
	public static void main(String[] args) {
		//Service Ŭ�����κ��� �޼ҵ� ������ ����(���÷���)
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method: declaredMethods) {
			//PrintAnnotation�� ����Ǿ����� Ȯ��
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//�޼ҵ� �̸� ���
				System.out.println("["+method.getName()+"]");
				
				//PrintAnnotation ��ü ���
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				for(int i=0;i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				//�޼ҵ� ȣ��
				try {
					method.invoke(new Service());
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
		}
	}
}
