package org.example;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("Current Balance: $" + balance);
    }

    public void withdraw(double amount) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            System.out.println("Current Balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Initial Balance: $" + balance);
    }
}