package basic;

public class ArrayTest03 {
	public static void main(String[] args) {
		int[][] score = {
				{100,90,80,70},
				{90,80,70,60},
				{80,70,60,50},
		};
		int sum[] = new int[3];
		int avg[] = new int[3];
		
		
		System.out.println("\t\t[성적표]");
		System.out.println("=============================================");
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		for(int row=0; row<score.length; row++)
		{
			for(int col=0; col<score[row].length; col++)
			{
				sum[row] += score[row][col];
				System.out.print(score[row][col]+ "\t");
			}
			System.out.print(sum[row]+ "\t");
			System.out.print(sum[row]/score[row].length + "\t");
			
			System.out.println();
		}
	}
}
