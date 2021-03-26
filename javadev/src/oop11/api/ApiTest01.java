package oop11.api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ApiTest01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); //<String> 을 제네릭이라고 함
		set.add("한가인");
		set.add("전지현");
		set.add("한가인");
		set.add("김태희");
		set.add("이민정");
		
		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
