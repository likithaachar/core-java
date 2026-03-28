class IronBox {

    static boolean isIronBoxOnOrOffButton = false;
    static int maxTemperature = 200;
    static int currentTemperature = 120;
    static int minTemperature = 50;

    static void checkIronBoxIsOnOrOff(){
        if(isIronBoxOnOrOffButton == false)
            System.out.println("checking : IronBox is Off");
        else
            System.out.println("checking : IronBox is On");
    }

    static void turnOnIronBox(){
        System.out.println("Turning On the IronBox");
        isIronBoxOnOrOffButton = true;
    }

    static void increaseTemperature(){

        if(isIronBoxOnOrOffButton == true){

            if(currentTemperature < maxTemperature){
                currentTemperature = currentTemperature + 20;
                System.out.println("Temperature Increased : " + currentTemperature);
            }
            else{
                System.out.println("Temperature already at Maximum");
            }

        }else{
            System.out.println("IronBox is OFF. Cannot increase temperature");
        }
    }

    static void decreaseTemperature(){

        if(isIronBoxOnOrOffButton == true){

            if(currentTemperature > minTemperature){
                currentTemperature = currentTemperature - 20;
                System.out.println("Temperature Decreased : " + currentTemperature);
            }
            else{
                System.out.println("Temperature already at Minimum");
            }

        }else{
            System.out.println("IronBox is OFF");
        }
    }

    static int getCurrentTemperature(){
        return currentTemperature;
    }
}