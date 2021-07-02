package javaDay3;

//Java Day 3 Exercise 3
public class A {

	private String className = "A";
	private int number;
	
	public A(int number )
	{
		this.number = number;
	}
	
	
	public void printClassName()
	{
		System.out.println(this.className);
	}
	
	public int getInt()
	{
		return number;
	}
}
