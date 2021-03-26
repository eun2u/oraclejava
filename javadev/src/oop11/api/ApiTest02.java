package oop11.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApiTest02 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("ÇÑ°¡ÀÎ"); printList(list);
		list.add("ÀüÁöÇö"); printList(list);
		list.add("ÇÑ°¡ÀÎ"); printList(list);
		list.add("±èÅÂÈñ"); printList(list);
		list.add("ÀÌ¹ÎÁ¤"); printList(list);
		
		list.add(2, "½ÅÇı¼±"); printList(list);
		list.remove("ÀÌ¹ÎÁ¤"); printList(list);
		list.remove("ÇÑ°¡ÀÎ"); printList(list); //Áßº¹µÇ¾îÀÖ´Â °æ¿ì¿¡´Â °¡Àå ¿ŞÂÊºÎÅÍ »èÁ¦
		list.remove(1); printList(list);
		list.set(1, "±è°íÀº"); printList(list);
		
		list.add("±èÅÂÈñ");  printList(list);
		list.add("ÀÌ¹ÎÁ¤");  printList(list);
		list.add("±èÅÂÈñ");  printList(list);
		list.add("ÀÌ¹ÎÁ¤");  printList(list);
		
		System.out.println("±èÅÂÈñÀÇ À§Ä¡: "+ list.indexOf("±èÅÂÈñ"));
		System.out.println("±èÅÂÈñÀÇ À§Ä¡: "+ list.lastIndexOf("±èÅÂÈñ"));
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
