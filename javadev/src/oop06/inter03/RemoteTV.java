package oop06.inter03;

public abstract class RemoteTV implements RemoteControl{
	//channelDown()을 오버라이딩 하지 않았기 때문에 추상클래스
	
	int channel=0;
	boolean power=false;
	
	@Override
	public void powerOn() {
		power=true;
		System.out.println("Remote TV 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		power=false;
		System.out.println("Remote TV 전원을 끕니다.");
		
	}

	@Override
	public void channelUp() {
		channel++;
		System.out.println("채널을 올리니다. 현재 채널: "+ channel +"번");
		
	}
}
