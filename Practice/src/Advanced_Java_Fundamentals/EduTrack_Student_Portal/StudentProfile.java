package Advanced_Java_Fundamentals.EduTrack_Student_Portal;

import java.util.Random;

public class StudentProfile {
    private String studentID;
    private String studentName;
    private double cgpa;
    private String enrollmentStatus;


    //    ------------- Part 1: Basic Status Updates -------------


    // Updates the CGPA but only if the number is valid (between 0.0 and 4.0)
    public void updateCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else System.out.println("GPA Input out of Range.");
    }

    // Changes the student status to ENROLLED
    public void enroll() {
        this.enrollmentStatus = "ENROLLED";
        System.out.printf("%s is successfully Enrolled.\n",this.studentName);
    }

    // Changes the student status to SUSPENDED
    public void suspend() {
        this.enrollmentStatus = "SUSPENDED";
        System.out.println("Sorry, this student is suspended.");
    }

    //    ------------- Part 2: Formatting & Validation -------------

    // Cleans up the name so every word starts with a Capital letter (e.g., "john doe" becomes "John Doe")
    public void setStudentName(String studentName) {
        // Take the FIRST character and make it UPPERCASE
        // Take the REST of the word (index 1 to end) and make it lowercase
        // Append a space at the end to separate from the next word
        String[] splits = studentName.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String s : splits) {
            sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1).toLowerCase()).append(" ");
        }
        // 3. Convert the builder back to a String and trim the final trailing space
        this.studentName = sb.toString().trim();
//        System.out.println(this.studentName);
    }

    // Validates the ID format: must start with STU-, end with -2026, and be 13 characters long
    public void setStudentID(String studentID) {
        if (studentID != null && studentID.startsWith("STU-") && studentID.endsWith("-2026") && studentID.length() == 13) {
            this.studentID = studentID;
        } else this.studentID = "UNASSIGNED";
    }

    //    ------------- Part 3: Constructors (Creating the Student) -------------

    // Constructor that takes a name (and handles cases where the name string includes a CGPA after a comma)
    public StudentProfile(String studentName) {
        if (studentName.contains(",")) {
            String[] splits = studentName.trim().split(",");
            studentName = splits[0].trim();
            double cgpa = Double.parseDouble(splits[1].trim());
            updateCgpa(cgpa);
        } else {
            updateCgpa(0);
        }
        setStudentName(studentName);
        setStudentID(generateID());
    }

    // Overloaded constructor for when you have both the name and the CGPA ready
    public StudentProfile(String studentName, double initialCGPA) {
        this(studentName);
        updateCgpa(initialCGPA);
    }

    // Helper method to create a random ID like STU-5521-2026
    private String generateID() {
        return ("STU-" + (new Random().nextInt(1000, 10000)) + "-2026");
    }

    //    ------------- Part 4: Overloaded Payment Methods -------------

    // Basic payment processing in USD
    public void processFeePayment(double amount){
        if(amount>0){
            System.out.printf("Fee Payment confirmed: $%.2f USD",amount);
        }else System.out.println("Invalid Fee Amount.");
    }

    // Payment processing with currency conversion (converts PKR or EUR to USD)
    public void processFeePayment(double amount,String currencyCode){
        if(currencyCode.equalsIgnoreCase("PKR")){
            amount = amount/280;
        } else if(currencyCode.equalsIgnoreCase("EUR")){
            amount = amount*1.1;
        }
        processFeePayment(amount);
    }

    // Payment processing via a voucher string (e.g., "FEE:500")
    public void processFeePayment(String voucherEntry){
        if(voucherEntry.contains(":")){
            String[] splits = voucherEntry.trim().split(":");
            if(splits[0].trim().equalsIgnoreCase("FEE")){

                // Takes the text from the split (e.g., "3.5") and converts it into a usable decimal number
                double amount  = Double.parseDouble(splits[1].trim());
                processFeePayment(amount);
            }
        } else System.out.println("Invalid Voucher.");
    }

    //    ------------- Part 5: Summary Reporting -------------

    public String getProfileSummary(){
        // 1. Break the name into individual words
        String[] splits = studentName.split("\\s+");

        // 2. Create a StringBuilder to build a "masked" version of the name (e.g., J*** D**)
        StringBuilder sb =new StringBuilder();
        for(String s:splits){
            if(!s.isEmpty()){
                // Append the very first letter of the name
                // Append asterisks (*) for the remaining length of that specific word
                // ".repeat(length - 1)" ensures the total character count stays the same
                sb.append(s.charAt(0)).append("*".repeat(s.length()-1)).append(" ");
            }
        }
        // The masked name is stored here (though the return statement below currently uses the original name)
        String masked = sb.toString().trim();

        return ("\nName: "+masked+" | ID: "+this.studentID+" | CGPA: "+this.cgpa+" | Admission Status: "+this.enrollmentStatus);
    }

    //    ------------- Part 6 -------------
    static StudentProfile compareStudents(StudentProfile a , StudentProfile b){
        boolean isAEnrolled = "ENROLLED".equalsIgnoreCase(a.enrollmentStatus);
        boolean isBEnrolled = "ENROLLED".equalsIgnoreCase(b.enrollmentStatus);

        if(isAEnrolled && isBEnrolled){
            if(a.cgpa>b.cgpa)return a;
            else return b;
        }
        if(isAEnrolled)return a;
        if(isBEnrolled)return b;
        return null;
    }

}
