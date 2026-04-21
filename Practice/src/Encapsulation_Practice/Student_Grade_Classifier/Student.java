package Encapsulation_Practice.Student_Grade_Classifier;

public class Student {
    private String name;
    private double marks;

    public Student(String name,double marks){
        setMarks(marks);
        setName(name);
    }
    public Student(){}
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        if(marks>=0 && marks<=100){
        this.marks = marks;
        }else System.out.println("Marks out or range (0-100).");
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public char getGrade(){
        if(marks>=85)return 'A';
        else if(marks>=70)return 'B';
        else if(marks>=55)return 'C';
        else if(marks>=40)return 'D';
        else return 'F';
    }
    public boolean isPassed(){
        if(marks>=40)return true;
        else return false;
    }

    public void getResult(){
        System.out.printf("\nName: %s\nMarks: %.2f\nGrade: %c\n",name,marks,getGrade());
//        return ;
    }
}
