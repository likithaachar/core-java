class Tractor {
    static void addBrand() {
        System.out.println("Tractor Brand: Mahindra");
    }
    static int getFuelCapacity() {
        int capacity = 60;
        System.out.println("Fuel Capacity: " + capacity + " Liters");
        return capacity;
    }
    static void addLoan(int loan1, int loan2, String type) {
        int total = loan1 + loan2;
        System.out.println("Total Loan: " + total);
        System.out.println("Loan Type: " + type);
    }
    static int addTotalCost(int price, int tax) {
        int total = price + tax;
        System.out.println("Total Tractor Cost: " + total);
        return total;
    }
}