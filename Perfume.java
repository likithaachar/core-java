class Perfume {
    public static void main(String[] args) {

        String[] perfumeBrand = {"Chanel","Dior","Gucci","Versace","Armani","Burberry","CalvinKlein","YSL","TomFord","Zara"};
        int[] perfumePrice = {8000,7500,7000,6500,7200,6000,5500,9000,8500,3000};
        String[] perfumeType = {"Floral","Woody","Citrus","Fresh","Musk","Sweet","Spicy","Aqua","Vanilla","Fruity"};

        for(String brand : perfumeBrand){
            System.out.println(brand);
        }
        for(int price : perfumePrice){
            System.out.println(price);
        }
        for(String type : perfumeType){
            System.out.println(type);
        }
    }
}