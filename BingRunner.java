class BingRunner {
    public static void main(String[] args) {

        Bing obj1 = new Bing("Java Tutorial", "Web Results", 1000);
        obj1.display();

        Bing obj2 = new Bing("Latest News", "News Section", 500);
        obj2.display();

        Bing obj3 = new Bing("Funny Videos", "Video Results", 300);
        obj3.display();

        Bing obj4 = new Bing("Weather Today", "Weather Info", 50);
        obj4.display();

        Bing obj5 = new Bing("Cricket Score", "Sports Results", 120);
        obj5.display();

        Bing obj6 = new Bing("Maps Location", "Map Results", 80);
        obj6.display();

        Bing obj7 = new Bing("Shopping Deals", "Product Results", 200);
        obj7.display();
    }
}