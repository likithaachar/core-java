class Car {
    public static void main(String[] args) {
        String[] carName = {"BMW","Audi","Tesla","Toyota","Honda","Ford","Kia","Hyundai","Volvo","Skoda"};
        int[] carPrice = {5000000,4500000,6000000,2000000,1800000,2500000,2200000,2100000,4800000,2300000};
        String[] carColor = {"Black","White","Red","Blue","Silver","Gray","Green","Yellow","Orange","Brown"};
        for(String name : carName){
            System.out.println(name);
        }
        for(int price : carPrice){
            System.out.println(price);
        }
        for(String color : carColor){
            System.out.println(color);
        }
    }
}