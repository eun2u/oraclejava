package oop06.inter05;

public class FlyingCar implements Flyable, Drivable {

	@Override
	public void drive() {
		System.out.println("�����մϴ�.");
	}

	@Override
	public void fly() {
		System.out.println("�ϴ��� ���ϴ�.");
	}
	
}
