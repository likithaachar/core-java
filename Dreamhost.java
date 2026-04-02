class Dreamhost {

    String domainName;
    String hostingType;
    int storageSize;

    public Dreamhost() {
    }

    public Dreamhost(String domainName, String hostingType, int storageSize) {
        this.domainName = domainName;
        this.hostingType = hostingType;
        this.storageSize = storageSize;
    }

    public void display() {
        System.out.println(domainName);
        System.out.println(hostingType);
        System.out.println(storageSize);
        System.out.println("---------");
    }
}

