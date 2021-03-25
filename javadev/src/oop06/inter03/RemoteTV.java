package oop06.inter03;

public abstract class RemoteTV implements RemoteControl{
	//channelDown()�� �������̵� ���� �ʾұ� ������ �߻�Ŭ����
	
	int channel=0;
	boolean power=false;
	
	@Override
	public void powerOn() {
		power=true;
		System.out.println("Remote TV ������ �մϴ�.");
	}

	@Override
	public void powerOff() {
		power=false;
		System.out.println("Remote TV ������ ���ϴ�.");
		
	}

	@Override
	public void channelUp() {
		channel++;
		System.out.println("ä���� �ø��ϴ�. ���� ä��: "+ channel +"��");
		
	}
}
