package basic;

import java.util.Scanner;

public class OpTest08 {
	public static void main(String[] args) {
		
		System.out.print("¼ıÀÚ ÀÔ·ÂÇØ : ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(n%2==0 ? "Â¦¼ö" : "È¦¼ö");
		sc.close();
	}
}
