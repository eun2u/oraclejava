package oop13.enum02;

public class EnumTest {
	public static void main(String[] args) {
		Person man = Person.WOMAN;
		
		if(man==Person.MAN) {
			System.out.println("남자입니다.");
		}else if(man == Person.WOMAN) {
			System.out.println("여자입니다.");
		}else {
			System.out.println("아기입니다.");
		}
		
		if(man==Animal.DOG) {
			System.out.println("사람은 멍멍이가 .. ");
		}
	}
}
