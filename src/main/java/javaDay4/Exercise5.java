package javaDay4;

import java.util.Scanner;

// Java Day 4 Exercise 5
public class Exercise5 {
	
	public int add(int num1, int num2)
	{
		int sum = Math.addExact(num1, num2);
		return sum;
	}
	
	public int subtract(int num1, int num2)
	{
		int sum = Math.subtractExact(num1, num2);
		return sum;
	}
	
	public int multiply(int num1, int num2)
	{
		int sum = Math.multiplyExact(num1, num2);
		return sum;
	}
	
	public int division(int num1, int num2)
	{
		int sum = Math.floorDiv(num1, num2);
		return sum;
	}
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
	}
}
