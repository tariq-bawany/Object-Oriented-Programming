package Inheritance.RideNow_Transport_System;

public class Driver {
    protected String driverName;
    protected String licenseNumber;
    protected double earnings;
    protected String[] tripLogs = new String[8];
    protected int tripCount =0;

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public double getEarnings() {
        return earnings;
    }

    public int getTripCount() {
        return tripCount;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setDriverName(String driverName) {
        if(driverName==null || driverName.trim().isEmpty()){
            this.driverName = "UNKNOWN";
            return;
        }
        String[] splits = driverName.trim().split("\\s+");
        StringBuilder sb =new StringBuilder();
        for(String s:splits){
            sb.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1).toLowerCase()).append(" ");
        }
        this.driverName = sb.toString().trim();
    }

    public void setLicenseNumber(String licenseNumber) {
        if(licenseNumber!=null && licenseNumber.startsWith("LIC-") && licenseNumber.length()==10){
            this.licenseNumber = licenseNumber;
        }else this.licenseNumber = "UNVERIFIED";
    }

    public void addEarnings(double amount){
        if(amount>0)this.earnings+=amount;
    }

    public void logTrip(String destination){
        if(this.tripCount<8){
            this.tripLogs[tripCount] = destination;
            tripCount++;
        } else System.out.println("Trip log full.");
    }

    public void acceptRide(String destination){
        System.out.println(this.driverName+" heading to "+destination+". Standard fare.");
        logTrip(destination);
    }

    public void showTripLog(){
        if(tripCount==0) {
            System.out.println("No trips yet");
            return;
        }
        for(int i =0;i<tripCount;i++){
            if(tripLogs[i]!=null){
                System.out.println(i+"-) "+tripLogs[i]);
            }
        }

    }

    public void searchTrip(String keyword){
        boolean isFound =false;
        if(tripCount>0){
            for(int i=0;i<tripCount;i++){
                if(tripLogs[i].contains(keyword)){
                    System.out.println(i+ "-) "+tripLogs[i]);
                    isFound =true;
                }
            }
        }
        if(!isFound) System.out.println("No matching trips.");

    }
}
