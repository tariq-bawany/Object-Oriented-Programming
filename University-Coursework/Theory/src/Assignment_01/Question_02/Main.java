package Assignment_01.Question_02;

import java.util.Scanner;


public class Main {
    static final double PI = 3.14159265358979;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double area;
        do {
            System.out.println("======= Area Calculator Program =======");
            System.out.println("1-) Circle");
            System.out.println("2-) Rectangle");
            System.out.println("3-) Triangle");
            System.out.println("4-) Square");
            System.out.println("5-) Parallelogram");
            System.out.println("6-) Trapezoid");
            System.out.println("7-) Exit");
            System.out.print("Enter option (1-7) : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Radius of Circle: ");
                    double radius = sc.nextDouble();
                    area = PI* radius * radius;
                    System.out.printf("Area of Circle = %.2f\n", area);
                }
                case 2 -> {
                    System.out.print("Enter Length of Rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter Width of Rectangle: ");
                    double width = sc.nextDouble();
                    area = length * width;
                    System.out.printf("Area of Rectangle = %.2f\n", area);
                }
                case 3 -> {
                    System.out.print("Enter Base of Triangle: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter Height of Triangle: ");
                    double height = sc.nextDouble();
                    area = 0.5 * base * height;
                    System.out.printf("Area of Triangle = %.2f\n", area);
                }
                case 4 -> {
                    System.out.print("Enter Length of Square: ");
                    double length = sc.nextDouble();
                    area = length * length;
                    System.out.printf("Area of Square = %.2f\n", area);
                }
                case 5 -> {
                    System.out.print("Enter Base of Parallelogram: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter Height of Parallelogram: ");
                    double height = sc.nextDouble();
                    area = base * height;
                    System.out.printf("Area of Parallelogram = %.2f\n", area);
                }
                case 6 -> {
                    System.out.print("Enter Height of Trapezoid: ");
                    double height = sc.nextDouble();
                    System.out.print("Enter 1st base of Trapezoid: ");
                    double base1 = sc.nextDouble();
                    System.out.print("Enter 2nd base of Trapezoid: ");
                    double base2 = sc.nextDouble();
                    area = 0.5 * (base1 + base2) * height;
                    System.out.printf("Area of Trapezoid = %.2f\n", area);
                }
                case 7 -> {
                    System.out.println("GoodBye! Exiting...");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid Choice!");
                }
            }
        } while (choice != 7);
    }
}