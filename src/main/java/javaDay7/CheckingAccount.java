package javaDay7;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(String owner, double balance) {
		super(owner, balance);
		// TODO Auto-generated constructor stub
	}

	private double insufficentFundsFee = 30;
	
	public double processCheck(String check, double amount)
	{
		if(!check.equalsIgnoreCase("check") || amount < 0)
		{
			System.out.println("Please give a valid check");
			return this.getBalance();
		}
		else {
			return this.deposit(amount);
		}
	}
	
	public double withdrawl(double amount)
	{	
		if(this.getBalance() < amount)
		{
			System.out.println("You currently do not have enough funds, a fee was charged to your account");
			
			this.setBalance(this.getBalance() + insufficentFundsFee);
			
			return this.getBalance();
		}
		else {
			return super.withdrawl(amount);
		}
	}
}
