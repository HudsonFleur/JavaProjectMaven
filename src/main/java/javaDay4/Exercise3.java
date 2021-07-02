package javaDay4;

// Java Day 4 Exercise 3
public class Exercise3 {

	public void displayMiddle(String str) {
		int mid, even;
		if (str.length() % 2 == 0) {
			even = (str.length() / 2) - 1;
			mid = str.length() / 2;
			System.out.print(str.charAt(even));
			System.out.print(str.charAt(mid));
		} else {
			mid = str.length() / 2;
			System.out.println(str.charAt(mid));
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		Exercise3 e3 = new Exercise3();

		// Even
		String str = "123456";
		e3.displayMiddle(str);
		
		// Odd
		String str2 = "12345";
		e3.displayMiddle(str2);
	}
}
