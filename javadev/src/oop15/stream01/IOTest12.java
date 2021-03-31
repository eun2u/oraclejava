package oop15.stream01;

import java.io.BufferedReader;
import java.io.FileReader;


public class IOTest12 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("print.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String data;
		while((data=br.readLine()) != null) {
			System.out.println(data);
		}
		br.close();
	}
}
