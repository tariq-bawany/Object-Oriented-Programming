package Advanced_Java_Fundamentals.EduTrack_Student_Portal;

import java.util.Random;

public class StudentProfile {
    private String studentID;
    private String studentName;
    private double cgpa;
    private String enrollmentStatus;


    //    ------------- Part 1 -------------
    public void updateCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else System.out.println("GPA Input out of Range.");
    }

    public void enroll() {
        this.enrollmentStatus = "ENROLLED";
        System.out.printf("%s is successfully Enrolled.\n",this.studentName);
    }

    public void suspend() {
        this.enrollmentStatus = "SUSPENDED";
        System.out.println("Sorry, this student is suspended.");
    }

    //    ------------- Part 2 -------------
    public void setStudentName(String studentName) {
        String[] splits = studentName.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String s : splits) {
            sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1).toLowerCase()).append(" ");
        }
        this.studentName = sb.toString().trim();
//        System.out.println(this.studentName);
    }

    public void setStudentID(String studentID) {
        if (studentID != null && studentID.startsWith("STU-") && studentID.endsWith("-2026") && studentID.length() == 13) {
            this.studentID = studentID;
        } else this.studentID = "UNASSIGNED";
    }

    //    ------------- Part 3 -------------
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

    public StudentProfile(String studentName, double initialCGPA) {
        this(studentName);
        updateCgpa(initialCGPA);
    }

    private String generateID() {
        return ("STU-" + (new Random().nextInt(1000, 10000)) + "-2026");
    }

    //    ------------- Part 4 -------------

    public void processFeePayment(double amount){
        if(amount>0){
            System.out.printf("Fee Payment confirmed: $%.2f USD",amount);
        }else System.out.println("Invalid Fee Amount.");
    }

    public void processFeePayment(double amount,String currencyCode){
        if(currencyCode.equalsIgnoreCase("PKR")){
            amount = amount/280;
        } else if(currencyCode.equalsIgnoreCase("EUR")){
            amount = amount*1.1;
        }
        processFeePayment(amount);
    }
    public void processFeePayment(String voucherEntry){
        if(voucherEntry.contains(":")){
            String[] splits = voucherEntry.trim().split(":");
            if(splits[0].trim().equalsIgnoreCase("FEE")){
                double amount  = Double.parseDouble(splits[1].trim());
                processFeePayment(amount);
            }
        } else System.out.println("Invalid Voucher.");
    }

    //    ------------- Part 5 -------------
    public String getProfileSummary(){
        String[] splits = studentName.split("\\s+");
        StringBuilder sb =new StringBuilder();
        for(String s:splits){
            if(!s.isEmpty()){
                sb.append(s.charAt(0)).append("*".repeat(s.length()-1)).append(" ");
            }
        }
        String masked = sb.toString().trim();

        return ("\nName: "+this.studentName+" | ID: "+this.studentID+" | CGPA: "+this.cgpa+" | Admission Status: "+this.enrollmentStatus);
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
