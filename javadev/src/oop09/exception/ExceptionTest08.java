package oop09.exception;

public class ExceptionTest08 {
	public static void main(String[] args) {
		throwException();
		System.out.println("����");
	}

	private static void throwException() {
		System.out.println("throwException �޼ҵ� ���� ����");
		
		try {
			throw new Exception("����ڰ� ���� ���� �߻�");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("throwException �޼ҵ� ���� �Ϸ�");
	}
}
