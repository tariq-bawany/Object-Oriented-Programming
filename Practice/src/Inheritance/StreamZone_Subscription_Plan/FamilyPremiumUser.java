package Inheritance.StreamZone_Subscription_Plan;

public class FamilyPremiumUser extends PremiumUser {
    private int memberCount;

    public void setMemberCount(int memberCount) {
        if(memberCount>=2 && memberCount<=6) this.memberCount = memberCount;
        else this.memberCount = 2;
    }

    @Override
    public void watchMovie(String title) {
        System.out.println("[Family Plan] Playing "+title+" in 4K on "+memberCount+" screens.");
        addToHistory(title);
    }

    public void ShowPlanDetails(){
        System.out.println("Plan: "+getSubscriptionPlan()+" | Members Count: "+this.memberCount);
    }
}
