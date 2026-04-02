class LinkedIn {

    String userName;
    String jobTitle;
    int connections;

    public LinkedIn() {
    }

    public LinkedIn(String userName, String jobTitle, int connections) {
        this.userName = userName;
        this.jobTitle = jobTitle;
        this.connections = connections;
    }

    public void display() {
        System.out.println(userName);
        System.out.println(jobTitle);
        System.out.println(connections);
        System.out.println("--------");
    }
}

