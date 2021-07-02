package javaDay1;

import java.util.Scanner;

// Java Day 1 Exercise 5-18
public class Primitives {
	private int number = 10;
	private boolean condition = true;
	private String name = "Hudson";

	public int calculateSum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	public void question10() {
		int a = -5 + 8 * 6;
		double b = (55 + 9) % 9;
		double c = 20 + 3 * 5 / 8;
		double d = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);
		System.out.println("D: " + d);
	}

	public void findAverage() {
		int num = 0;
		double sum = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Find average of 3 numbers");
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter a num");
			num = in.nextInt();
			sum += num;
		}
		System.out.println("Average is " + sum / 3);
	}

	public void swap2Variables() {
		int a = 4;
		int b = 5;
		System.out.println("Before: \n" + "A: " + a + " B: " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After: \n" + "A: " + a + " B: " + b);
	}

	public boolean checkPrime() {
		Scanner in = new Scanner(System.in);
		boolean isPrime = false;

		int n = in.nextInt();

		for (int i = 2; i <= n / 2; ++i) {
			if (n % i == 0) {
				isPrime = true;
				break;
			}
		}
		return isPrime;
	}

	public void printASCII() {
		int value;
		char character;
		Scanner in = new Scanner(System.in);
		character = in.next().charAt(0);
		value = (byte) character;
		System.out.println("Value is " + value);
	}

	public void FizzBuzz() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + ": FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println(i + ": Fizz");
			} else if (i % 5 == 0) {
				System.out.println(i + ": Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Primitives p1 = new Primitives();

		// Question 5
		System.out.println("Question 5");
		System.out.println("Printing numbers from 1 to 10");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		// Question 6
		System.out.println("\n");
		System.out.println(" Question 6");
		System.out.println("Sum of first 10 natural numbers is " + p1.calculateSum());

		// Question 7
		System.out.println("\n");
		System.out.println(" Question 7");
		int age = 0;
		outer: while (age < 21) {
			if (age == 16) {
				System.out.println("Get your driver's licsense");
			} else {
				System.out.println("Another Year");
			}
			age++;
		}

		// Question 8
		System.out.println("\n");
		System.out.println(" Question 8");
		char name = 'J';
		switch (name) {
		case 'J':
			System.out.println("Matched J");
			break;
		case 'N':
			System.out.println("Macthed N");
			break;
		default:
			System.out.println("No Matches");
		}

		// Question 10
		System.out.println("\n");
		System.out.println(" Question 10");
		p1.question10();

		// Question 11
		System.out.println("\n");
		System.out.println(" Question 11");
		p1.findAverage();

		// Question 12
		System.out.println("\n");
		System.out.println(" Question 12");
		p1.swap2Variables();

		// Question 13
		System.out.println("\n");
		System.out.println(" Question 13");
		System.out.println("Enter a number to check if prime ");

		if (p1.checkPrime()) {
			System.out.println("The number is not prime");
		} else {
			System.out.println("The number is prime");
		}

		// Question 14
		System.out.println("\n");
		System.out.println(" Question 14");
		System.out.println("Enter a Character to get the ASCII value");
		p1.printASCII();

		// Question 15
		System.out.println("\n");
		System.out.println(" Question 15");
		System.out.println("FizzBuzz Problem");
		p1.FizzBuzz();
	}

}
