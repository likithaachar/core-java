class PowerStation {
    static void startStation() {
        System.out.println("National Power Station");
        System.out.println("Power generation system started...");
    }
    static void generatePower(int unit1, int unit2, String type) {
        System.out.println("Generating electricity units...");
        int total = unit1 + unit2;
        System.out.println("Total power generated:");
        System.out.println(total);
        System.out.println(type);
    }
    static double getStationCapacity(){
        System.out.println("Checking station capacity...");
        double capacity = 2500.50;
        System.out.println("Capacity found in MW");
        return capacity;
    }
    static double addCost(double price, double tax) {
        double total = price + tax;
        System.out.println("Total cost of power production:");
        System.out.println(total);
        return total;
    }
}