package basic;

import java.util.Scanner;

public class SwitchTest01 {
	public static void main(String[] args) {

		System.out.println("���� �Է����ּ��� : ");
		Scanner scan = new Scanner(System.in);
		int sex = scan.nextInt();

		switch (sex) {
		case 1: 
			System.out.println("����");
			break;
		case 2: 
			System.out.println("����");
			break;
		case 3: 
			System.out.println("����");
			break;
		case 4: 
			System.out.println("����");
			break;
		default:
			System.out.println("����");
			break;
		}
	}
}
