package javaDay2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

// Java Day 2 Exercise 4,5,6
public class Dog {
	private String name;
	private int age;
	private double weight;

	public Dog(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public void showExcitement() {
		System.out.println(name + " is wagging its taill!!!");
	}

	public void showExcitement(int levelOfExcitement) {
		System.out.println(name + " is wagging its taill!!!");
		System.out.println(name + " excitement level is: " + levelOfExcitement);
	}

	public void eating() {
		System.out.println("eating!");
	}

	public void eating(String food) {
		System.out.println("eating " + food);
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
}
