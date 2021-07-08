package javaDay7;

public class SavingsAccount extends BankAccount{

	public SavingsAccount(String owner, double balance) {
		super(owner, balance);
	}

	private double annualInterestRate = 0.2699;
	
	public double depositMonthlyInterest()
	{
		this.setBalance(this.getBalance() + (this.getBalance() * annualInterestRate));
		return this.getBalance();
	}
	
	public double withdrawl(double amount)
	{	
		if(this.getBalance() < amount)
		{
			System.out.println("You currently do not have enough funds");
			
			return this.getBalance();
		}
		else {
			return super.withdrawl(amount);
		}
	}
}
