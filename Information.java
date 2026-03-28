class Information {
    public static void main(String[] args) {
        System.out.println("________ MANGO TREE ________");
        MangoTreeDetails.treeType();
        MangoTreeDetails.treeHeight("40","15");
        MangoTreeDetails.noOfMangoes(25,35);
        MangoTreeDetails.priceOfMango();
        System.out.println("*******************************");

        System.out.println("________ TRACTOR DETAILS ________");
        Tractor.addBrand();
        Tractor.getFuelCapacity();
        Tractor.addLoan(50000,70000,"bank");
        Tractor.addTotalCost(800000,50000);
        System.out.println("*******************************");

        System.out.println("________ SUPER MARKET1 ________");
        SuperMarket1.openStore();
        SuperMarket1.noProducts(150,300,"vegetables");
        SuperMarket1.addDailyIncome();
        SuperMarket1.workers(20,15);
        System.out.println("*******************************");

        System.out.println("________ WATER FILTER ________");
        WaterFilter.setFilter();
        WaterFilter.addWater(100,80,"drinking");
        WaterFilter.getCapacity();
        WaterFilter.addPrice(1500.50,200.75);
        System.out.println("*******************************");

        System.out.println("________ UNIVERSITY ________");
        University.startUniversity();
        University.noOfStudents(2000,1500);
        University.noOfTeachers(120,80);
        University.totalFees(5000000,2000000);
    }
}