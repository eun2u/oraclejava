package oop15.stream01;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;


public class IOTest11b {
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos);
		
		
		ps.println("[프린터 보조 스트림]");
		ps.print("그래, ");
		ps.println("난 정대만. 절대로 포기하지 ");
		ps.println("않는 남자지.");
		ps.println(20);
		
		ps.flush();
		ps.close();
		fos.close();
	}
}
