package oop15.stream02;

import java.io.Serializable;

public class Circle implements Serializable{
	int x;
	int y;
	double r;
	public Circle(int x, int y, double r) {
		this.x=x;
		this.y=y;
		this.r=r;
	}
	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", r=" + r + "]";
	}
}
