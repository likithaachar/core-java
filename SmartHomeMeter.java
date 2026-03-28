class SmartHomeMeter {
    public static void main(String[] args){
        // Declaration
        double monthlyBill;
        int unitsConsumed;
        boolean powerCut;
        String ownerName;
        char connectionType;
        // Initialization
        monthlyBill = 2450.75;
        unitsConsumed = 320;
        powerCut = false;
        ownerName = "Ananya";
        connectionType = 'D';
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Monthly Bill: " + monthlyBill);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Power Cut Status: " + powerCut);

        monthlyBill = 1980.40;
        unitsConsumed = 275;
        powerCut = true;
        ownerName = "Rahul";
        connectionType = 'C';
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Monthly Bill: " + monthlyBill);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Power Cut Status: " + powerCut);
    }
}