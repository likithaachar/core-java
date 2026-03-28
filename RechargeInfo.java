class RechargeInfo{
    public static void main(String[] args) {
        // Declaration
        boolean dataActive;
        double rechargeAmount;
        String userName;
        int validityDays;
        char networkType;
        // Initialization
        dataActive = true;
        rechargeAmount = 299.99;
        userName = "Likitha";
        validityDays = 28;
        networkType = '4';  
        System.out.println("User Name: " + userName);
        System.out.println("Recharge Amount: " + rechargeAmount);
        System.out.println("Validity (Days): " + validityDays);
        System.out.println("Network Type: " + networkType + "G");
        System.out.println("Data Active: " + dataActive);
        dataActive = false;
        rechargeAmount = 199.00;
        userName = "Ramya";
        validityDays = 14;
        networkType = '5';
        System.out.println("User Name: " + userName);
        System.out.println("Recharge Amount: " + rechargeAmount);
        System.out.println("Validity (Days): " + validityDays);
        System.out.println("Network Type: " + networkType + "G");
        System.out.println("Data Active: " + dataActive);
		
    }
}