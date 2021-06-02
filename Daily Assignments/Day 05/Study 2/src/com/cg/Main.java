package com.cg;

import java.util.Scanner;

public class Main {

    static void withdraw(int acc, double bal) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();

        Withdrawal w = new Withdrawal(acc, amt);
        w.execute(bal);

        sc.close();
    }

    static void deposit(int acc, double bal) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();

        Deposit d = new Deposit(acc, amt);
        d.execute(bal);

        sc.close();
    }

    static void checkBalance(int acc, double balance) {
        Scanner sc = new Scanner(System.in);

        BalaceInquiry b = new BalaceInquiry(acc);
        b.execute(balance);

        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Account Number : ");
        int accNum=sc.nextInt();
        System.out.print("Enter the initial amount : ");
        double balance=sc.nextDouble();

        System.out.print("Enter your choice:\n1. Check Balance\n2. Withdraw Money\n3. Deposit Money\n");
        int ch = sc.nextInt();
        if (ch == 1)
            checkBalance(accNum,balance);
        else if (ch == 2)
            withdraw(accNum,balance);
        else if (ch == 3)
            deposit(accNum,balance);
        else
            System.out.println("Wrong choice entered!");

        sc.close();
    }
}
