class AutoShowroom{
    public static void main(String[] args) {
        // Declaration
        double vehicleCost;
        boolean availableStatus;
        String vehicleBrand;
        char engineType;
        int manufacturingYear;

        // Initialization
        vehicleCost = 850000.50;
        availableStatus = true;
        vehicleBrand = "Toyota";
        engineType = 'P';
        manufacturingYear = 2022;
        System.out.println("Vehicle Cost: " + vehicleCost);
        System.out.println("Available Status: " + availableStatus);
        System.out.println("Vehicle Brand: " + vehicleBrand);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        vehicleCost = 920000.75;
        availableStatus = false;
        vehicleBrand = "Honda";
        engineType = 'D';
        manufacturingYear = 2023;
        System.out.println("Vehicle Cost: " + vehicleCost);
        System.out.println("Available Status: " + availableStatus);
        System.out.println("Vehicle Brand: " + vehicleBrand);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Manufacturing Year: " + manufacturingYear);
    }
}