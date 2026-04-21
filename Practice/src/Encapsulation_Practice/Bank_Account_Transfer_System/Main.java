package Encapsulation_Practice.Bank_Account_Transfer_System;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
//        Scanner
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new BankAccount("Muhammad Tariq", 10000, "2512453");
        accounts[1] = new BankAccount("Shamppy", 50000, "2512440");

        System.out.printf("Account Details:\nAccount Holder: %s\nBalance: %.2f\nAccount Number: %s\n\n", accounts[0].getAccountHolder(), accounts[0].getBalance(), accounts[0].getAccountNumber());
        accounts[0].deposit(5000);
        System.out.printf("\nAccount Details:\nAccount Holder: %s\nBalance: %.2f\nAccount Number: %s\n\n", accounts[0].getAccountHolder(), accounts[0].getBalance(), accounts[0].getAccountNumber());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter senders name:");
        String senderName = sc.nextLine();
        System.out.print("Enter receivers name:");
        String receiverName = sc.nextLine();
        BankAccount senderAccount = null;
        BankAccount receiverAccount = null;
        for (BankAccount account : accounts) {
            if (senderName.equalsIgnoreCase(account.getAccountHolder())) {
                senderAccount = account;
            } else if (receiverName.equalsIgnoreCase(account.getAccountHolder())) {
                receiverAccount = account;
            }
        }

        if (senderAccount != null && receiverAccount != null) {
            System.out.print("Enter amount to transfer:");
            senderAccount.transfer(receiverAccount, sc.nextDouble());
            for (BankAccount account : accounts) {
                System.out.printf("\nAccount Details:\nAccount Holder: %s\nBalance: %.2f\nAccount Number: %s\n", account.getAccountHolder(), account.getBalance(), account.getAccountNumber());
            }
        } else {
            if (senderAccount == null) System.out.println("Sender Account not found");
            else System.out.println("Receiver account not found.");
        }


    }
}
