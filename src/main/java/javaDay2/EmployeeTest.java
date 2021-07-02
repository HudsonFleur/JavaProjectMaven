package javaDay2;

// Java Day 2 Exercise 2
public class EmployeeTest {
	public static void main(String[] args) {

		Employee e1 = new Employee("Bob", "Smith", 5400);
		Employee e2 = new Employee("Maria", "Santana", 6000);

		System.out.println("Name: " + e1.getFirstName() + " " + e1.getLastName());
		System.out.println("Monthly Salary: " + e1.getMonthlySalary());
		System.out.println("Yearly: " + e1.getYearlySalary());
		e1.addRaise();
		System.out.println("Monthty Raise: " + e1.getMonthlySalary());
		System.out.println("New Yearly: " + e1.getYearlySalary());

		System.out.println("Name: " + e2.getFirstName() + " " + e2.getLastName());
		System.out.println("Monthly Salary: " + e2.getMonthlySalary());
		System.out.println("Yearly: " + e2.getYearlySalary());
		e2.addRaise();
		System.out.println("Monthty Raise: " + e2.getMonthlySalary());
		System.out.println("New Yearly: " + e2.getYearlySalary());
	}
}
