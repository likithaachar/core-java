class Data{
    public static void main(String[] args) {
        System.out.println("POWERSTATION");
        PowerStation.startStation();
        PowerStation.generatePower(200, 300, "Thermal");
        PowerStation.getStationCapacity();
        PowerStation.addCost(50000.50, 2500.75);
        System.out.println("*******************************");
}