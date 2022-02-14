package entities;

public class Account {
	
	private int numAccount;
	private String name;
	private double balance;
	
	public Account() {
	}
	
	public Account(int numAccount, String name) {
		this.numAccount = numAccount;
		this.name = name;
	}
	
	public Account(int numAccount, String name, double initialDeposit) {
		this.numAccount = numAccount;
		this.name = name;
		deposit(initialDeposit);
	}

	public int getNumAccount() {
		return numAccount;
	}

	public void setNumAccount(int numAccount) {
		this.numAccount = numAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ numAccount
				+", Holder: "
				+ name 
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
