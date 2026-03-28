class SkyVoyageTracker {
    public static void main(String[] args) {
        // Declaration
        char climateCode;
        int crewStrength;
        boolean launchApproved;
        String planetBase;
        double fuelCapacity;
        // Initialization
        climateCode = 'X';
        crewStrength = 8;
        launchApproved = true;
        planetBase = "Mars Colony";
        fuelCapacity = 98765.45;
        System.out.println("Planet Base: " + planetBase);
        System.out.println("Crew Strength: " + crewStrength);
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Climate Code: " + climateCode);
        System.out.println("Launch Approved: " + launchApproved);

        climateCode = 'Z';
        crewStrength = 5;
        launchApproved = false;
        planetBase = "Lunar Station";
        fuelCapacity = 54321.10;
        System.out.println("Planet Base: " + planetBase);
        System.out.println("Crew Strength: " + crewStrength);
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Climate Code: " + climateCode);
        System.out.println("Launch Approved: " + launchApproved);
    }
}