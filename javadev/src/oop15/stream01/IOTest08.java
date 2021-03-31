package oop15.stream01;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

public class IOTest08 {
	public static void main(String[] args) throws Exception {
		long start =0;
		long end=0;
		
		FileInputStream fis1 = new FileInputStream("cal.jpg");
		start = System.currentTimeMillis(); //시간 측정 시작
		while(fis1.read() != -1) {	}
		end=System.currentTimeMillis(); //시간 측정 끝
		System.out.println("BufferedInputStream을 사용하지 않았을 때 : "+ (end-start)+"ms");
		fis1.close();

		FileInputStream fis2 = new FileInputStream("cal.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		start = System.currentTimeMillis(); //시간 측정 시작
		while(bis.read() != -1) {	}
		end=System.currentTimeMillis(); //시간 측정 끝
		System.out.println("BufferedInputStream을 사용했을 때 : "+ (end-start)+"ms");
		fis2.close();
		bis.close();
	}
}
