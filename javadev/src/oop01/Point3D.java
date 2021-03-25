package oop01;

public class Point3D extends Point2D{
	private int z;
	public Point3D() {
		//���� Ŭ������ �����ڴ� �ݵ�� �θ�Ŭ������ ������ ȣ��
		// super()
		
		System.out.println("Point3D() ���� ��");
	}
	public Point3D(int x, int y, int z) {
		super(x,y); //�����ϸ� super() ȣ���
		this.z=z;
		System.out.println("Point3d(x,y,z) ���� ��");
			
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