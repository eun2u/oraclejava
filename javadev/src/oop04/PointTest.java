package oop04;

public class PointTest {
	public static void main(String[] args) {
		
		//up casting 
		Point2D up = new Point3D();
		up.x=10;
		up.y=20;
		//up.z=30; ¿¡·¯
		
		//down casting
		Point3D dn= (Point3D) up;
		dn.x=100;
		dn.y=200;
		dn.z=300;
	}

}
