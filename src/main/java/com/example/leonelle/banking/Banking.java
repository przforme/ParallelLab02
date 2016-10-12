package com.example.leonelle.banking;

/**
 * Created by student on 2016-10-07.
 */
public class Banking {
    public static void main(String[] args) {
        Bank myBank = new Bank(100);

        // initialize clerks
        int numberOfClerks = 3;
        Clerk[] myClerk = new Clerk[numberOfClerks];
        for (int i=0; i<numberOfClerks; i++) {
            myClerk[i] = new Clerk(myBank, 10000);
        }

        //start clerks
        for (int i =0; i<numberOfClerks; i++) {
            myClerk[i].start();
        }

        // check how much money is in the bank
        double moneyInBank = myBank.getTotalBalance();
        System.out.println("Money in the bank: " + moneyInBank);

        //check how much money was payed by the clerks
        double moneyTransferred = 0;
        for (int i=0; i<numberOfClerks; i++) {
            moneyTransferred += myClerk[i].getTotalAmount();
        }
        System.out.println("Money transferred: " + moneyTransferred);

        //check the difference
        double moneyMissing = moneyInBank - moneyTransferred;
        System.out.println("Difference: " + moneyMissing);
    }
}
