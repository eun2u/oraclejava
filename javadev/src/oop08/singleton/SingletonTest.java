package oop08.singleton;

public class SingletonTest {
	public static void main(String[] args) {
		//Singleton s=new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1==s2) {
			System.out.println("���� Singleton ��ü�Դϴ�."); // ����
		}
		else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	}
}
