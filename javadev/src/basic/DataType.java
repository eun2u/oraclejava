package basic;

public class DataType {
	public static void main(String[] args) {
		boolean b1 = false;
		System.out.println("b1 : "+b1);
		
		char c = 65;
		System.out.println("c : " + c);
		
		byte b2 = 127;
		System.out.println("b2 : "+b2);
		
		short s = 32767;
		System.out.println("s : "+s);
		
		int i = 2147483647;
		System.out.println("i : " + i);
		
		long l1 = 2147483648L;//���ں��� �о���̴µ� �ں��� �б⶧���� ��ƮŸ���� ����Ʈ�� �ٷ� ������ �׷��� �׻� ��Ÿ�� ������ L���� �ٿ��ֱ�
		System.out.println("l1 : " + l1);
		
		double d = 3.1415926535;//�������� ����Ʈ���� double��
		System.out.println("d = "+d);
		
		float f = 3.1415926535f;//�׷��� float �϶� f�� ���� �ٿ��ֱ�
		System.out.println("f : "+f);
		
		System.out.println("�ظ��� ���ƴ�. \"�̻��ٶ˲پ�\"");// Ư������ �Է��Ҷ� ���°� escape sequence
	}
}
