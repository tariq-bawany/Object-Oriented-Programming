package practice.pb1;

import java.util.ArrayList;
import java.util.List;

//Client Brief: "We need a fare calculator for a ride-sharing app with three tiers:
//Economy, Premium, and Luxury. Each tier has a strictly unchangeable base rate (e.g.,$1.0, $2.0, $5.0 per mile). However, the company introduces a global surgeMultiplier (e.g., 1.5x) during rush hours that must apply instantly to every ride being calculated
//across the entire system. Furthermore, Premium and Luxury tiers have a luxury tax
//applied to them, but Economy does not. We need a system where we can pass a list of
//mixed rides to a single reporting function, and it outputs the correct final fare for each."
public class Main {
    static void main(String[] args) {
        List<Ride> rides = new ArrayList<>();
        rides.add(new Economy(10));
        rides.add(new Premium(10));
        rides.add(new Luxury(10));
        FareReport.generateReport(rides);

    }
}
