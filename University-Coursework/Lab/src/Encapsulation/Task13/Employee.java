package Encapsulation.Task13;

public class Employee {
    private String name;
    private double salary;
    private int experience;

    public void setExperience(int experience) {
        if(experience>=0)this.experience = experience;
        else System.out.println("Invalid Experience Input");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if(salary>=0)this.salary = salary;
        else System.out.println("Invalid Salary Input");
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public double getSalary() {
        return salary;
    }
}
