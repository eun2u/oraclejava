package oop11.api;

public class ObjectTest06 {
	public static void main(String[] args) {
		Integer i=10;
		Object obj = i; //Object 타입으로 업 캐스팅
		
		int n=(Integer) obj; //다운 캐스팅
		
		System.out.println(n+"을 2진수로 "+ Integer.toBinaryString(n));
		System.out.println(n+"을 8진수로 "+ Integer.toOctalString(n));
		System.out.println(n+"을 16진수로 "+ Integer.toHexString(n));
		
	}
}
