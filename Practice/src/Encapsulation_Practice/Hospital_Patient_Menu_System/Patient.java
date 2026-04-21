package Encapsulation_Practice.Hospital_Patient_Menu_System;

public class Patient {
    private String name;
    private int age;
    private boolean isAdmitted = false;

    public Patient(String name,int age){
        setName(name);
        setAge(age);
    }
    public Patient(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>0)this.age = age;
        else System.out.println("Invalid age Input.");
    }

    public void admit() {
        System.out.println("Patient Admitted.");
        isAdmitted = true;
    }
    public void discharge(){
        System.out.println("Patient Discharged.");
        isAdmitted = false;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public boolean getAdmissionStatus(){
        return  isAdmitted;
    }
    public void displayData(){
        String admissionStatus;
        if(isAdmitted)admissionStatus = "Admitted";
        else admissionStatus = "Not Admitted";
        System.out.printf("\nPatient Name:%s\nAge: %d\nAdmission Status: %s\n\n",getName(),getAge(),admissionStatus);
    }

}
