package oop05.abstract01;

public class ShapeTest {
	public static void main(String[] args) {	
		printArea(new Circle());
		printArea(new Rectangle());
		printArea(new Triangle());
	}

	private static void printArea(Shape s) { //������
		s.area();
		if(s instanceof Circle) {
			Circle c= (Circle) s;
			System.out.println("�������� "+c.r + "�� ���� ���̴� "+c.res);
		}
		else if(s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			System.out.println("���ΰ� "+r.w + ", ���ΰ� "+r.h + "�� �簢���� ���̴� " +r.res);
		}
		else {
			Triangle t = (Triangle) s;
			System.out.println("�غ��� "+t.w + ", ���̰� "+t.h + "�� �ﰢ���� ���̴� " +t.res);
		}
	}

//	private static void printArea(Triangle t) {
//		t.area();
//		System.out.println("�غ��� "+t.w + ", ���̰� "+t.h + "�� �ﰢ���� ���̴� " +t.res);
//	}
//
//	private static void printArea(Rectangle r) {
//		r.area();
//		System.out.println("���ΰ� "+r.w + ", ���ΰ� "+r.h + "�� �簢���� ���̴� " +r.res);
//	}
//
//	private static void printArea(Circle c) {
//		c.area();
//		System.out.println("�������� "+c.r + "�� ���� ���̴� "+c.res);
//	}
}
