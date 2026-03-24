package Encapsulation.Task15;

public class Main {
    static void main(String[] args) {
        Employee[] employees =new Employee[5];
        employees[0] = new Employee("Muhammad Tariq",10000,5);
        employees[1] = new Employee("Shamoon",3000,7);
        employees[2] = new Employee("Muhammad Ali",50000,3);
        employees[3] = new Employee("Muhammad Abbas",5000,1);
        employees[4] = new Employee("Kabir",5000,2);

        Employee maxBonus = employees[0];
        for(Employee employee:employees){
            if(maxBonus.calculateBonus()<employee.calculateBonus()){
                maxBonus = employee;
            }
        }
        System.out.printf("\nEmployee with Maximum Bonus.\nName: %s\nSalary: %.2f\nExperience: %d\nBonus: %.2f\n",maxBonus.getName(),maxBonus.getSalary(),maxBonus.getExperience(),maxBonus.calculateBonus());
    }
}
