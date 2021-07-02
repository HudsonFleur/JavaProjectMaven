package javaDay3;

//Java Day 3 Exercise 2,4,5
public class Dog extends Animal {
	protected void eat() {
		System.out.println("I am eating");
	}

	protected void bark() {
		System.out.println("I am barking");
	}

	Dog makeNoise(String message) {
		System.out.println("Make Noise!!");
		System.out.println("Here is my message: " + message);
		return new Dog();
	}
}
