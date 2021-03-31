package oop15.stream01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

public class IOTest05 {
	public static void main(String[] args) throws Exception {
		String original = "sample.txt";
		String target = "copy.txt";
		
		FileInputStream fis = new FileInputStream(original);
		FileOutputStream fos = new FileOutputStream(target);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes))!=-1) {
			fos.write(readBytes);
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}
}
