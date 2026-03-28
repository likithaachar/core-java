class SuperMarket {
    static void openStore() {
        System.out.println("Super Market Opened");
    }
    static void noProducts(int p1, int p2, String type) {
        int total = p1 + p2;
        System.out.println("Total Products: " + total);
        System.out.println("Category: " + type);
    }
    static int addDailyIncome() {
        int income = 50000;
        System.out.println("Daily Income: " + income);
        return income;
    }
    static void workers(int w1, int w2) {
        int total = w1 + w2;
        System.out.println("Total Workers: " + total);
    }
}