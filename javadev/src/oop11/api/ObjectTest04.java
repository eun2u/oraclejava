package oop11.api;

public class ObjectTest04 {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder();
		printString(sb);
		sb.append("�Ǽ��� ");
		printString(sb);
		sb.append("���� �뼭�ϴ� ");
		printString(sb);
		sb.append("�ΰ��� �����̴�.");
		printString(sb);
		
		sb.insert(16, "�ں�ο� ");
		printString(sb);
		
		sb.delete(16, 21);
		printString(sb);

		sb.reverse();
		printString(sb);
		
		sb.reverse();
		printString(sb);
	}

	private static void printString(StringBuilder sb) {
		System.out.println(sb.length() + " : "+sb.capacity());
		System.out.println(sb);
	}
}
