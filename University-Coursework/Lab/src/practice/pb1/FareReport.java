package practice.pb1;

import java.util.List;

public class FareReport {
    public static void generateReport(List<Ride> rides){
        for(Ride r:rides){
            System.out.println("Distance:"+r.getDistanceInMiles()+"  | Fare: "+r.calculateFinalFare());
        }
    }
}
