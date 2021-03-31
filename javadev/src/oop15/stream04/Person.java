package oop15.stream04;

import java.io.Serializable;

public class Person implements Serializable {
	String name;
	transient String secretInfo; //����ȭ ��󿡼� ����. �����ȵ�
	int age;
	transient int secretNum;
	
	public Person(String name, String secretInfo, int age, int secretNum) {
		super();
		this.name = name;
		this.secretInfo = secretInfo;
		this.age = age;
		this.secretNum = secretNum;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", secretInfo=" + secretInfo + ", age=" + age + ", secretNum=" + secretNum
				+ "]";
	}
	
	
}
