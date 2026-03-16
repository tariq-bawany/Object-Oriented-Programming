package Encapsulation.Task05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[3];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.println("~~~~~~~~~~~");
            System.out.printf("Employee %d\n",i+1);
            System.out.print("Enter Employee Name: ");
            employees[i].setName(sc.nextLine());
            System.out.print("Enter Employee Salary: ");
            employees[i].setSalary(sc.nextDouble());
            System.out.print("Enter Employee Year Of Experience: ");
            employees[i].setYearsOfExperience(sc.nextInt());
            sc.nextLine();
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println("~~~~~~~~~~~~");
            System.out.printf("Employee %d\n",i+1);
            System.out.printf("Name: %s\n",employees[i].getName());
            System.out.printf("Bonus: %.2f\n",employees[i].calculateBonus());
//            System.out.printf("Salary: %.2f\n",employees[i].getSalary());
//            System.out.printf("Year of Experience: %d\n",employees[i].getYearsOfExperience());
        }
    }
}
