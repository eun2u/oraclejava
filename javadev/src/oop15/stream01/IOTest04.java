package oop15.stream01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

public class IOTest04 {
	public static void main(String[] args) throws Exception {
		File f = new File("sample.txt");
		System.out.println("파일인가요? :"+f.isFile());
		System.out.println("디렉토리인가요? : " +f.isDirectory() );
		System.out.println("이름 : " +f.getName());
		System.out.println("절대 경로 : " +f.getAbsolutePath());
		System.out.println("최근 수정일 : " + new Date(f.lastModified()));
		System.out.println("크기 : "+f.length()+"bytes");
		
	}
}
