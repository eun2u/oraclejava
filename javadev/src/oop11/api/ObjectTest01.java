package oop11.api;

class Point{
	
}
public class ObjectTest01 {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Ŭ���� �̸�: "+ pt.getClass());
		System.out.println("�ؽ� �ڵ�: "+pt.hashCode());
		System.out.println("�ν��Ͻ� ������: "+pt.toString());
		
		System.out.println();
		
		Point pt2=new Point();
		System.out.println("Ŭ���� �̸�: "+ pt.getClass());
		System.out.println("�ؽ� �ڵ�: "+pt.hashCode());
		System.out.println("�ν��Ͻ� ������: "+pt.toString());
		
		
		
	}
}
