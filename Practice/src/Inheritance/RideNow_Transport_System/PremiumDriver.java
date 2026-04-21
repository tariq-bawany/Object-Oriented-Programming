package Inheritance.RideNow_Transport_System;

public class PremiumDriver extends Driver{
    private String vehicleClass;

    public void setVehicleClass(String vehicleClass) {
        if("SEDAN".equalsIgnoreCase(vehicleClass) || "SUV".equalsIgnoreCase(vehicleClass)){
            this.vehicleClass = vehicleClass;
        }else this.vehicleClass = "SEDAN";


    }

    @Override
    public void acceptRide(String destination) {
        System.out.println(this.driverName+" heading to "+destination+" in a "+this.vehicleClass+". Premium fare applied.");
        logTrip(destination);
    }

    public void getVehicleInfo(){
        System.out.println("Vehicle Class: "+this.vehicleClass);
    }

}
