package oop15.stream01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

public class IOTest04 {
	public static void main(String[] args) throws Exception {
		File f = new File("sample.txt");
		System.out.println("�����ΰ���? :"+f.isFile());
		System.out.println("���丮�ΰ���? : " +f.isDirectory() );
		System.out.println("�̸� : " +f.getName());
		System.out.println("���� ��� : " +f.getAbsolutePath());
		System.out.println("�ֱ� ������ : " + new Date(f.lastModified()));
		System.out.println("ũ�� : "+f.length()+"bytes");
		
	}
}
