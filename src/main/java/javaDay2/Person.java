package javaDay2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

// Java Day 2 Exercise 7
public class Person {
	private String name;
	private int age;
	private double shoeSize;

	private void walking() {
		System.out.println(name + " age " + age + " with shoe size " + shoeSize + " is walking");
	}

	public void startWalking() {
		walking();
	}

}
