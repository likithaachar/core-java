class Fan{
    static boolean fanSwitch = false;
    static int maxSpeed = 5;
    static int currentSpeed = 2;
    static void checkFanStatus() {
        if(fanSwitch == false)
            System.out.println("Checking : Fan is OFF");
        else
            System.out.println("Checking : Fan is ON");
    }
    static void turnOnFan() {
        System.out.println("Turning On the Fan");
        fanSwitch = true;
    }
    static int getCurrentSpeed() {
        return currentSpeed;
    }
}