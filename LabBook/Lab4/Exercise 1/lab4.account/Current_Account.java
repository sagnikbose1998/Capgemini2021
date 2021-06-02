package lab4.account;

public class Current_Account extends Account{

	public Current_Account(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	double overdraft_limit=90;
	
	@Override
	public void deposit(double amount) {
		if(balance+amount>overdraft_limit) 
			System.out.println("Cannot deposit...");
		else
			balance=balance+amount;
	}
}
