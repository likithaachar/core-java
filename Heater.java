class Heater {
    static boolean heaterButton = false;
    static int maxHeat = 40;
    static int currentHeat = 20;
    static void checkHeaterStatus() {
        if(heaterButton == false)
            System.out.println("Checking : Heater is OFF");
        else
            System.out.println("Checking : Heater is ON");
    }
    static void turnOnHeater() {
        System.out.println("Turning On the Heater");
        heaterButton = true;
    }
    static int getCurrentHeat() {
        return currentHeat;
    }
}