package oop15.stream01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOTest03 {
	public static void main(String[] args) throws Exception {
		File f = new File("abc.txt");
		if(f.exists()) {
			System.out.println("파일이 존재합니다.");
		}else {
			f.createNewFile();
			System.out.println("파일을 새로 만들었습니다.");
		}
	}
}
