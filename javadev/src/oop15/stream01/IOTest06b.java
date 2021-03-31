package oop15.stream01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class IOTest06b {
	public static void main(String[] args) throws Exception {
		File f = new File("sample3.txt");
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("�׷�, �� ���븸. " +"\r\n");
		bw.write("����� �������� �ʴ� ������!");
		
		bw.flush();
		bw.close();
		
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}
}
