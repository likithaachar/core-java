class WaterHeater {

    static boolean isWaterHeaterOnOrOffButton = false;
    static int maxTemperature = 90;
    static int currentTemperature = 40;

    static void checkWaterHeaterIsOnOrOff(){
        if(isWaterHeaterOnOrOffButton == false)
            System.out.println("checking : Water Heater is Off");
        else
            System.out.println("checking : Water Heater is On");
    }

    static void turnOnWaterHeater(){
        System.out.println("Turning On the Water Heater");
        isWaterHeaterOnOrOffButton = true;
    }

    static int getCurrentTemperature(){
        return currentTemperature;
    }
}