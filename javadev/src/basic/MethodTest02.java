package basic;

public class MethodTest02 {
	public static void main(String[] args) {
		print(1);
		print(2, 3);
		print(4, 5, 6);
	}

	private static void print(int... i) {//가변인자 : 매개변수의 개수를 정하기 애매한 경우 사용
		for(int j=0; j<i.length;j++)
		{
			System.out.print(i[j] + "\t");
		}
		System.out.println();
	}

	
	
//	private static void print(int i, int j, int k) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void print(int i) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//
//	private static void print(int i, int j) {
//		// TODO Auto-generated method stub
//		
//	}
}
