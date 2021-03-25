package oop06.inter01;

public class STV implements TV{
	private AppleSpeaker speaker = new AppleSpeaker();
	
	
	public void turnOn() {
		System.out.println("STV: 전원을 켭니다.");	
	}
	public void turnOff() {
		System.out.println("STV: 전원을 끕니다.");
	}
	public void channelUp() {
		System.out.println("STV: 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("STV: 채널을 내립니다.");
	}
	public void soundUp() {
		speaker.soundUp();
		//System.out.println("STV: 소리를 키웁니다.");
	}
	public void soundDown() {
		speaker.soundDown();
//		System.out.println("STV: 소리를 줄입니다.");
	}
	
}