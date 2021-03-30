package basic;

import java.util.Scanner;

public class OpTest01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//System.in은 콘솔입력(키보드 입력)
		System.out.print("정수 a값 입력");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		
		scan.close();
	}
}
