package Advanced_Java_Fundamentals.MediCore_Hospital_Patient_System;

public class Main {
    static void main(String[] args) {
        System.out.println("--- MediCore System Live ---");

        // Part 3: Data Migrator
        var patient1 = new PatientRecord("john doe, 1500.0");
        patient1.admit();

        // Part 4: Billing
        patient1.processBilling(200.0);
        patient1.processBilling(56000, "PKR");
        patient1.processBilling("CHG:300");

        // Part 2: ID Validation
        patient1.setPatientID("MC-4821-2026");  // valid
        patient1.setPatientID("BAD-ID");         // sets to PENDING

        // Part 5: Summary & Compare
        System.out.println(patient1.getPatientSummary());

        var patient2 = new PatientRecord("Jane Smith", 9000.0);
        // patient2 never admitted — stays DISCHARGED
        var higherBill = PatientRecord.comparePatients(patient1, patient2);
        System.out.println("Priority Patient: " + higherBill.getPatientSummary());

    }
}
