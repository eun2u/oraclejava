package oop15.stream05;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class UIDTest1 {

	public static void main(String[] args) throws Exception {
		/* ��ü ����ȭ*/
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("uid.dat"));
		MyUID uid = new MyUID();
		uid.field1=10;
		out.writeObject(uid);
		out.close();
		
	}
}
