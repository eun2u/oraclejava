package oop15.stream01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class IOTest06b {
	public static void main(String[] args) throws Exception {
		File f = new File("sample3.txt");
		FileWriter fw = new FileWriter(f);
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("그래, 난 정대만. " +"\r\n");
		bw.write("절대로 포기하지 않는 남자지!");
		
		bw.flush();
		bw.close();
		
		System.out.println("파일에 저장되었습니다.");
	}
}
