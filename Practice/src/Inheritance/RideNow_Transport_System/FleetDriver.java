package Inheritance.RideNow_Transport_System;

public class FleetDriver extends PremiumDriver{
    private String fleetID;

    public void setFleetID(String fleetID) {
        if( fleetID!=null &&fleetID.startsWith("FLT-") ){
            this.fleetID =fleetID;
        }else this.fleetID = "FLT-000";
    }

    @Override
    public void acceptRide(String destination) {
        System.out.println(this.fleetID+" Fleet vehicle dispatched to "+destination+".");
        logTrip(destination);
    }

    public void showFleetSummary(){
        System.out.println("Fleet ID: "+this.fleetID+" || total trips taken: "+this.tripCount+" || total earnings: "+this.earnings+"\n");
    }
}
