package oop13.enum02;

public class EnumTest {
	public static void main(String[] args) {
		Person man = Person.WOMAN;
		
		if(man==Person.MAN) {
			System.out.println("�����Դϴ�.");
		}else if(man == Person.WOMAN) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�Ʊ��Դϴ�.");
		}
		
		if(man==Animal.DOG) {
			System.out.println("����� �۸��̰� .. ");
		}
	}
}
