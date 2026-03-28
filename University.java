class University {

    static void startUniversity() {
        System.out.println("University Started");
    }

    static void noOfStudents(int s1, int s2) {
        int total = s1 + s2;
        System.out.println("Total Students: " + total);
    }

    static void noOfTeachers(int t1, int t2) {
        int total = t1 + t2;
        System.out.println("Total Teachers: " + total);
    }

    static int totalFees(int f1, int f2) {
        int total = f1 + f2;
        System.out.println("Total Fees: " + total);
        return total;
    }
}