package oop01;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D() {
		this(10,20);
		System.out.println("Point2d() 수행중");
	}
	
	public Point2D(int x, int y) {
		this.x=x;
		this.y=y;
		System.out.println("Point2D(x,y) 수행중");
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void print() {
		System.out.println("x = "+ getX());
		System.out.println("y = "+ getY());
	}
}
