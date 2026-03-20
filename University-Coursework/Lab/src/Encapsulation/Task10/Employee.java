package Encapsulation.Task10;

public class Employee {
    private String name;
    private double salary;
    private int experience;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;

        } else {
            System.out.println("Invalid Salary Input");
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience >= 0) {
            this.experience = experience;

        } else {
            System.out.println("Invalid Experience Input");
        }
    }

    public double calculateBonus(){
        if(experience>=5) return salary*0.2;
        else if(experience>=0) return salary*0.1;
        else return 0;
    }
}
