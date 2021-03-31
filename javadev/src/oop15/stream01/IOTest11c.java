package oop15.stream01;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class IOTest11c {
	public static void main(String[] args) throws Exception {
		File f= new File("print2.txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("[������ ���� ��Ʈ��]");
		pw.print("�׷�, ");
		pw.println("�� ���븸. ����� �������� ");
		pw.println("�ʴ� ������.");
		pw.println(20);
	
		pw.flush();
		pw.close();
		fw.close();
	}
}
