package oop15.stream01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest03 {
	public static void main(String[] args) throws Exception {
		File f = new File("abc.txt");
		if(f.exists()) {
			System.out.println("������ �����մϴ�.");
		}else {
			f.createNewFile();
			System.out.println("������ ���� ��������ϴ�.");
		}
	}
}
