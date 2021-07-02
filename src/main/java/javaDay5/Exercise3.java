package javaDay5;

import java.util.Stack;

// Java Day 5 Exercise 3
public class Exercise3 {

	public boolean findEnclosing(String str) {
		int countPush = 0, countPop = 0;
		boolean balanced = false;
		Stack<Character> type1 = new Stack<Character>();

		char[] arr = str.toCharArray();

		for (char c : arr) {
			if (c == '{' || c == '[' || c == '(' || c == '<') {

				type1.push(c);

			} else if (c == '}' || c == ']' || c == ')' || c == '>') {
				
				type1.pop();
			}
		}

		return type1.isEmpty();
	}

	public static void main(String[] args) {
		Exercise3 e3 = new Exercise3();

		String str1 = "{{{}}}"; // True
		String str2 = "(((()))"; // False
		String str3 = "{{[}]}"; // True
		String str4 = "{{}}{]"; // False need to figure this out
		System.out.println("The string is balanced " + e3.findEnclosing(str3));
	}

}
