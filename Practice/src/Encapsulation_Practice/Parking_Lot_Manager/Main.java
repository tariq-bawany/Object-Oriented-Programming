package Encapsulation_Practice.Parking_Lot_Manager;

public class Main {
    static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Vehicle("KEC-555","Muhammad Tariq",4);
        vehicles[1] = new Vehicle("NFD-0432","Yaqoob",0);
        vehicles[2] = new Vehicle("LUP-69","Ali",1);
        vehicles[3] = new Vehicle("MUP-890","Habshi",5);

        for (int i = 0; i < vehicles.length; i++) {
            for(int j=i+1;j< vehicles.length-1;j++){
                Vehicle temp;
                if(vehicles[i].calculateFee()>vehicles[j].calculateFee()){
                    temp = vehicles[i];
                    vehicles[i] =vehicles[j];
                    vehicles[j] = temp;
                }
            }
        }
        for(Vehicle vehicle:vehicles){
            vehicle.getData();
        }
    }
}
