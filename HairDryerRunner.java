class HairDryerRunner{

    public static void main(String[] args){

        //check hairdryer is on or off
        HairDryer.checkHairDryerIsOnOrOff();

        //to turn on hairdryer
        HairDryer.turnOnHairDryer();

        //check hairdryer is on or off
        HairDryer.checkHairDryerIsOnOrOff();

        //need to display current heat level
        int currentHeatLevel = HairDryer.getCurrentHeatLevel();
        System.out.println("Current Heat Level : " + currentHeatLevel);
    }
}