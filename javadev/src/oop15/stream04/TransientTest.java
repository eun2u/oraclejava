package oop15.stream04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientTest {

	public static void main(String[] args) throws Exception {
		/* ��ü ����ȭ */
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
		
		Person person = new Person("���븸", "����", 19, 14);
		System.out.println(person);
		out.writeObject(person);
		out.close();
		
		/* ��ü ������ȭ */
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
		Person recPerson = (Person) in.readObject();
		in.close();
		
		System.out.println(recPerson);
		
	}
}
