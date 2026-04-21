package Encapsulation_Practice.Student_Grade_Classifier;

public class Main {
    static void main(String[] args) {
    Student[] students = new Student[5];
    students[0] = new Student("Muhammad Tariq",100);
    students[1] = new Student("Mujtaba",98);
    students[2] = new Student("Ali",55);
    students[3] = new Student("Kumar",65);
    students[4] = new Student("kehkash",30);
//    students[0].getResult();();
//    students[1].getResult();();
//    students[4].getResult();();
        for(Student student:students){
            if(student.isPassed())student.getResult();
        }
    }
}
