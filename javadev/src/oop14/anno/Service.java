package oop14.anno;

public class Service {
	
	@PrintAnnotation 			//�⺻ ������Ʈ�� value�� �⺻�� '-' ����
	public void method1() {
		System.out.println("method1() ����");
	}
	@PrintAnnotation("*") 		//�⺻ ������Ʈ�� value�� �⺻�� '*' ����
	public void method2() {
		System.out.println("method2() ����");
	}
	@PrintAnnotation(value="#", number=20) //�⺻ ������Ʈ�� value�� �⺻�� '#' ����, number���� 20���� ����
	public void method3() {
		System.out.println("method3() ����");
	}
	
}
