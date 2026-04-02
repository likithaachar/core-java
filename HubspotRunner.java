class HubspotRunner {
    public static void main(String[] args) {

        Hubspot obj1 = new Hubspot("Email Marketing", "Shilpa", 120);
        obj1.display();

        Hubspot obj2 = new Hubspot("Social Media Ads", "Liki", 200);
        obj2.display();

        Hubspot obj3 = new Hubspot("SEO Campaign", "Dhanvi", 150);
        obj3.display();

        Hubspot obj4 = new Hubspot("Content Marketing", "Isha", 180);
        obj4.display();

        Hubspot obj5 = new Hubspot("Affiliate Program", "Naveen", 90);
        obj5.display();

        Hubspot obj6 = new Hubspot("Product Launch", "Pooja", 250);
        obj6.display();

        Hubspot obj7 = new Hubspot("Webinar Campaign", "Suresh", 170);
        obj7.display();
    }
}