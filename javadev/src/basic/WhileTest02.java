package basic;

public class WhileTest02 {
	public static void main(String[] args) {
		//1~1000���� ������ 3�ǹ�� �հ�
		int sum = 0;
		for(int i=1;i<=1000;i++)
		{
			if(i%3==0)
				sum+=i;
		}
		System.out.println(sum);
	}
}
