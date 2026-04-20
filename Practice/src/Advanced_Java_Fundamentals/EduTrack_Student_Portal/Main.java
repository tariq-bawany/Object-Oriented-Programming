package Advanced_Java_Fundamentals.EduTrack_Student_Portal;

public class Main {
    static void main(String[] args) {
        StudentProfile[] studentProfiles = new StudentProfile[5];
    studentProfiles[0] = new StudentProfile("muhammad tARIQ",3.5);
    studentProfiles[1] = new StudentProfile("Shammpy , 3.5");
    studentProfiles[2] = new StudentProfile("Muhammad Ali",2.5);
    studentProfiles[3] = new StudentProfile("My Name is khAN");
    studentProfiles[4] = new StudentProfile("YAQOOB KHAN",1.5);

    studentProfiles[0].enroll();
    studentProfiles[3].enroll();
    StudentProfile highest = StudentProfile.compareStudents(studentProfiles[0],studentProfiles[3]);
        if(highest!=null) System.out.println(highest.getProfileSummary());
        else System.out.println("Both account are suspended");
    }
}
