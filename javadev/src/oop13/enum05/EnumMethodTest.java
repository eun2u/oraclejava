package oop13.enum05;

public class EnumMethodTest {
	public static void main(String[] args) {
		//1. name() �޼ҵ�
		Week today = Week.SUNDAY;
		String name = today.name(); //������ ��ü�� ������ �ִ� ���ڿ��� ����
		System.out.println(name);
		
		//2. ordinal() �޼ҵ�
		int ordinal = today.ordinal(); //��ü ������ ��ü �� �� ��° ������ ��ü���� ��ȯ
		System.out.println(ordinal);
	
		//3. comapreTo() �޼ҵ�
		Week day1 = Week.MONDAY;
		Week day2= Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); //���ڷ� �־��� ���� ��ü�� �������� �� ��° ��ġ�ϴ��� ��.
		System.out.println(result1);
		
		int result2 = day2.compareTo(day1); 
		System.out.println(result2);
		
		
		//4. valueOf() �޼ҵ�
		if(args.length ==1) {
			String strDay = args[0];
			strDay = strDay.toUpperCase();
			
			Week weekDay = Week.valueOf(strDay);
			if(weekDay==Week.SATURDAY || weekDay == Week.SUNDAY ) {
				System.out.println("�ָ��̱���!!!");
			}else {
				System.out.println("�����̳׿�");
			}
		}
		
	}
	
}
