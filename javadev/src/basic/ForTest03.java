package basic;

public class ForTest03 {
	public static void main(String[] args) {
		//1~1000까지 정수중 3의배수 합계
		int sum = 0;
		int i = 1;
		while(i<=1000)
		{
			if(i%3==0)
				sum+=i;
			i++;
		}
		System.out.println(sum);
	
	}
}
