package oop06.inter06;

public class InterfaceTest {

	public static void main(String[] args) {
		InterImpl impl = new InterImpl();
		
		interfaceA ia=impl;
		ia.methodA();
		System.out.println();
		
		interfaceB ib=impl;
		ib.methodB();
		System.out.println();
		
		interfaceC ic=impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
