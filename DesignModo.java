class DesignModo {

    String templateName;
    String designer;
    int downloads;

    public DesignModo() {
    }

    public DesignModo(String templateName, String designer, int downloads) {
        this.templateName = templateName;
        this.designer = designer;
        this.downloads = downloads;
    }

    public void display() {
        System.out.println(templateName);
        System.out.println(designer);
        System.out.println(downloads);
        System.out.println("------------");
    }
}

