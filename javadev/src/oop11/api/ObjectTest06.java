package oop11.api;

public class ObjectTest06 {
	public static void main(String[] args) {
		Integer i=10;
		Object obj = i; //Object Ÿ������ �� ĳ����
		
		int n=(Integer) obj; //�ٿ� ĳ����
		
		System.out.println(n+"�� 2������ "+ Integer.toBinaryString(n));
		System.out.println(n+"�� 8������ "+ Integer.toOctalString(n));
		System.out.println(n+"�� 16������ "+ Integer.toHexString(n));
		
	}
}
