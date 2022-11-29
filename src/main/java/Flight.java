import java.util.ArrayList;

public class Flight {

    private String destination;
    private int flightId;
    
    private ArrayList<Passenger> passengersOnFlight;

    public Flight(String destination){
        this.destination = destination;
        this.flightId = 1;
        this.passengersOnFlight = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Flight{" +
                "destination='" + destination + '\'' +
                ", flightId=" + flightId +
                ", passengersOnFlight=" + passengersOnFlight +
                '}';
    }

    //getters and setters

    public String getDestination(){
        return this.destination;
    }
    public int getFlightId(){
        return this.flightId;
    }
    public ArrayList<Passenger> getPassengersOnFlight(){
        return this.passengersOnFlight;
    }
    
    public void addPassengersToFlight(Passenger passengerToFlight) {
        
        this.passengersOnFlight.add(passengerToFlight);
    }

    

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }


}

