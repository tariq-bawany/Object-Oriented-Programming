package practice.pb1;

public class Premium extends Ride {
    public final static double BASE_RATE = 2;
    public final static double LUXURY_TAX = 0.6;

    public Premium(double distanceInMiles) {
        super(distanceInMiles);
    }


    @Override
    public double calculateFinalFare() {
        return (getDistanceInMiles() * BASE_RATE * getSurgeMultiplier())+LUXURY_TAX;
    }

}
