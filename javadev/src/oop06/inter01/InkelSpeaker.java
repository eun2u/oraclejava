package oop06.inter01;

public class InkelSpeaker implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("InkelSpeaker: �Ҹ��� Ű��ϴ�.");
	}

	@Override
	public void soundDown() {
		System.out.println("InkelSpeaker: �Ҹ��� ���Դϴ�.");
	}
	
}
