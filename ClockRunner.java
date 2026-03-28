class ClockRunner{

    public static void main(String[] args){

        //check clock is on or off
        Clock.checkClockIsOnOrOff();

        //to turn on clock
        Clock.turnOnClock();

        //check clock is on or off
        Clock.checkClockIsOnOrOff();

        //need to display current time
        int currentTime = Clock.getCurrentTime();
        System.out.println("Current Time : " + currentTime);
    }
}