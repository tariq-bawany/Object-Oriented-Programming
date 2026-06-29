package practice.pb1;

public class Economy extends Ride {
    public final static double BASE_RATE = 1;

    public Economy(double distanceInMiles) {
        super(distanceInMiles);
    }


    @Override
    public double calculateFinalFare() {
        return getDistanceInMiles()*BASE_RATE*getSurgeMultiplier();
    }

}
