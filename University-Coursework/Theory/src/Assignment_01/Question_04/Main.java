package Assignment_01.Question_04;

import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("====== Mathematical Calculation Program");
            System.out.println("1-) MAX Function");
            System.out.println("2-) PRIME Function");
            System.out.println("3-) MULTIPLICATION_TABLE Function");
            System.out.println("4-) ARITHMETIC_SERIES Function");
            System.out.println("5-) GCD Function");
            System.out.println("6-) Exit");
            System.out.print("Choose an Option (1-6): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> findMax();
                case 2 -> checkPrime();
                case 3 -> multiplication_table();
                case 4 -> arithmeticSeries();
                case 5 -> gcd();
                case 6 -> {
                    System.out.println("Exiting the Program!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid Choice");
                }
            }
            System.out.println();
        }
    }
    static void findMax() {
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();
        int max = (Math.max(a, Math.max(b, c)));
        System.out.println("The maximum value is " + max);
    }
    static void checkPrime() {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 2) {
            System.out.println(num + " is not a Prime Number");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println(num + " is a Prime Number");
        else System.out.println(num + " is not a Prime Number");
    }
    static void multiplication_table() {
        int num;
        while (true) {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            if (num > 0) break;
            System.out.println("Invalid number! Please enter a positive number.");
        }
        System.out.println("\n===== Multiplication Table of " + num + " =====");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " =" + String.format(" %5d", i * num));
        }
    }
    static void arithmeticSeries() {
        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();
        System.out.print("Enter Common Difference (d): ");
        int d = sc.nextInt();
        int n;
        while (true) {
            System.out.print("Enter number of terms (n): ");
            n = sc.nextInt();
            if (n > 0) break;
            System.out.println("Invalid number! Please enter a positive number.");
        }
        System.out.print("");
        System.out.print("Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + (i * d));
            System.out.print("  ");
        }
        System.out.println();
    }
    static void gcd() {
        int num1, num2;
        while (true) {
            System.out.print("Enter 1st number: ");
            num1 = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            num2 = sc.nextInt();
            if (num1 > 0 && num2 > 0) break;
            System.out.println("Invalid number! Please enter positive numbers.");
        }
        int k = 1;
        int gcd = 1;
        while (k <= num1 && k <= num2) {
            if (num1 % k == 0 && num2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
