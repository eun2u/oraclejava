package basic;

import java.util.Scanner;

public class OpTest07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� 1, ���ڸ� 2 �Է� : ");
		int n = sc.nextInt();
		
		System.out.println(n==1 ? "�����Դϴ�." : 
						   n==2 ? "�����Դϴ�." :
									"�����Դϴ�");
		
		sc.close();
	}
}
