class MedicalCenter {
    public static void main(String[] args) {
        // Declaration
        char category;
        boolean isOpen;
        String hospitalName;
        double rating;
        int numberOfDoctors;
		
        // Initialization
        category = 'A';
        isOpen = true;
        hospitalName = "City Care";
        rating = 4.5;
        numberOfDoctors = 45;
        System.out.println("Category:"+category);
        System.out.println("Open:"+isOpen);
        System.out.println("Hospital Name:"+hospitalName);
        System.out.println("Rating:"+rating);
        System.out.println("Number of Doctors:"+numberOfDoctors);
		
        category = 'S';
        isOpen = false;
        hospitalName = "Metro Health";
        rating = 4.8;
        numberOfDoctors = 60;
        System.out.println("Category: " + category);
        System.out.println("Open: " + isOpen);
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Doctors: " + numberOfDoctors);
    }
}