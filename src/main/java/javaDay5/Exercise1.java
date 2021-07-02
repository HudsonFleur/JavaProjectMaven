package javaDay5;

import java.util.Arrays;

// Java Day 5 Exercise 1
public class Exercise1 {
	
	// Function to find the first index of a char
	public int findIndex(char c, char[] arr) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (c == arr[i]) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int maxCharacter(String str) {
		int count = 0, max = 0;
		char temp = ' ', toFind = ' ';

		char[] arrOrg = str.toCharArray();
		char[] arrSorted = str.toCharArray();

		// Sort array
		Arrays.sort(arrSorted);
		temp = arrSorted[0];

		// for loop
		for (int i = 0; i < arrSorted.length; i++) {
			if (temp == arrSorted[i]) {
				count++;
			} else {
				if (count > max) {
					max = count;
					toFind = temp;
				}
				count = 0;
			}
			temp = arrSorted[i];
		}

		// final check
		if (count > max) {
			toFind = temp;
		}

		System.out.println("Character is " + toFind);
		return findIndex(toFind, arrOrg);
	}

	public static void main(String[] args) {
		Exercise1 e1 = new Exercise1();

		String str1 = "aaafbbbdeeeda";
		String str2 = "eeddfssses";

		System.out.println("String is: " + str1 + " index is: " + e1.maxCharacter(str1));
		System.out.println("String is: " + str2 + " index is: " + e1.maxCharacter(str2));
	}
}
