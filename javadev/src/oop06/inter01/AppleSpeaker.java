package oop06.inter01;

public class AppleSpeaker implements Speaker{

	@Override
	public void soundUp() {
		System.out.println("AppleSpeaker: ������ Ű��ϴ�.");
	}

	@Override
	public void soundDown() {
		System.out.println("Applespeaker: ������ ���Դϴ�.");
	}
}
