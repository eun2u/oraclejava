package oop06.inter03;

public class LgRemoteTV extends RemoteTV{

	@Override
	public void channelDown() {
		//RemoteTV ���� �������� ���� �߻�޼ҵ� ����
		channel--;
		System.out.println("ä���� �����ϴ�. ���� ä��: " + channel +"��");
	}

}
