class Television {
    static boolean isTvOnOrOffButton = false;
    static int maxVolume = 100;
    static int currentVolume = 20;

    static void checkTvIsOnOrOff(){
        if(isTvOnOrOffButton == false)
            System.out.println("checking : TV is Off");
        else
            System.out.println("checking : TV is On");
    }
    static void turnOnTV(){
        System.out.println("Turning On the TV");
        isTvOnOrOffButton = true;
    }
    static int getCurrentVolume(){
        return currentVolume;
    }
}