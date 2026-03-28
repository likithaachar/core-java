class Lipstick{
public static void main(String[] args) {
        String[] lipstickBrand = {"Lakme","Maybelline","MAC","Revlon","Colorbar","Sugar","Nykaa","Faces","Elle18","SwissBeauty"};
        int[] lipstickPrice = {300,450,1200,500,650,700,400,550,200,350};
        String[] lipstickColor = {"Red","Pink","Nude","Maroon","Coral","Berry","Peach","Brown","Wine","Rose"};

        for(String brand : lipstickBrand){
            System.out.println(brand);
        }
        for(int price : lipstickPrice){
            System.out.println(price);
        }
        for(String color : lipstickColor){
            System.out.println(color);
        }
    }
}