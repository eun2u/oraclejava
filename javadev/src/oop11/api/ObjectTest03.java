package oop11.api;

public class ObjectTest03 {
	public static void main(String[] args) {
		String str1=new String("�Ǽ��� ���� �뼭�ϴ� �ΰ��� �����̴�.");
		String str2=new String("�Ǽ��� ���� �뼭�ϴ� �ΰ��� �����̴�."); 
		//�޸� ���Ӱ� �Ҵ�. ���� �ٸ� �ν��Ͻ��� �ּҰ��� ������
		
		if(str1==str2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		if(str1.equals(str2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		
		System.out.println(str1);
		System.out.println(str1.hashCode());
		System.out.println(str1=str1.replace("�Ǽ���","������"));
		System.out.println(str1.hashCode());
		//�����Ѱ��� �����ϰ� ���� -> �̷� �������� �����Ѱ��� StringBuilder
		
	}
}
