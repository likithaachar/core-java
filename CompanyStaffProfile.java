class CompanyStaffProfile{
    public static void main(String[] args) {
        // Declaration
        char grade;
        int empId;
        String empName;
        double salary;
        boolean isPermanent;
        // Initialization
        grade = 'A';
        empId = 201;
        empName = "Arjun";
        salary = 60000.80;
        isPermanent = true;
        System.out.println("Grade: " + grade);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Permanent: " + isPermanent);
        grade = 'B';
        empId = 202;
        empName = "Meera";
        salary = 75000.45;
        isPermanent = false;
        System.out.println("Grade: " + grade);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Permanent: " + isPermanent);
    }
}