package Assignment_02.Question_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Airline airline = new Airline();
        airline.addFlight(new Flight("101", "Karachi", "Dubai", 19));
        while (true) {
            System.out.println("--- Airline Management System ---");
            System.out.println("1. List all flights");
            System.out.println("2. Register a customer on a flight");
            System.out.println("3. Exit");
            System.out.print("Choose an option :");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input! please enter a number");
                continue;
            }
            switch (choice) {
                case 1 -> airline.listFlights();
                case 2 -> {
                    System.out.print("Enter flight Number:");
                    String flightNumber = sc.nextLine();
                    airline.registerCustomer(flightNumber);
                }
                case 3 -> {
                    System.out.println("Exiting the program!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Choice! Please choose 1 - 3");
            }

        }
    }
}
