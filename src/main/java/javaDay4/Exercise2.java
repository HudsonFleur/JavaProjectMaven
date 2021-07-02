package javaDay4;

public class Exercise2 {

	public static void main(String[] args) {
		String s1 = new String("cat");
		String s2 = new String("cat");
		String s3 = "cat";
		String s4 = "cat";

		// Comparing 2 String Objects
		System.out.println(s1 == s2);

		// Comparing 2 String Literal
		System.out.println(s3 == s4);

		// Comparing String Reference to String Literal
		System.out.println(s1 == s3);

		// Creating String buffer and appending a String Literal
		StringBuffer s5 = new StringBuffer("cat");
		s5.append(s4);
		System.out.println(s5);
	}
}
