package lab4.account;

public class Savings_Account extends Account {

	final double minimum_balance=500;
	public Savings_Account(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void withdraw(double amount) {
		if(balance>=minimum_balance)
			balance=balance-amount;
		else
			System.out.println("Cannot Withdraw...");
	}
}
