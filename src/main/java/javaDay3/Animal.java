package javaDay3;

// Java Day 3 Exercise 2,4,5
public class Animal {

	private String furColor;

	public void walk() {
		System.out.println("I am walking");
	}

	Animal makeNoise() {
		System.out.println("Make Noise!!");
		return this;
	}

	public void setfurColor(String color) {
		furColor = color;
	}

	public String getfurColor() {
		return furColor;
	}
}
