package javaDay1;

import java.util.Scanner;

// Java Day 1 Exercise 16
public class CheckSum {

	static int checkSum(int num) {
		int number = 0, sum = 0;
		while (num != 0) {
			number = num % 10;
			if (number % 2 != 0) {
				sum += number;
			}
			num /= 10;
		}
		if (sum % 2 != 0) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number");

		int num = in.nextInt();
		in.close();

		if (checkSum(num) == 1) {
			System.out.println("Sum of odd digits is odd");
		} else {
			System.out.println("Sum of odd digits is not odd");
		}
	}
}
