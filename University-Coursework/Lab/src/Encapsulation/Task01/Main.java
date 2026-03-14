package Encapsulation.Task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        student.setName(sc.nextLine());

        System.out.print("Enter your marks: ");
        student.setMarks(sc.nextDouble());

        System.out.printf("%s scores %.2f marks",student.getName(),student.getMarks());
    }
}
