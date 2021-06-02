package com.cg;

public class BalaceInquiry extends Transaction {

//    Constructors
    BalaceInquiry() { super(); }
    public BalaceInquiry(int accNum) { super(accNum); }

//    Methods
    public void execute(double bal) {
        super.execute();
        System.out.println("Balance: " + bal);
    }

}
