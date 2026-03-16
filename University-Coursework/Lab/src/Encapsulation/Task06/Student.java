package Encapsulation.Task06;

public class Student {
    private String name;
    private double marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        if(marks>=0 && marks<=100){
            this.marks = marks;
        }
    }

    public double getMarks() {
        return marks;
    }
    public Boolean isPass(){
        return this.marks >= 50;
    }
}
