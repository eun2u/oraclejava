package oop13.enum03;

public class EnumTest {
	public static void main(String[] args) {
		test(Person.MAN);
//		test(Animal.DOG);
//
//		
//		int myFriend = Person.WOMAN;
//		if(myFriend == Animal.CAT) {
//			System.out.println("고양이 이놈!!");
//		}else {
//			System.out.println("앗! 고양이 인줄...");
//		}
		
	}

	private static void test(Person man) {
		switch(man) {
		case MAN:
			System.out.println("남자입니다.");
			break;
		case WOMAN:
			System.out.println("여자입니다.");
			break;
		case BABY:
			System.out.println("아기입니다.");
			break;
		
		}
	}
}
