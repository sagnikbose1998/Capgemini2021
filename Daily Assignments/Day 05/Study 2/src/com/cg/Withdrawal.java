package com.cg;

public class Withdrawal extends Transaction {
    private double amount;

//    Constructor
    public Withdrawal(int accNum, double amt) {
        super(accNum);
        this.amount = amt;
    }


//    Methods
    public void execute(double balance) {
        super.execute();
        balance -= amount;
        System.out.println("Balance: " + balance);
    }
}
