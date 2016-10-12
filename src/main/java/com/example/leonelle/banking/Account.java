package com.example.leonelle.banking;

/**
 * Created by leo on 12.10.16.
 */
public class Account {
    private double balance;

    // constructors
    public Account() {
        balance = 0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    // getters and setters
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // toString method
    public String toString() {
        return "Balance = " + balance;
    }
}
