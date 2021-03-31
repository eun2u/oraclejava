package oop15.stream05;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UIDTest2 {

	public static void main(String[] args) throws Exception {
		/* 역직렬화*/
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("uid.dat"));
		MyUID uid2= (MyUID) in.readObject();
		
		System.out.println("field1 : "+ uid2.field1);
		in.close();
		
	}
}
