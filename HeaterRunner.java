class HeaterRunner {
    public static void main(String[] args) {
        Heater.checkHeaterStatus();
        Heater.turnOnHeater();
        Heater.checkHeaterStatus();
        int heat = Heater.getCurrentHeat();
        System.out.println("Current Heat : " + heat);
    }
}