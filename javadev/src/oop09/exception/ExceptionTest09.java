package oop09.exception;

public class ExceptionTest09 {
	public static void main(String[] args) {
		try {
			throwException();
		} catch (Exception e) {
			e.printStackTrace(); //���ܰ� �߻��ؼ� ���޵Ǵ� ���� ���
		}
		System.out.println("����");
	}

	private static void throwException() throws Exception {
		System.out.println("throwException �޼ҵ� ���� ����");
		
		throw new Exception("����ڰ� ���� ���� �߻�");

	}
}
