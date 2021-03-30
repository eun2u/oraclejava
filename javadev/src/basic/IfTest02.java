package basic;

import java.util.Scanner;

public class IfTest02 {
	public static void main(String[] args) {
		//Q4. score(if) 0~100 점수 입력받아서
		System.out.println("점수를 입력해주세요 : ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(score>=90)
		{
			System.out.println("A");
		}
		else if(score<90 && score>=80)
		{
			System.out.println("B");
		}
		else if(score<80 && score>=70)
		{
			System.out.println("C");
		}
		else if(score<70 && score>=60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
	}
}
