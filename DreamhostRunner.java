class DreamhostRunner {
    public static void main(String[] args) {

        Dreamhost obj1 = new Dreamhost("myblog.com", "Shared Hosting", 50);
        obj1.display();

        Dreamhost obj2 = new Dreamhost("shoponline.in", "Cloud Hosting", 100);
        obj2.display();

        Dreamhost obj3 = new Dreamhost("portfolio.net", "VPS Hosting", 75);
        obj3.display();

        Dreamhost obj4 = new Dreamhost("startupsite.io", "Dedicated Hosting", 200);
        obj4.display();

        Dreamhost obj5 = new Dreamhost("travelworld.org", "Shared Hosting", 60);
        obj5.display();

        Dreamhost obj6 = new Dreamhost("learncode.edu", "Cloud Hosting", 120);
        obj6.display();

        Dreamhost obj7 = new Dreamhost("fitnesszone.com", "VPS Hosting", 90);
        obj7.display();
    }
}