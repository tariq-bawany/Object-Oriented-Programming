package Encapsulation.Task13;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        arrays of objects
        Employee[] employees = new Employee[5];
//        user input for arrays of object
        for(int i =0;i<employees.length;i++){
            employees[i] = new Employee();
            System.out.println("~~~~~~~~~~~~~");
            System.out.printf("Employee Details %d\n",i+1);
            System.out.print("Enter name: ");
            employees[i].setName(sc.nextLine());
            System.out.print("Enter Salary: ");
            employees[i].setSalary(sc.nextDouble());
            System.out.print("Enter Experience: ");
            employees[i].setExperience(sc.nextInt());
//          clears buffer
            sc.nextLine();
        }

//        Displaying all employees with experience >= 5 years
        System.out.println("\nEmployees with experience >= 5 years");
        for(Employee employee:employees){
            if(employee.getExperience()>=5){
                System.out.printf("Name: %s\nSalary: %.2f\nExperience: %d\n",employee.getName(),employee.getSalary(),employee.getExperience());
            }
        }

//        Displaying all Employees with Salary >= 50000
        System.out.println("\nEmployees with Salary >= 50000 ");
        for(Employee employee:employees){
            if(employee.getSalary()>=50000){
                System.out.printf("Name: %s\nSalary: %.2f\nExperience: %d\n",employee.getName(),employee.getSalary(),employee.getExperience());
            }
        }


    }
}
