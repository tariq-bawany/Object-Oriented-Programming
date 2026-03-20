package Encapsulation.Task10;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.println("~~~~~~~~~~~~~~~");
            System.out.printf("Employee %d Details\n",i+1);
            System.out.print("Enter your Name:");
            employees[i].setName(sc.nextLine());
            System.out.print("Enter your Salary:");
            employees[i].setSalary(sc.nextDouble());
            System.out.print("Enter your Work Experience:");
            employees[i].setExperience(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("\n~~~~~~~~~Employees with Work Experience of >= 3 years~~~~~~~~~");
        for(Employee e:employees){
            if(e.getExperience()>=3){
                System.out.printf("Name: %s\nSalary: %.2f\nExperience: %d\n",e.getName(),e.getSalary(),e.getExperience());
            }
        }
        System.out.println("\n~~~~~~~~~Employees with Bonus >= 5000~~~~~~~~~");
        for(Employee e:employees){
            if(e.calculateBonus()>=5000){
                System.out.printf("Name: %s\nSalary: %.2f\nExperience: %d\nBonus: %.2f\n",e.getName(),e.getSalary(),e.getExperience(),e.calculateBonus());
            }
        }
    }
}
