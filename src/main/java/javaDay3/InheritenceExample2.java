package javaDay3;

//Java Day 3 Exercise 2,4,5
public class InheritenceExample2 extends Dog {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.walk();
		dog.eat();
		dog.bark();

		// Exercise 4
		dog.setfurColor("grey");
		System.out.println("The dog's fur color is " + dog.getfurColor());

		// Exercise 5
		dog.makeNoise("testing this method");
	}
}
