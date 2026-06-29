package Assignment_02.Question_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("---Geometric Object Menu---");
            System.out.println("1) Circle");
            System.out.println("2) Rectangle");
            System.out.println("3) Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter radius");
                    double radius = sc.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println(circle.toString());
                    System.out.println("Area=" + circle.getArea());
                    System.out.println("Perimeter=" + circle.getPerimeter());
                }
                case 2 -> {
                    System.out.print("Enter width:");
                    double width = sc.nextDouble();
                    System.out.print("Enter length:");
                    double length = sc.nextDouble();
                    Rectangle rectangle = new Rectangle(width, length);
                    System.out.println(rectangle.toString());
                    System.out.println("Area=" + rectangle.getArea());
                    System.out.println("Perimeter=" + rectangle.getPerimeter());
                }
                case 3 -> {
                    System.out.println("Exiting the program!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! please choose 1-3:");
            }
        }
    }
}
