package javaDay2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

// Java Day 2 Exercise 3
public class Date {
	private int month;
	private int day;
	private int year;

	public void displayDate() {
		System.out.println(month + "/" + day + "/" + year);
	}
}
