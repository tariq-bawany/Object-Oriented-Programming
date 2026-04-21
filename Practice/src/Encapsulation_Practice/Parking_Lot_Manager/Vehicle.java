package Encapsulation_Practice.Parking_Lot_Manager;

public class Vehicle {
    private String plateNumber;
    private String ownerName;
    private int hoursParked;

    public Vehicle(String plateNumber,String ownerName,int hoursParked){
        setHoursParked(hoursParked);
        setPlateNumber(plateNumber);
        setOwnerName(ownerName);
    }
    public Vehicle(){}

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setHoursParked(int hoursParked) {
        if(hoursParked>=0)this.hoursParked = hoursParked;
        System.out.println("Invalid hours parked input.");
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getHoursParked() {
        return hoursParked;
    }


    public String getPlateNumber() {
        return plateNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public int calculateFee(){
        int fee=1;
        if(hoursParked>2){
            fee = (2*50) + ((hoursParked-2)*30);
            return fee;
        }else if(hoursParked>0) {
            fee = (hoursParked*50);
            return fee;
        }
        return 0;
    }
    public void getData(){
        System.out.printf("\nPlate Number: %s\nOwner Name: %s\nHours Parked: %d\nTotal Fees:%d\n",getPlateNumber(),getOwnerName(),getHoursParked(),calculateFee());
    }
}
