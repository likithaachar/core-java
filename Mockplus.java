class Mockplus {

    String designTitle;
    String authorName;
    int elementCount;

    public Mockplus() {
    }

    public Mockplus(String designTitle, String authorName, int elementCount) {
        this.designTitle = designTitle;
        this.authorName = authorName;
        this.elementCount = elementCount;
    }

    public void display() {
        System.out.println(designTitle);
        System.out.println(authorName);
        System.out.println(elementCount);
        System.out.println("----------");
    }
}

