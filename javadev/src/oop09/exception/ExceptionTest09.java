package oop09.exception;

public class ExceptionTest09 {
	public static void main(String[] args) {
		try {
			throwException();
		} catch (Exception e) {
			e.printStackTrace(); //예외가 발생해서 전달되는 과정 출력
		}
		System.out.println("종료");
	}

	private static void throwException() throws Exception {
		System.out.println("throwException 메소드 수행 시작");
		
		throw new Exception("사용자가 강제 예외 발생");

	}
}
