package oop15.stream01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;


public class IOTest10 {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(reader);
		System.out.print("입력 : ");
		String str = br.readLine();
		System.out.println("출력 : " +str);
	}
}
