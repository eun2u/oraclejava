package oop06.inter01;

public class LgTV implements TV{
	private InkelSpeaker speaker = new InkelSpeaker();
	
	public void turnOn() {
		System.out.println("LgTV: ������ �մϴ�.");	
	}
	public void turnOff() {
		System.out.println("LgTV: ������ ���ϴ�.");
	}
	public void channelUp() {
		System.out.println("LgTV: ä���� �ø��ϴ�.");
	}
	public void channelDown() {
		System.out.println("LgTV: ä���� �����ϴ�.");
	}
	public void soundUp() {
		speaker.soundUp();
	}
	public void soundDown() {
		speaker.soundDown();
	}
}