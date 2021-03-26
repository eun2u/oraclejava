package oop12.reflection01;

public class ReflectionTest {

	public static void main(String[] args) {
		Worker worker = new Worker("����ȣ",Worker.MANAGER);
		Class<?> cls1 = worker.getClass(); //<?> : ���ϵ�ī��
		
		Class cls2 = Worker.class;
		
		Class cls3 = null;
		try {
			cls3=Class.forName("oop12.reflection01.Worker");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("cls1 : "+ cls1.hashCode());
		System.out.println("cls2 : "+ cls2.hashCode());
		System.out.println("cls3 : "+ cls3.hashCode());
		
	}
}
