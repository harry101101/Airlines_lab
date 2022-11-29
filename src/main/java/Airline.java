import java.util.ArrayList;

public class Airline {


    private String name;


    private ArrayList<Flight> allFlights;
    private ArrayList<Passenger> allPassengers;


    public Airline(String name) {
        this.name = name;
        this.allFlights = new ArrayList<>();
        this.allPassengers = new ArrayList<>();
    }

    //methods
    public void addNewFlight(Flight flight){
        this.allFlights.add(flight);
    }
    public void cancelFlight(Flight flight){
        this.allFlights.remove(flight);
    }

    public ArrayList<Flight> displayAllFlights(){
        for(Flight individualFlight : this.allFlights){

            System.out.println(individualFlight.toString());
        }
        return  this.allFlights;
    }

    public void  bookPassengerOntoFlight(Flight flight, Passenger passenger) {
        flight.addPassengersToFlight(passenger);
//        return String.format("%s has been booked on flight to %s", passenger.getName(), flight.getDestination());
    }

    public void addPassengerOntoSystem(Passenger passenger) {
        allPassengers.add(passenger);
    }

    public int countNumberOfFlights() {
        return this.allFlights.size();
    }


//getters and setters
    public String getName(){
        return this.name;
    }
   public ArrayList<Passenger> getAllPassengers(){
        return this.allPassengers;
    }

    public ArrayList<Flight> getAllFlights() {
        return this.allFlights;
    }





}
