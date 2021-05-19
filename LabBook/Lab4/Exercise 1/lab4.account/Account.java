/* Exercise1:   Create Person and Account Class as shown below in class diagram. 
 * Ensure minimum balance of INR 500 in a bank account is available.
 */

package lab4.account;

public class Account {
	long accNum;
	double balance;
	Person accHolder;
	
	public Account(long accNum,double balance,Person accHolder) {
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public void deposit(double amount) {
		balance=balance+amount;
	}
	
	public void withdraw(double amount) {
		balance=balance-amount;
	}
	
}
