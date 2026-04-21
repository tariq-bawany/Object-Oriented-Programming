package Advanced_Java_Fundamentals.MediCore_Hospital_Patient_System;

import java.util.Random;

public class PatientRecord {

    // --------------------------------------------------
    // PART 1: PRIVATE FIELDS
    // --------------------------------------------------
    private String patientID;
    private String patientName;
    private double billAmount;
    private String admissionStatus;

    public void admit()     { this.admissionStatus = "ADMITTED"; }
    public void discharge() { this.admissionStatus = "DISCHARGED"; }

    public void addCharge(double charge) {
        if (charge > 0) this.billAmount += charge;
    }

    public double getBillAmount()       { return billAmount; }
    public String getAdmissionStatus()  { return admissionStatus; }
    // --------------------------------------------------


    // --------------------------------------------------
    // PART 2: SMART IDENTITY
    // --------------------------------------------------
    public void setPatientID(String id) {
        if (id != null && id.startsWith("MC-") && id.endsWith("-2026") && id.length() == 12) {
            this.patientID = id;
        } else {
            this.patientID = "PENDING";
        }
    }

    public void setPatientName(String name) {
        if (name == null || name.isEmpty()) {
            this.patientName = "Unknown";
            return;
        }
        String[] words = name.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty()) {
                sb.append(Character.toUpperCase(w.charAt(0)))
                        .append(w.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        this.patientName = sb.toString().trim();
    }
    // --------------------------------------------------


    // --------------------------------------------------
    // PART 3: CONSTRUCTOR CHAINING
    // --------------------------------------------------

    // Main constructor
    public PatientRecord(String patientName, double initialBill) {
        setPatientName(patientName);
        this.billAmount = Math.max(0, initialBill);
        this.admissionStatus = "DISCHARGED";
        this.patientID = generateRandomID();
    }

    // Basic + Data Migrator combined
    public PatientRecord(String inputData) {
        this(inputData.contains(",")
                        ? inputData.split(",")[0]
                        : inputData,
                inputData.contains(",")
                        ? Double.parseDouble(inputData.split(",")[1].trim())
                        : 0.0);
    }
    // --------------------------------------------------


    // --------------------------------------------------
    // PART 4: BILLING OVERLOADS
    // --------------------------------------------------
    public void processBilling(double amount) {
        if (amount > 0) {
            this.billAmount += amount;
            System.out.println("Charge added: $" + String.format("%.2f", amount) + " USD");
        }
    }

    public void processBilling(double amount, String currencyCode) {
        double converted = amount;
        if ("PKR".equalsIgnoreCase(currencyCode))      converted = amount / 280;
        else if ("EUR".equalsIgnoreCase(currencyCode)) converted = amount * 1.1;
        processBilling(converted);
    }

    public void processBilling(String billingEntry) {
        String[] parts = billingEntry.split(":");
        if (parts.length == 2 && "CHG".equals(parts[0])) {
            processBilling(Double.parseDouble(parts[1]));
        }
    }
    // --------------------------------------------------


    // --------------------------------------------------
    // PART 5: AUDIT & ANALYTICS
    // --------------------------------------------------
    public String getPatientSummary() {
        String[] names = patientName.split(" ");
        StringBuilder masked = new StringBuilder();
        for (String n : names) {
            if (n.length() > 1) {
                masked.append(n.charAt(0))
                        .append("*".repeat(n.length() - 1))
                        .append(" ");
            } else {
                masked.append(n).append(" ");
            }
        }
        return "ID: " + patientID
                + " | Patient: " + masked.toString().trim()
                + " | Bill: $" + String.format("%.2f", billAmount)
                + " | Status: " + admissionStatus;
    }

    public static PatientRecord comparePatients(PatientRecord a, PatientRecord b) {
        boolean aAdmitted = "ADMITTED".equals(a.admissionStatus);
        boolean bAdmitted = "ADMITTED".equals(b.admissionStatus);

        if (aAdmitted && bAdmitted) return (a.billAmount >= b.billAmount) ? a : b;
        if (aAdmitted)  return a;
        if (bAdmitted)  return b;
        return null;
    }

    private String generateRandomID() {
        return "MC-" + (new Random().nextInt(9000) + 1000) + "-2026";
    }
    // --------------------------------------------------
}