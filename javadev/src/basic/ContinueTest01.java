package basic;
/*
 * continue
 * : 반복문 블럭의 마지막으로 혹은 증감식으로 바로감
 */
public class ContinueTest01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++)
		{
			if(i%3!=0) continue;//아랫것은 무시하고 조건문으로 넘어감
			sum+=i;
		}
		System.out.println("3의배수 " + sum);
	}
}
