class AirCoolerRunner{
    public static void main(String[] args){

        //check aircooler is on or off
        AirCooler.checkAirCoolerIsOnOrOff();

        //to turn on aircooler
        AirCooler.turnOnAirCooler();

        //check aircooler is on or off
        AirCooler.checkAirCoolerIsOnOrOff();

        //need to display current speed
        int currentSpeed = AirCooler.getCurrentSpeed();
        System.out.println("Current Speed : " + currentSpeed);
    }
}