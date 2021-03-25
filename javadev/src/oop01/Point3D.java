package oop01;

public class Point3D extends Point2D{
	private int z;
	public Point3D() {
		//하위 클래스의 생성자는 반드시 부모클래스의 생성자 호출
		// super()
		
		System.out.println("Point3D() 수행 중");
	}
	public Point3D(int x, int y, int z) {
		super(x,y); //생략하면 super() 호출됨
		this.z=z;
		System.out.println("Point3d(x,y,z) 수행 중");
			
	}
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("z = "+ getZ());
	}
}