package oop06.inter01;

public class STV implements TV{
	private AppleSpeaker speaker = new AppleSpeaker();
	
	
	public void turnOn() {
		System.out.println("STV: ������ �մϴ�.");	
	}
	public void turnOff() {
		System.out.println("STV: ������ ���ϴ�.");
	}
	public void channelUp() {
		System.out.println("STV: ä���� �ø��ϴ�.");
	}
	public void channelDown() {
		System.out.println("STV: ä���� �����ϴ�.");
	}
	public void soundUp() {
		speaker.soundUp();
		//System.out.println("STV: �Ҹ��� Ű��ϴ�.");
	}
	public void soundDown() {
		speaker.soundDown();
//		System.out.println("STV: �Ҹ��� ���Դϴ�.");
	}
	
}