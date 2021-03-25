package oop08.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		//Singleton s=new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1==s2) {
			System.out.println("같은 Singleton 객체입니다."); // 같음
		}
		else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
