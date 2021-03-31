package oop15.stream01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

public class IOTest07 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("sample2.txt");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = fr.read(cbuf))!=-1) {
			System.out.println("readCharNo : "+readCharNo);
			String data = new String(cbuf,0,readCharNo);
			System.out.print(data);
		}
		fr.close();
	}
}
