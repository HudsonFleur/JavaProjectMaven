package javaDay2;

// Java Day 2 Exercise 1
public class InvoiceTest {

	public static void main(String[] args) {
		Invoice i1 = new Invoice("Hammer", "Used to hit nails", 5, 10.99);

		System.out.println("Part Number: " + i1.getPartNumber());
		System.out.println("Description: " + i1.getDescription());
		System.out.println("Quantity: " + i1.getQuantity());
		System.out.println("Price: " + i1.getPrice());

		System.out.println("Total Price: " + i1.getInvoiceAmount());

	}

}
