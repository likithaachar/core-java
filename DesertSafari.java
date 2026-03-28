class DesertSafari {

    public static void main(String[] args) {

        // 1st --> Declaration
        String placeName;
        int numberOfPeople;
        double budget;
        char tripGrade;
        boolean isConfirmed;

        // 2nd --> Initialization
        placeName = "Manali";
        numberOfPeople = 5;
        budget = 25000.75;
        tripGrade = 'A';
        isConfirmed = true;

        // Print variables
        System.out.println("Place Name: " + placeName);
        System.out.println("Number of People: " + numberOfPeople);
        System.out.println("Budget: " + budget);
        System.out.println("Trip Grade: " + tripGrade);
        System.out.println("Confirmed: " + isConfirmed);

        // Reassign the variables
        placeName = "Ooty";
        numberOfPeople = 3;
        budget = 18000.50;
        tripGrade = 'B';
        isConfirmed = false;

        // Print again
        System.out.println("---- After Changing Values ----");

        System.out.println("Place Name: " + placeName);
        System.out.println("Number of People: " + numberOfPeople);
        System.out.println("Budget: " + budget);
        System.out.println("Trip Grade: " + tripGrade);
        System.out.println("Confirmed: " + isConfirmed);
    }
}