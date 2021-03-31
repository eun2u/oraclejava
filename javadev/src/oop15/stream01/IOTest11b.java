package oop15.stream01;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;


public class IOTest11b {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		
		
		ps.println("[������ ���� ��Ʈ��]");
		ps.print("�׷�, ");
		ps.println("�� ���븸. ����� �������� ");
		ps.println("�ʴ� ������.");
		ps.println(20);
		
		ps.flush();
		ps.close();
		fos.close();
	}
}
