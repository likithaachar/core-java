class IronBoxRunner {

    public static void main(String[] args) {

        IronBox.checkIronBoxIsOnOrOff();

        IronBox.turnOnIronBox();

        IronBox.increaseTemperature();
        int currentTemperature = IronBox.getCurrentTemperature();
        System.out.println("Current Temperature : " + currentTemperature);

        IronBox.decreaseTemperature();
        currentTemperature = IronBox.getCurrentTemperature();
        System.out.println("Current Temperature : " + currentTemperature);
    }
}