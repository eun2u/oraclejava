package oop06.inter01;

public class InkelSpeaker implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("InkelSpeaker: 소리를 키웁니다.");
	}

	@Override
	public void soundDown() {
		System.out.println("InkelSpeaker: 소리를 줄입니다.");
	}
	
}
