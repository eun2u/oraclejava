package oop11.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApiTest02 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("�Ѱ���"); printList(list);
		list.add("������"); printList(list);
		list.add("�Ѱ���"); printList(list);
		list.add("������"); printList(list);
		list.add("�̹���"); printList(list);
		
		list.add(2, "������"); printList(list);
		list.remove("�̹���"); printList(list);
		list.remove("�Ѱ���"); printList(list); //�ߺ��Ǿ��ִ� ��쿡�� ���� ���ʺ��� ����
		list.remove(1); printList(list);
		list.set(1, "�����"); printList(list);
		
		list.add("������");  printList(list);
		list.add("�̹���");  printList(list);
		list.add("������");  printList(list);
		list.add("�̹���");  printList(list);
		
		System.out.println("�������� ��ġ: "+ list.indexOf("������"));
		System.out.println("�������� ��ġ: "+ list.lastIndexOf("������"));
//		System.out.println(list.size());
		
//		Iterator<String> iter = list.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}

//		for(int i=0;i<list.size();i++)
//			System.out.println(list.get(i));

	}

	private static void printList(List<String> list) {
		System.out.print("size: "+ list.size()+ ",\t");
		for(String str:list)
			System.out.print(str + "\t");		
		
		System.out.println();
	}
}
