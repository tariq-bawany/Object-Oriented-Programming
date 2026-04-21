package Encapsulation_Practice.Hospital_Patient_Menu_System;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Patient[] patients = new Patient[4];
        patients[0] = new Patient("Muhammad Tariq",21);
        patients[1] = new Patient("Shamppy",20);
        patients[2] = new Patient("Abdul Rehman",17);
        patients[3] = new Patient("Yaqoob",50);

        int choice;
        Scanner sc =new Scanner(System.in);
        System.out.println("Hospital Patient Menu.\n");
        do{
            System.out.print("1-) Show all Patients\n2-) Admit a Patient\n3) Discharge a Patient\n4-) Search Patient by name\n5-) Exit\nEnter your choice:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
               case 1->{
                  for(Patient patient:patients){
                      patient.displayData();
                  }
                }
                case 2->{
                    System.out.print("Enter Patient name to Admit");
                    String name = sc.nextLine();
                    Patient patientToBeAdmitted =null;
                    for(Patient patient:patients){
                        if(name.equalsIgnoreCase(patient.getName()))patientToBeAdmitted =patient;
                    }
                    if(patientToBeAdmitted!=null){
                        if (!patientToBeAdmitted.getAdmissionStatus())patientToBeAdmitted.admit();
                        else System.out.println("Patient Already admitted");
                    }else System.out.println("Patient not found.");
                }

                case 3->{
                    System.out.print("Enter Patient name to Admit");
                    String name = sc.nextLine();
                    Patient patientToBeAdmitted =null;
                    for(Patient patient:patients){
                        if(name.equalsIgnoreCase(patient.getName()))patientToBeAdmitted =patient;
                    }
                    if(patientToBeAdmitted!=null){
                        if (patientToBeAdmitted.getAdmissionStatus())patientToBeAdmitted.discharge();
                        else System.out.println("Patient not admitted");
                    }else System.out.println("Patient not found.");
                }
                case 4->{
                    System.out.print("Enter Patient name to Admit");
                    String name = sc.nextLine();
                    boolean isPatientFound =false;
                    for(Patient patient:patients){
                        if (name.equalsIgnoreCase(patient.getName())) {
                            patient.displayData();
                            isPatientFound = true;
                            break;
                        }
                    }
                    if(!isPatientFound) System.out.println("Patient not found.");
                }
                case 5->{
                    System.out.println("\nYou had Exited the Program");
                }
                default -> {
                    break;
                }

            }
        }while (choice!=5);

    }
}
