package basic;

import java.util.Scanner;

public class OpTest01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//System.in�� �ܼ��Է�(Ű���� �Է�)
		System.out.print("���� a�� �Է�");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		
		scan.close();
	}
}
