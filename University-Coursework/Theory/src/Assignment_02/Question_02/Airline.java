package Assignment_02.Question_02;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private List<Flight> flights;

    public Airline(){
        flights = new ArrayList<>();
    }
    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public Flight findFlightByNumber(String flightNumber){
        for(Flight f:flights){
            if(f.getFlightNumber().equalsIgnoreCase(flightNumber)){
                return f;
            }
        }
        return null;
    }

    public String registerCustomer(String flightNumber){
        Flight flight = findFlightByNumber(flightNumber);
        if(flight == null){
            return "Flight not Found!";
        }
        if(flight.assignCustomer()){
            return "Customer Registered Successfully!";
        }else{
            return  "Registration failed! No available seats.";
        }
    }
    public void listFlights(){
        if(flights.isEmpty()){
            System.out.println("No Flights Available");
            return;
        }
        for(Flight f :flights){
            System.out.println(f.toString());
        }
    }

}
