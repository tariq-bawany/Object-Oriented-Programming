package Encapsulation.Task01;

public class Student {
    private String name;
    private double marks;

    public double getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name  = name;
    }
    public void setMarks(double marks){
        if(marks >=0 && marks <=100){
        this.marks  = marks;
        }else{
            System.out.println("Invalid marks input.");
        }
    }
}
