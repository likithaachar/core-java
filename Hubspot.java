class Hubspot {

    String campaignName;
    String managerName;
    int leadsGenerated;

    public Hubspot() {
    }

    public Hubspot(String campaignName, String managerName, int leadsGenerated) {
        this.campaignName = campaignName;
        this.managerName = managerName;
        this.leadsGenerated = leadsGenerated;
    }

    public void display() {
        System.out.println(campaignName);
        System.out.println(managerName);
        System.out.println(leadsGenerated);
        System.out.println("------------");
    }
}

