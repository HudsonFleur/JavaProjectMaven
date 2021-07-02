package javaDay2;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

// Java Day 2 Exercise 2
public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee(String first, String last, double salary) {
		firstName = first;
		lastName = last;

		if (salary > 0) {
			monthlySalary = salary;
		}
	}

	public double getYearlySalary() {
		return monthlySalary * 12;
	}

	public void addRaise() {
		monthlySalary = monthlySalary += (monthlySalary * 0.10);
	}
}
