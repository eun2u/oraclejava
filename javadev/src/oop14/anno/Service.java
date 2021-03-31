package oop14.anno;

public class Service {
	
	@PrintAnnotation 			//기본 엘리먼트인 value의 기본값 '-' 적용
	public void method1() {
		System.out.println("method1() 수행");
	}
	@PrintAnnotation("*") 		//기본 엘리먼트인 value의 기본값 '*' 적용
	public void method2() {
		System.out.println("method2() 수행");
	}
	@PrintAnnotation(value="#", number=20) //기본 엘리먼트인 value의 기본값 '#' 적용, number값을 20으로 설정
	public void method3() {
		System.out.println("method3() 수행");
	}
	
}
