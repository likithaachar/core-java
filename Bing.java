class Bing {

    String searchQuery;
    String resultType;
    int resultCount;

    public Bing() {
    }

    public Bing(String searchQuery, String resultType, int resultCount) {
        this.searchQuery = searchQuery;
        this.resultType = resultType;
        this.resultCount = resultCount;
    }

    public void display() {
        System.out.println(searchQuery);
        System.out.println(resultType);
        System.out.println(resultCount);
        System.out.println("----------");
    }
}

