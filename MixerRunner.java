class MixerRunner{
    public static void main(String[] args){
        //check mixer is on or off
        Mixer.checkMixerIsOnOrOff();
        //to turn on mixer
        Mixer.turnOnMixer();
        //check mixer is on or off
        Mixer.checkMixerIsOnOrOff();
        //need to display current speed
        int currentSpeed = Mixer.getCurrentSpeed();
        System.out.println("Current Speed : " + currentSpeed);
    }
}