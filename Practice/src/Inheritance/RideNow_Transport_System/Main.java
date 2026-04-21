package Inheritance.RideNow_Transport_System;

public class Main {
    static void main(String[] args) {
            System.out.println("--- RideNow System Live ---");

            Driver d = new Driver();
            d.setDriverName("  usman tariq  ");
            d.setLicenseNumber("LIC-AB1234");
            d.acceptRide("Gulshan");
            d.acceptRide("DHA");
            d.showTripLog();
            d.searchTrip("DHA");
        System.out.println();

            PremiumDriver pd = new PremiumDriver();
            pd.setDriverName("kamran ali");
            pd.setVehicleClass("SUV");
            pd.acceptRide("Clifton");
            pd.getVehicleInfo();
        System.out.println();

            FleetDriver fd = new FleetDriver();
            fd.setDriverName("hamza malik");
            fd.setFleetID("FLT-221");
            fd.acceptRide("Airport");
            fd.addEarnings(1500);
            fd.showFleetSummary();

    }
}
