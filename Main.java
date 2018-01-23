package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount osAccount = new BankAccount("1234", 0.00, "om", "yep.com", "23435");

        osAccount.withdraw(100.00);
        osAccount.deposit(600.00);
        osAccount.withdraw(100.00);


    }

}
