public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ResidentialSite residentialSite = new ResidentialSite();
        LifelineSite lifelineSite = new LifelineSite();
        System.out.println(residentialSite.getBillableAmount());
        System.out.println(lifelineSite.getBillableAmount());
    }
}