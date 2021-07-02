package javaDay2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

// Java Day 2 Exercise 1
public class Invoice {

	private String partNumber;
	private String description;
	private int quantity;
	private double price;

	public double getInvoiceAmount() {
		if (quantity < 0) {
			quantity = 0;
		}
		if (price < 0) {
			price = 0;
		}
		return price * quantity;
	}
}
