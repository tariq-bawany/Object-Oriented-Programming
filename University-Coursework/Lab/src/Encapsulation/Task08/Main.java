package Encapsulation.Task08;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc1 = new BankAccount();

        System.out.print("Enter your Back Account Holder name:");
        acc1.setAccountHolder(sc.nextLine());
        System.out.print("Enter your Back Account Balance:");
        acc1.deposit(sc.nextDouble());
        int optionSelected;
        System.out.println("Bank Menu Program");
        do {
            System.out.println("~~~~~~~~~~~~~~~");
            System.out.println("Options\n1) Deposit \n2) Withdraw \n3) Check Balance \n4) Exit");
            System.out.print("Enter your Choice (1 - 4): ");
            optionSelected = sc.nextInt();
            switch (optionSelected) {
                case 1 -> {
                    System.out.print("Enter the deposit amount: ");
                    acc1.deposit(sc.nextDouble() + acc1.getBalance());
                }
                case 2 -> {
                    System.out.print("Enter the withdraw amount: ");
                    acc1.withdraw(sc.nextDouble());
                }
                case 3 -> System.out.printf("Your Current Balance is %.2f\n", acc1.getBalance());
                case 4 -> System.out.println("You Exit the Program.");
                default -> System.out.println("Invalid Choice!");
            }

        } while (optionSelected != 4);

    }
}
