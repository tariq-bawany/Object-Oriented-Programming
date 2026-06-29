package Assignment_01.Question_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double currentBalance = 10000;
        double savingsBalance = 5000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Banking Application!\n");
        double balance;
        while (true) {
            System.out.println("====== Main Menu ======");
            System.out.println("1-) Choose the Current Account.");
            System.out.println("2-) Choose the Savings Account.");
            System.out.println("3-) Exit the Program.");
            System.out.print("Choose any Option (1-3) : ");
            int accountChoice = sc.nextInt();
            switch (accountChoice) {
                case 1, 2 -> {
                    balance = (accountChoice == 1) ? currentBalance : savingsBalance;
                    boolean isRunning = true;
                    while (isRunning) {
                        System.out.println("\n====== " + (accountChoice == 1 ? "Current" : "Savings") + " Account ======");
                        System.out.println("1-) Deposit Funds.");
                        System.out.println("2-) Withdraw Funds.");
                        System.out.println("3-) Return to the Main Menu.");
                        System.out.print("Choose any option (1-3) : ");
                        int subChoice = sc.nextInt();
                        switch (subChoice) {
                            case 1 -> {
                                System.out.print("Enter an amount:");
                                double amount = sc.nextDouble();
                                balance += amount;
                                System.out.println("Deposited : " + amount);
                                System.out.println("New Balance : " + balance);
                            }
                            case 2 -> {
                                System.out.print("Enter an amount:");
                                double amount = sc.nextDouble();
                                if (amount <= balance) {
                                    balance -= amount;
                                    System.out.println("Withdrawn : " + amount);
                                    System.out.println("New Balance : " + balance);
                                } else System.out.println("Insufficient Balance!");
                            }
                            case 3 -> {
                                isRunning = false;
                                System.out.println("Returning to Main Menu!\n");
                                break;
                            }
                            default -> {
                                System.out.println("Invalid Choice!");
                            }
                        }
                    }
                    if (accountChoice == 1) currentBalance = balance;
                    else savingsBalance = balance;

                }
                case 3 -> {
                    System.out.println("Thanks you for banking with us! GoodBye.");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid Choice");
                }
            }
        }
    }
}