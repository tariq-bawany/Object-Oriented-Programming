package Encapsulation.Task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account  = new BankAccount();
        System.out.print("Enter the Account Holder name: ");
        account.setAccountHolder(sc.nextLine());

        System.out.print("Enter your initial balance: ");
        account.deposit(sc.nextDouble());

        System.out.print("Enter your withdraw amount: ");
        account.withdraw(sc.nextDouble());

        System.out.printf("%s has  current balance of %.2f",account.getAccountHolder(),account.getBalance());
    }
}
