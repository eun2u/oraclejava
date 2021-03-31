package oop15.stream04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientTest {

	public static void main(String[] args) throws Exception {
		/* 객체 직렬화 */
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
		
		Person person = new Person("정대만", "깡패", 19, 14);
		System.out.println(person);
		out.writeObject(person);
		out.close();
		
		/* 객체 역직렬화 */
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
		Person recPerson = (Person) in.readObject();
		in.close();
		
		System.out.println(recPerson);
		
	}
}
