class Clock {
    static boolean isClockOnOrOffButton = false;
    static int maxTime = 24;
    static int currentTime = 10;

    static void checkClockIsOnOrOff(){
        if(isClockOnOrOffButton == false)
            System.out.println("checking : Clock is Off");
        else
            System.out.println("checking : Clock is On");
    }

    static void turnOnClock(){
        System.out.println("Turning On the Clock");
        isClockOnOrOffButton = true;
    }

    static int getCurrentTime(){
        return currentTime