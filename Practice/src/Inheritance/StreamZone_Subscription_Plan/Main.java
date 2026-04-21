package Inheritance.StreamZone_Subscription_Plan;

public class Main {
    static void main() {
        System.out.println("--- StreamZone Live ---");

        User freeUser = new User();
        freeUser.setUsername("  ali razA  ");
        freeUser.setEmail("aliraza@gmail.com");
        System.out.println("HI, "+ freeUser.getUsername());
        freeUser.watchMovie("Inception");
        freeUser.watchMovie("Interstellar");
        freeUser.showWatchHistory();
        System.out.println();
        freeUser.searchHistory("Inter");
        System.out.println();

        PremiumUser premUser = new PremiumUser();
        premUser.setUsername("sara khan");
        premUser.setSubscriptionPlan("YEARLY");
        premUser.watchMovie("Oppenheimer");
        premUser.getRenewalMessage();
        System.out.println();

        FamilyPremiumUser famUser = new FamilyPremiumUser();
        famUser.setUsername("ahmed ali");
        famUser.setMemberCount(4);
        famUser.watchMovie("Dune");
        famUser.setSubscriptionPlan("Monthly");
        famUser.ShowPlanDetails();
    }
}
