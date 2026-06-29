package practice.pb1;

public abstract class Ride {
    private static double surgeMultiplier = 1.5;
    private double distanceInMiles;

    public double getDistanceInMiles() {
        return distanceInMiles;
    }

    public static double getSurgeMultiplier() {
        return surgeMultiplier;
    }

    public Ride(double distanceInMiles) {
        if(distanceInMiles<0){
            throw new IllegalArgumentException("distance cant be negative");
        }
        this.distanceInMiles = distanceInMiles;
    }

    public static void setSurgeMultiplier(double surgeMultiplier) {
        if(surgeMultiplier<=0){
            throw  new IllegalArgumentException("surge must be positive");
        }
        Ride.surgeMultiplier = surgeMultiplier;
    }
    public abstract double calculateFinalFare();

}
