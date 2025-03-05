package org.example;

import java.util.Scanner;

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount("378803204029954", "Astrid Becker", 1000.00);

        System.out.println("\n     ~~ ACCOUNT DETAILS ~~     ");
        account.displayAccountDetails();

        while (true) {
        System.out.print("\nEnter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        if (depositAmount > 0) {
            account.deposit(depositAmount);
            break;
        }
            System.out.println("Amount entered is invalid. Please enter a valid amount.");
        }

        while (true) {
        System.out.print("\nEnter withdraw amount: ");
        double withdrawAmount = scanner.nextDouble();
        if (withdrawAmount > 0 && withdrawAmount <= account.getBalance()) {
            account.withdraw(withdrawAmount);
            break;
        }
            System.out.println("Insufficient funds or the amount entered is invalid. Please try again.");
        }

    }
}
