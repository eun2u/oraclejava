package oop13.enum01;

public class EnumTest {
	public static void main(String[] args) {
		test(Person.MAN);
		test(Animal.DOG);
		
		int myFriend = Person.WOMAN;
		if(myFriend == Animal.CAT) {
			System.out.println("����� �̳�!!");
		}else {
			System.out.println("��! ����� ����...");
		}
		
	}

	private static void test(int man) {
		switch(man) {
		case Person.MAN:
			System.out.println("�����Դϴ�.");
			break;
		case Person.WOMAN:
			System.out.println("�����Դϴ�.");
			break;
		case Person.BABY:
			System.out.println("�Ʊ��Դϴ�.");
			break;
		
		}
	}
}
