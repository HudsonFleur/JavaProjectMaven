package javaDay4;

// Java Day 4 Exercise 1 Class (UserMainCode)
public class Exercise1 {

	public int checkCharacters(String str) {
		char firstChar = str.charAt(0);
		String firstString = Character.toString(firstChar);

		char lastChar = str.charAt(str.length() - 1);
		String lastStr = Character.toString(lastChar);
		if (firstString.equals(lastStr)) {
			return 1;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Exercise1 e1 = new Exercise1();

		String str = "the picture was great";
		String str2 = "this";

		if (e1.checkCharacters(str) == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

		if (e1.checkCharacters(str2) == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
