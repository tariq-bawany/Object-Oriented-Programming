package Encapsulation.Task06;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("~~~~~~~~~~~~~");
            System.out.printf("Student %d\n",i+1);
            System.out.print("Enter your Name: ");
            students[i].setName(sc.nextLine());
            System.out.print("Enter your Marks: ");
            students[i].setMarks(sc.nextInt());
            sc.nextLine();
        }
        Student topStudent  = students[0];
        for (Student student:students){
            if(student.getMarks()>topStudent.getMarks()){
                topStudent = student;
            }
        }

        System.out.printf("\nTop Student\nName: %s\nMarks: %.2f\n",topStudent.getName(),topStudent.getMarks());
    }
}
