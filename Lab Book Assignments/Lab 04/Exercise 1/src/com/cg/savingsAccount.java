package com.cg;

public class savingsAccount extends Account {
    final private int minimumBalance = 500;

    @Override
    public void withdraw(double amount) {
        if (amount < minimumBalance)
            super.withdraw(amount);
        else
            System.out.println("Balance is low!");
    }
}
