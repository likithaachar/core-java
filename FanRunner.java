class FanRunner {
    public static void main(String[] args) {
        Fan.checkFanStatus();
        Fan.turnOnFan();
        Fan.checkFanStatus();
        int speed = Fan.getCurrentSpeed();
        System.out.println("Current Speed : " + speed);
    }
}