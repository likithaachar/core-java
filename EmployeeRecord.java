class EmployeeRecord {
    public static void main(String[] args) {
        // Declaration
        double salary;
        boolean isPermanent;
        String empName;
        char grade;
        int empId;

        // Initialization
        salary = 45000.75;
        isPermanent = true;
        empName = "Shankar";
        grade = 'A';
        empId = 101;
        System.out.println("Salary: " + salary);
        System.out.println("Permanent: " + isPermanent);
        System.out.println("Employee Name: " + empName);
        System.out.println("Grade: " + grade);
        System.out.println("Employee ID: " + empId);

        salary = 52000.50;
        isPermanent = false;
        empName = "Naveen";
        grade = 'B';
        empId = 102;
        System.out.println("Salary: " + salary);
        System.out.println("Permanent: " + isPermanent);
        System.out.println("Employee Name: " + empName);
        System.out.println("Grade: " + grade);
        System.out.println("Employee ID: " + empId);
    }
}