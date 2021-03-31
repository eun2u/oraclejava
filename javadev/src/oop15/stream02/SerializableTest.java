package oop15.stream02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
	public static void main(String[] args) throws Exception {
		/*��ü ����ȭ */
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.ser"));
		out.writeObject(new Circle(1, 1, 2.4));
		out.writeObject(new Circle(2, 2, 4.8));
		out.writeObject(new String("String implements Serializable"));
		out.close();
		
		
		/*��ü ������ȭ*/
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.ser"));
		Circle c1=(Circle) in.readObject();
		Circle c2=(Circle) in.readObject();
		String msg = (String) in.readObject();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(msg);
	}
}
