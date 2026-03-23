package Encapsulation.Task11;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Student[] students = new Student[5];
        for(int i=0;i<students.length;i++){
            students[i] =new Student();
            System.out.println("~~~~~~~~~~~~~~");
            System.out.printf("Student Details %d\n",i+1);
            System.out.print("Enter Name: ");
            students[i].setName(sc.nextLine());
            System.out.print("Enter Marks: ");
            students[i].setMarks(sc.nextDouble());
            sc.nextLine();
        }

        System.out.print("\nEnter Student name to update marks:");
        String stdName = sc.nextLine();
        boolean isFound =false;
        for(Student std:students){
            if(std.getName().equalsIgnoreCase(stdName)){
                System.out.print("Enter the new Updated marks:");
                std.setMarks(sc.nextDouble());
                isFound =true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Student not found");
        }else{
            System.out.println("Students Details after updated marks\n");
            for(Student std:students){
                System.out.printf("Name: %s\nMarks: %.2f\n\n",std.getName(),std.getMarks());

            }
        }
    }
}
