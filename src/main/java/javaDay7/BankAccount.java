package javaDay7;

public class BankAccount {

	private String owner;
	private double balance;
	
	public BankAccount(String owner, double balance) {
		// TODO Auto-generated constructor stub
		this.owner = owner;
		this.balance = balance;
	}
	
	public double deposit(double amount)
	{
		return this.balance += amount;
	}
	
	public double withdrawl(double amount)
	{
		return this.balance -= amount;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String toString()
	{
		return String.format("Name: " + owner + " balance: " + balance);
	}
}
