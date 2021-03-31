package oop15.stream01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

public class IOTest07b {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("sample2.txt");
		
		BufferedReader br = new BufferedReader(fr);
		String data;
		while((data=br.readLine()) != null) { //readLine() :문자열 단위로 입력받기.
			System.out.println(data);
		}
		br.close();
	}
}
