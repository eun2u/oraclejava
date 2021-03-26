package oop12.reflection01;

public class Worker {
	public static final int MANAGER =1;
	public static final int ASSISTANT =2;
	public static final int EMPLOYEE =3;
	
	private String name;
	private int position;
	
	public Worker() {
		name=null;
		position=Integer.MAX_VALUE;
	}
	public Worker(String name, int postion) {
		this.name=name;
		this.position=position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Worker [name=" + name + ", position=" + position + "]";
	}
	
}
