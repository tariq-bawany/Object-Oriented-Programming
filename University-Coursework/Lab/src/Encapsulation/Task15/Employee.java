package Encapsulation.Task15;

public class Employee {
    private String name;
    private double salary;
    private int experience;

    public Employee(String name, double salary, int experience) {
        this.name = name;
        if(salary>=0)this.salary = salary;
        if(experience>=0)this.experience = experience;
    }

    public double calculateBonus() {
        if (experience >= 5) return salary * 0.2;
        else return salary * 0.1;
    }

    public int getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
