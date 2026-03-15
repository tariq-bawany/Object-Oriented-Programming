package Encapsulation.Task03;

public class Student {
    private String name;
    private double marks;
    static int studentsPassed = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
    public int getStudentsPassed() {
        return studentsPassed;
    }

    public void setMarks(double marks) {
        if(marks>=0 && marks<=100){
            if(marks>55){
                studentsPassed++;
            }
        this.marks = marks;

        }else{
            System.out.println("Invalid marks input");
            this.marks = 0;
        }

    }
}
