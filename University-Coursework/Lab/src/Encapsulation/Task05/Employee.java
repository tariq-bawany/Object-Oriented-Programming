package Encapsulation.Task05;

public class Employee {
    private String name;
    private double salary;
    private int yearsOfExperience;

    public void setName(String name){
        this.name =name;
    }
    public void setSalary(double salary){
        if(salary>=0){
        this.salary =salary;

        }else{
            System.out.println("Invalid Salary Input.");
        }
    }
    public void setYearsOfExperience(int yearsOfExperience){
        if(salary>=0){
        this.yearsOfExperience =yearsOfExperience;

        }else{
            System.out.println("Invalid Year Of Experience Input.");
        }
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public double calculateBonus(){
        if (yearsOfExperience>=5){
            return (salary*0.2);
        }else if(yearsOfExperience>=0){
            return (salary*0.1);
        }else {
            return 0;
        }
    }
}
