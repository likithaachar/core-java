class Mixer {
    static boolean isMixerOnOrOffButton = false;
    static int maxSpeed = 10;
    static int currentSpeed = 3;
    static void checkMixerIsOnOrOff(){
        if(isMixerOnOrOffButton == false)
            System.out.println("checking : Mixer is Off");
        else
            System.out.println("checking : Mixer is On");
    }
    static void turnOnMixer(){
        System.out.println("Turning On the Mixer");
        isMixerOnOrOffButton = true;
    }
    static int getCurrentSpeed(){
        return currentSpeed;
    }
}