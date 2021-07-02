package javaDay3;

//Java Day 3 Exercise 3
public class B extends A {

	private char className = 'B';
	private int number;
	private String description;

	public B(int number, String decription) {
		super(number);
		this.description = decription;
	}

	public void printClassName() {
		System.out.print("My super class is ");
		super.printClassName();
		System.out.println("And my class name is " + className);
	}
}
