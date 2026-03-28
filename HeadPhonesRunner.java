class HeadPhonesRunner{
   public static void main(String[] args) {

       HeadPhones.brandName();
       HeadPhones.color();

        int cost = HeadPhones.price();
        System.out.println("Price: " + cost);

        boolean wirelessType = HeadPhones.isWireless();
        System.out.println("Wireless: " + wirelessType);
    }
}