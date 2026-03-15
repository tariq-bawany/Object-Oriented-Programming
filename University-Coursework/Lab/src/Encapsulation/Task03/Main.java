package Encapsulation.Task03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for(int i =0; i<students.length;i++){
            students[i] = new Student();
            System.out.print("~~~~~~~~~~\n");
            System.out.printf("Student %d\n",i+1);
            System.out.print("Enter Student name: ");
            students[i].setName(sc.nextLine());

            System.out.print("Enter Student marks:");
//            double marks = sc.nextDouble();
            students[i].setMarks(sc.nextDouble());
            sc.nextLine();
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("~~~~~~~~~");
            System.out.printf("Name : %s\nMarks : %.2f\n",students[i].getName(),students[i].getMarks());

        }

        System.out.printf("\nTotal no of Students Passed : %d",Student.studentsPassed);
    }
}
