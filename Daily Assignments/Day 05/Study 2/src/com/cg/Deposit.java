package com.cg;

public class Deposit extends Transaction {
    private double amount;

//    Constructor
    public Deposit(int acc, double amt) {
        super(acc);
        this.amount = amt;
    }


//    Methods
    public void execute(double balance) {
        super.execute();
        balance += amount;
        System.out.print("Balance: " + balance);
    }
}
