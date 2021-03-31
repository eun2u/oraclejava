package oop15.stream03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
	public static void main(String[] args) throws Exception {
		/*按眉 流纺拳 */
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object2.ser"));
		out.writeObject(new Circle(1, 1, 2.4));
		out.writeObject(new Circle(2, 2, 4.8));
		out.writeObject(new String("String implements Serializable"));
		out.close();
		
		
		/*按眉 开流纺拳*/
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("object2.ser"));
		Circle c1=(Circle) in.readObject();
		Circle c2=(Circle) in.readObject();
		String msg = (String) in.readObject();
		in.close();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(msg);
	}
}
