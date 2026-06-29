package Assignment_01.Question_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your age:");
            int age = sc.nextInt();
            if (age < 0 || age > 122) {
                System.out.println("Invalid age!");
                System.exit(1);
            }

            System.out.print("Are you a Student (Y/N):");
            char student = sc.next().toUpperCase().charAt(0);
            boolean isStudent = (student == 'Y');

            System.out.println("\n===== Internet Data Packages =====");
            System.out.println("1-) Basic Package");
            System.out.println("2-) Standard Package");
            System.out.println("3-) Premium Package");
            System.out.println("4-) Exit");
            System.out.print("Select an option (1-4) :");
            int choice = sc.nextInt();
            double basePrice = 0;
            String packageName = "";
            switch (choice) {
                case 1 -> {
                    basePrice = 1500;
                    packageName = "Basic Package";
                }
                case 2 -> {
                    basePrice = 1500;
                    packageName = "Standard Package";
                }
                case 3 -> {
                    basePrice = 1500;
                    packageName = "Premium Package";
                }
                case 4 -> {
                    System.out.println("Exiting the Program!");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid Choice!");
                    continue;
                }
            }
            double finalPrice = basePrice;
            if (age < 18) finalPrice -= (basePrice * 0.2);
            if (isStudent) finalPrice -= (basePrice * 0.1);

            System.out.println("======= Package Details =======");
            System.out.printf("Internet Package: %s\n", packageName);
            System.out.printf("Base Price: %.2f\n", basePrice);
            System.out.printf("Final Price: %.2f\n\n", finalPrice);
        }
    }
}