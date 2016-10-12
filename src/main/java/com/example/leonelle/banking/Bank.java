package com.example.leonelle.banking;

/**
 * Created by student on 2016-10-07.
 */
public class Bank {
    private final int numberOfAccounts;
    private Account[] accounts;

    public Bank(int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
        accounts = new Account[numberOfAccounts];
        for (int i = 0; i < numberOfAccounts; i++) {
            accounts[i] = new Account(0);
        }
    }

    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public synchronized void transferMoney(int accountNumber, double amount) {
        double oldBalance = accounts[accountNumber].getBalance();
        double newBalance = oldBalance + amount;
        accounts[accountNumber].setBalance(newBalance);
    }

    public synchronized double getTotalBalance() {
        double totalBalance = 0;
        for (int i = 0; i < numberOfAccounts; i++) {
            totalBalance += accounts[i].getBalance();
        }
        return totalBalance;
    }
}
