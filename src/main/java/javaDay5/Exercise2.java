package javaDay5;

import java.util.Scanner;

// Java Day 5 Exercise 2
public class Exercise2 {

	public boolean checkPalindrome(String str) {
		
		// Java way of doing it
		/*
		StringBuilder testStr = new StringBuilder(str);
		testStr = testStr.reverse();
		String revString = testStr.toString();

		if (str.equals(revString)) {
			return true;
		} else {
			return false;
		}*/
		
		char[] arr = str.toCharArray();
		int length = arr.length;
		boolean isTrue = false;
		
		for(int i = 0; i < (arr.length/2); i++)
		{
			if(arr[i] != arr[(length - 1) - i])
			{
				isTrue = false;
				break;
			}
			else {
				isTrue = true;
			}
		}
		return isTrue;
	}

	public static void main(String[] args) {
		Exercise2 e2 = new Exercise2();
		System.out.println("Enter a string");
		Scanner in = new Scanner(System.in);

		String str = in.nextLine();
		in.close();
		if (e2.checkPalindrome(str)) {
			System.out.println("This is a palindrome");
		} else {
			System.out.println("This is not a palindrome");
		}

	}
}
