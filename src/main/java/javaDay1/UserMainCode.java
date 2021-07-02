package javaDay1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Java Day 1 Exercise 17-18
public class UserMainCode {
	public int sumOfSquaresOfEvenDigits(int num) {
		int number = 0, sum = 0;
		while (num != 0) {
			number = num % 10;
			if (number % 2 == 0) {
				sum = (int) (sum + Math.pow(number, 2));
			}
			num /= 10;
		}
		return sum;
	}

	public String findLongestWord(String str) {
		String longetString = Arrays.stream(str.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
		return longetString;
	}

	public static void main(String[] args) {
		UserMainCode UMC1 = new UserMainCode();

		System.out.println("Question 17");

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");

		int num = in.nextInt();
		in.close();

		System.out.println("Sum of Even digits is " + UMC1.sumOfSquaresOfEvenDigits(num));

		System.out.println("\n");
		System.out.println("Question 18");
		String sentence = "I am finding the longest string in this sentence here";
		System.out.println(UMC1.findLongestWord(sentence));

	}
}
