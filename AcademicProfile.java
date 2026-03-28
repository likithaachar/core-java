class AcademicProfile{
    public static void main(String[] args){
        // Declaration
        int studentId;
        boolean scholarshipStatus;
        char performanceGrade;
        String courseName;
        double examScore;
        // Initialization
        studentId = 5012;
        scholarshipStatus = true;
        performanceGrade = 'A';
        courseName = "Computer Science";
        examScore = 89.75;
        System.out.println("Student ID: " + studentId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Exam Score: " + examScore);
        System.out.println("Performance Grade: " + performanceGrade);
        System.out.println("Scholarship Status: " + scholarshipStatus);
        studentId = 7845;
        scholarshipStatus = false;
        performanceGrade = 'B';
        courseName = "Data Analytics";
        examScore = 74.60;
        System.out.println("Student ID: " + studentId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Exam Score: " + examScore);
        System.out.println("Performance Grade: " + performanceGrade);
        System.out.println("Scholarship Status: " + scholarshipStatus);
    }
}