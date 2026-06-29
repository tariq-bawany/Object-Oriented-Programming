package practice.pb1;

public class Luxury extends Ride {
    public final static double BASE_RATE = 5;
    public final static double LUXURY_TAX = 1;

    public Luxury(double distanceInMiles) {
        super(distanceInMiles);
    }


    @Override
    public double calculateFinalFare() {
        return (getDistanceInMiles() * BASE_RATE * getSurgeMultiplier()) + LUXURY_TAX;
    }
}
