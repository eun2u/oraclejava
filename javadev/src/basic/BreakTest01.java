package basic;

public class BreakTest01 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1; 
		while(true)
		{
			sum += i;
			if(sum>=100) break;
				
			i++;
		}
		System.out.println(sum);
	}
}
