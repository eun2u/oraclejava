package basic;

import java.util.Scanner;

public class SwitchTest03 {
	public static void main(String[] args) {
		//Q4. score(if) 0~100 점수 입력받아서
		System.out.println("점수를 입력해주세요 : ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		switch (score/10) {
		case 9: 
			System.out.println("A");
			break;
		case 8: 
			System.out.println("B");
			break;
		case 7: 
			System.out.println("C");
			break;
		case 6: 
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			break;
		}
	}
}
