class SocialAppRunner {

    public static void main(String[] args) {

        SocialApp.companyName = "Google";
        SocialApp.appName = "YouTube";

      
        SocialApp user1 = new SocialApp();
        user1.personName = "Ravi";
        user1.email = "Shilpa@gmail.com";
        user1.phNo = 9876543210L;
        user1.dob = "29-10-2001";
        user1.userName = "Shilpa_yt";
        user1.password = "Shilpa@123";
        System.out.println("Company Name: " + SocialApp.companyName);
        System.out.println("App Name: " + SocialApp.appName);
        System.out.println("User1 Name: " + user1.personName);

        SocialApp user2 = new SocialApp();
        user2.personName = "Liki";
        user2.email = "Liki@gmail.com";
        user2.phNo = 9123456780L;
        user2.dob = "18-10-2005";
        user2.userName = "Liki_live";
        user2.password = "Liki@456";
        System.out.println("Company Name: " + SocialApp.companyName);
        System.out.println("App Name: " + SocialApp.appName);
        System.out.println("User2 Name: " + user2.personName);
    }
}