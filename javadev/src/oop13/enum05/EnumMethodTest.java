package oop13.enum05;

public class EnumMethodTest {
	public static void main(String[] args) {
		//1. name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name(); //열거형 객체가 가지고 있는 문자열을 리턴
		System.out.println(name);
		
		//2. ordinal() 메소드
		int ordinal = today.ordinal(); //전체 열거형 객체 중 몇 번째 열거형 객체인지 반환
		System.out.println(ordinal);
	
		//3. comapreTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2= Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); //인자로 주어진 열거 객체를 기준으로 몇 번째 위치하는지 비교.
		System.out.println(result1);
		
		int result2 = day2.compareTo(day1); 
		System.out.println(result2);
		
		
		//4. valueOf() 메소드
		if(args.length ==1) {
			String strDay = args[0];
			strDay = strDay.toUpperCase();
			
			Week weekDay = Week.valueOf(strDay);
			if(weekDay==Week.SATURDAY || weekDay == Week.SUNDAY ) {
				System.out.println("주말이군요!!!");
			}else {
				System.out.println("평일이네요");
			}
		}
		
	}
	
}
