class Justinmind {

    String projectName;
    String designerName;
    int screens;

    public Justinmind() {
    }

    public Justinmind(String projectName, String designerName, int screens) {
        this.projectName = projectName;
        this.designerName = designerName;
        this.screens = screens;
    }

    public void display() {
        System.out.println(projectName);
        System.out.println(designerName);
        System.out.println(screens);
        System.out.println("-------------------");
    }
}

