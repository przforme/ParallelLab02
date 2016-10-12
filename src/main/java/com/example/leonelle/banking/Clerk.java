package com.example.leonelle.banking;

/**
 * Created by leo on 12.10.16.
 */
public class Clerk extends Thread {
    private Bank myBank;
    private int numberOfTransfers;
    private double totalAmount;

    public Clerk(Bank myBank, int numberOfTransfers) {
        this.myBank = myBank;
        this.numberOfTransfers = numberOfTransfers;
        totalAmount = 0;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void run() {
        int naccounts = myBank.getNumberOfAccounts();
        for (int i = 0; i < numberOfTransfers; i++) {
            int accountNumber = (int) (Math.random() * naccounts);
            double amount = (int) (Math.random() * 100);
            myBank.transferMoney(accountNumber, amount);
            totalAmount += amount;
        }
    }
}
