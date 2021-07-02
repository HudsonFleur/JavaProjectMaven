package javaDay4;

// Java Day 4 Exercise 4
public class Exercise4 {

	public boolean checkVowels(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		} else {
			return false;
		}
	}

	public int findVowels(String str) {
		int count = 0;
		char[] arr = str.toCharArray();
		for (char c : arr) {
			if (checkVowels(c)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Exercise4 e4 = new Exercise4();
		System.out.println(e4.findVowels("Hcl Technologies"));
	}
}
