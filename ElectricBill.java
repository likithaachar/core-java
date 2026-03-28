class ElectricBill {
    public static void main(String[] args){
        int billNumber; // declaration
        System.out.println("I am printing declaration part of billNumber:");
        billNumber = 1001; // initialization
        System.out.println("I am printing initialization part of billNumber: " + billNumber);
        String customerName; // declaration
        System.out.println("I am printing declaration part of customerName:");
        customerName = "Ravi"; // initialization
        System.out.println("I am printing initialization part of customerName: " + customerName);
        double unitsConsumed; // declaration
        System.out.println("I am printing declaration part of unitsConsumed:");
        unitsConsumed = 250.5; // initialization
        System.out.println("I am printing initialization part of unitsConsumed: " + unitsConsumed);
        double costPerUnit; // declaration
        System.out.println("I am printing declaration part of costPerUnit:");
        costPerUnit = 6.5; // initialization
        System.out.println("I am printing initialization part of costPerUnit: " + costPerUnit);
        double totalAmount; // declaration
        System.out.println("I am printing declaration part of totalAmount:");
        totalAmount = unitsConsumed * costPerUnit; // initialization
        System.out.println("I am printing initialization part of totalAmount: " + totalAmount);
        boolean isPaid; // declaration
        System.out.println("I am printing declaration part of isPaid:");
        isPaid = false; // initialization
        System.out.println("I am printing initialization part of isPaid: " + isPaid);
    }
}