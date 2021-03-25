package oop09.exception;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class ExceptionTest04 {
	public static void main(String[] args) {

		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}

	private static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
	}
}
