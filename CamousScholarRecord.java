class CampusScholarRecord{
    public static void main(String[] args){
        // Declaration
        double attendancePercentage;
        String studentName;
        char gradeSection;
        boolean feePaid;
        int rollNumber;
        // Initialization
        attendancePercentage = 88.5;
        studentName = "Likitha";
        gradeSection = 'A';
        feePaid = true;
        rollNumber = 101;
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Attendance Percentage: " + attendancePercentage);
        System.out.println("Grade Section: " + gradeSection);
        System.out.println("Fee Paid: " + feePaid);
        attendancePercentage = 76.2;
        studentName = "Likii";
        gradeSection = 'B';
        feePaid = false;
        rollNumber = 205;
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Attendance Percentage: " + attendancePercentage);
        System.out.println("Grade Section: " + gradeSection);
        System.out.println("Fee Paid: " + feePaid);
    }
}