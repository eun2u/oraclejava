package oop09.exception;

public class ExceptionTest05 {
	public static void main(String[] args) {
		try {
			Class cls = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Á¾·á");
	}
}
