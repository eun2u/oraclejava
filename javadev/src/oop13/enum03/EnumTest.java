package oop13.enum03;

public class EnumTest {
	public static void main(String[] args) {
		test(Person.MAN);
//		test(Animal.DOG);
//
//		
//		int myFriend = Person.WOMAN;
//		if(myFriend == Animal.CAT) {
//			System.out.println("����� �̳�!!");
//		}else {
//			System.out.println("��! ����� ����...");
//		}
		
	}

	private static void test(Person man) {
		switch(man) {
		case MAN:
			System.out.println("�����Դϴ�.");
			break;
		case WOMAN:
			System.out.println("�����Դϴ�.");
			break;
		case BABY:
			System.out.println("�Ʊ��Դϴ�.");
			break;
		
		}
	}
}
