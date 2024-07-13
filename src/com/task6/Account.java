package com.task6;
public class Account {
    private int accountNumber;
    private double balance;

    // No-argument constructor
    public Account() {
        this.accountNumber = 0;
        this.balance = 0.0;
    }

    // Two-argument constructor
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit amount to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Account balance: " + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.checkBalance();
        acc1.deposit(500);
        acc1.checkBalance();
        acc1.withdraw(200);
        acc1.checkBalance();

        Account acc2 = new Account(123456, 1000);
        acc2.checkBalance();
        acc2.deposit(300);
        acc2.checkBalance();
        acc2.withdraw(1500);
        acc2.checkBalance();
    }
}


