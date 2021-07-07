package javaDay7;

public class BankDriver {

	public static void main(String[] args) {
	
		CheckingAccount ca1 = new CheckingAccount("Mary", 16000);
		
		System.out.println(ca1);
		System.out.println("New Balance is " + ca1.deposit(4000));
		System.out.println("New Balance is " + ca1.processCheck("check", 4500));
		System.out.println("New Balance is " + ca1.withdrawl(1000));
		
		SavingsAccount sa1 = new SavingsAccount("Hudson", 21000);
		
		System.out.println("\n" + sa1);
		System.out.println("New Balance is " + sa1.deposit(5000));
		System.out.println("New Balance is " + sa1.depositMonthlyInterest());
		System.out.println("New Balance is " + sa1.withdrawl(4000));
		
	}
}
