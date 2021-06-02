package com.cg;

public class Transaction {
    private int accountNumber;

//    Constructor
    Transaction() { super(); }
    public Transaction(int accNum) { this.accountNumber = accNum; }


//    Methods
    public void execute() { System.out.println("Account Number: " + accountNumber); }
}
