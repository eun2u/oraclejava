package oop15.stream01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class IOTest06 {
	public static void main(String[] args) throws Exception {
		File f = new File("sample2.txt");
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter bw = new BufferedWriter(fw);
		fw.write("�׷�, �� ���븸. " +"\r\n");
		fw.write("����� �������� �ʴ� ������!");
		
		fw.flush();
		fw.close();
		
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}
}
