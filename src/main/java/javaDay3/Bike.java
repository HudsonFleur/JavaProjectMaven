package javaDay3;

//Java Day 3 Exercise 1
public class Bike extends Cycle {
	String define_me() {
		return "a cycle with an engine.";
	}

	Bike() {
		System.out.println("Hello I am a motorcycle I am " + define_me());
		String temp = super.define_me();
		System.out.println("My ancestor is a cycle who is " + temp);
	}
}
