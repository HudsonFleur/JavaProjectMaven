package javaDay2;

//Java Day 2 Exercise 4,5,6
public class DogTest {
	public static void main(String[] args) {

		Dog d1 = new Dog("Kody", 7, 56.4);
		Dog d2 = new Dog("Jack", 9, 34.8);

		System.out.println(d1);
		System.out.println(d2);

		d1.showExcitement();
		d2.showExcitement(4);
	}
}
