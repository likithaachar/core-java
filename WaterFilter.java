class WaterFilter {

    static void setFilter() {
        System.out.println("Water Filter System Started");
    }

    static void addWater(int w1, int w2, String type) {
        int total = w1 + w2;
        System.out.println("Total Water: " + total);
        System.out.println("Water Type: " + type);
    }

    static double getCapacity() {
        double capacity = 500.50;
        System.out.println("Filter Capacity: " + capacity);
        return capacity;
    }

    static double addPrice(double price, double tax) {
        double total = price + tax;
        System.out.println("Total Price: " + total);
        return total;
    }
}