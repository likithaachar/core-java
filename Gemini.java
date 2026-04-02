class Gemini {

    String modelName;
    String version;
    int responseLimit;

    public Gemini() {
    }

    public Gemini(String modelName, String version, int responseLimit) {
        this.modelName = modelName;
        this.version = version;
        this.responseLimit = responseLimit;
    }

    public void display() {
        System.out.println(modelName);
        System.out.println(version);
        System.out.println(responseLimit);
        System.out.println("----------");
    }
}

