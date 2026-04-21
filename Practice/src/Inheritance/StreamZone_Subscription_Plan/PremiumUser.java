package Inheritance.StreamZone_Subscription_Plan;

public class PremiumUser extends User{
    private String subscriptionPlan;

    public  void setSubscriptionPlan(String details){
        if("MONTHLY".equalsIgnoreCase(details) || "YEARLY".equalsIgnoreCase(details)){
            this.subscriptionPlan = details.toUpperCase();
        } else this.subscriptionPlan = "MONTHLY";
    }

    @Override
    public void watchMovie(String title) {
        System.out.println("Playing "+title+" in 4K. Ad-free experience!");
        addToHistory(title);
    }

    public  void getRenewalMessage(){
        if("YEARLY".equalsIgnoreCase(subscriptionPlan)) System.out.println("Your yearly plan saves you 30%!");
        else System.out.println("Consider upgrading to Yearly for savings!");
    }

    public String getSubscriptionPlan() {
        return subscriptionPlan;
    }
}
