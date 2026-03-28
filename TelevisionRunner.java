class TelevisionRunner{
    public static void main(String[] args){
        //check tv is on or off
        Television.checkTvIsOnOrOff();
        //to turn on tv
        Television.turnOnTV();
        //check tv is on or off
        Television.checkTvIsOnOrOff();
        //need to display current volume
        int currentVolume = Television.getCurrentVolume();
        System.out.println("Current Volume : " + currentVolume);
    }
}