package oop11.api;

public class ObjectTest03 {
	public static void main(String[] args) {
		String str1=new String("실수란 신을 용서하는 인간의 행위이다.");
		String str2=new String("실수란 신을 용서하는 인간의 행위이다."); 
		//메모리 새롭게 할당. 서로 다른 인스턴스의 주소값을 참조함
		
		if(str1==str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(str1.equals(str2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		System.out.println(str1);
		System.out.println(str1.hashCode());
		System.out.println(str1=str1.replace("실수란","성형은"));
		System.out.println(str1.hashCode());
		//복제한것을 수정하고 삭제 -> 이런 문제점을 보완한것이 StringBuilder
		
	}
}
