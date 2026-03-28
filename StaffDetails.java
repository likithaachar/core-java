class StaffDetails{
    public static void main(String[] args){
        // Declaration
        boolean isPermanent;
        char grade;
        double salary;
        int empId;
        String empName;
		
        // Initialization
        isPermanent = true;
        grade = 'A';
        salary = 55000.75;
        empId = 104;
        empName = "Liki";
        System.out.println("Permanent:"+isPermanent);
        System.out.println("Grade:"+grade);
        System.out.println("Salary:"+salary);
        System.out.println("Employee ID:"+empId);
        System.out.println("Employee Name:"+empName);
        isPermanent = false;
        grade = 'B';
        salary = 52000.50;
        empId = 102;
        empName = "Likitha";
        System.out.println("Permanent:"+isPermanent);
        System.out.println("Grade:"+grade);
        System.out.println("Salary:"+salary);
        System.out.println("Employee ID:"+empId);
        System.out.println("Employee Name:"+empName);
		
    }
}