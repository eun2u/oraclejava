package oop15.stream03;

import java.io.Serializable;

public class Circle implements Serializable{
	Point p;
	double r;
	public Circle(int x, int y, double r) {
		p=new Point(x,y);
		this.r=r;
	}
	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	
}
