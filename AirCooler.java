class AirCooler {

    static boolean isAirCoolerOnOrOffButton = false;
    static int maxSpeed = 5;
    static int currentSpeed = 2;

    static void checkAirCoolerIsOnOrOff(){
        if(isAirCoolerOnOrOffButton == false)
            System.out.println("checking : AirCooler is Off");
        else
            System.out.println("checking : AirCooler is On");
    }

    static void turnOnAirCooler(){
        System.out.println("Turning On the AirCooler");
        isAirCoolerOnOrOffButton = true;
    }

    static int getCurrentSpeed(){
        return currentSpeed;
    }
}
   