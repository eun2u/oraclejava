package oop06.inter03;

public class LgRemoteTV extends RemoteTV{

	@Override
	public void channelDown() {
		//RemoteTV 에서 정의하지 않은 추상메소드 정의
		channel--;
		System.out.println("채널을 내립니다. 현재 채널: " + channel +"번");
	}

}
