package basic;

import java.util.Scanner;

public class SwitchTest01 {
	public static void main(String[] args) {

		System.out.println("성별 입력해주세요 : ");
		Scanner scan = new Scanner(System.in);
		int sex = scan.nextInt();

		switch (sex) {
		case 1: 
			System.out.println("남자");
			break;
		case 2: 
			System.out.println("여자");
			break;
		case 3: 
			System.out.println("남자");
			break;
		case 4: 
			System.out.println("여자");
			break;
		default:
			System.out.println("에러");
			break;
		}
	}
}
