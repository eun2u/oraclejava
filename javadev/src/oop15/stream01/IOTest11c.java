package oop15.stream01;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;


public class IOTest11c {
	public static void main(String[] args) throws Exception {
		File f= new File("print2.txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("[프린터 보조 스트림]");
		pw.print("그래, ");
		pw.println("난 정대만. 절대로 포기하지 ");
		pw.println("않는 남자지.");
		pw.println(20);
	
		pw.flush();
		pw.close();
		fw.close();
	}
}
