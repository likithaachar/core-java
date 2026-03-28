class WaterHeaterRunner{

    public static void main(String[] args){       
        WaterHeater.checkWaterHeaterIsOnOrOff();      
        WaterHeater.turnOnWaterHeater();  
        WaterHeater.checkWaterHeaterIsOnOrOff();
        int currentTemperature = WaterHeater.getCurrentTemperature();
        System.out.println("Current Temperature : " + currentTemperature);
    }
}