class Product {
    public static void main(String[] args) {
        String[] productName = {"Laptop","Mobile","TV","Tablet","Camera","Speaker","Watch","Printer","Mouse","Keyboard"};
        int[] productPrice = {50000,20000,40000,15000,30000,5000,7000,12000,800,1500};
        String[] productBrand = {"Dell","Samsung","LG","Apple","Canon","Sony","Titan","HP","Logitech","Zebronics"};
        for(String name : productName){
            System.out.println(name);
        }
        for(int price : productPrice){
            System.out.println(price);
        }
        for(String brand : productBrand){
            System.out.println(brand);
        }
    }
}