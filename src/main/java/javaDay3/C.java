package javaDay3;

//Java Day 3 Exercise 3
public class C {

	public static void main(String[] args) {
		B classB = new B(3, "This is a subclass");
		classB.printClassName();
		System.out.println("The int passed into class B is " + classB.getInt());
	}
}
