class HairDryer {

    static boolean isHairDryerOnOrOffButton = false;
    static int maxHeatLevel = 5;
    static int currentHeatLevel = 2;

    static void checkHairDryerIsOnOrOff(){
        if(isHairDryerOnOrOffButton == false)
            System.out.println("checking : HairDryer is Off");
        else
            System.out.println("checking : HairDryer is On");
    }

    static void turnOnHairDryer(){
        System.out.println("Turning On the HairDryer");
        isHairDryerOnOrOffButton = true;
    }

    static int getCurrentHeatLevel(){
        return currentHeatLevel;
    }
}