package basic;

public class DataType {
	public static void main(String[] args) {
		boolean b1 = false;
		System.out.println("b1 : "+b1);
		
		char c = 65;
		System.out.println("c : " + c);
		
		byte b2 = 127;
		System.out.println("b2 : "+b2);
		
		short s = 32767;
		System.out.println("s : "+s);
		
		int i = 2147483647;
		System.out.println("i : " + i);
		
		long l1 = 2147483648L;//숫자부터 읽어들이는데 뒤부터 읽기때문에 인트타입이 디폴트라서 바로 에러뜸 그래서 항상 롱타입 쓸때는 L끝에 붙여주기
		System.out.println("l1 : " + l1);
		
		double d = 3.1415926535;//마찬가지 디폴트값이 double임
		System.out.println("d = "+d);
		
		float f = 3.1415926535f;//그래서 float 일땐 f를 끝에 붙여주기
		System.out.println("f : "+f);
		
		System.out.println("해리가 외쳤다. \"이빵꾸똥꾸야\"");// 특수문자 입력할때 쓰는게 escape sequence
	}
}
