import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AirlineTest {


    private Airline airline;

    @BeforeEach
    public void setUp() {
        this.airline = new Airline("Easy Jet");
    }

    @Test
    public void test_canAddNewFlightsToArrayList() {
        Flight flightToSpain = new Flight("Mallorca");
        Flight flightToPortugal = new Flight("Lisbon");
        airline.addNewFlight(flightToSpain);
        airline.addNewFlight(flightToPortugal);
        int expected = 2;
        int actual = airline.countNumberOfFlights();
        assertEquals(actual, expected);

    }

    @Test
    public void test_cancelFlight_removes_FlightsFromArrayList() {
        Flight flightToSpain = new Flight("Mallorca");
        Flight flightToPortugal = new Flight("Lisbon");
        Flight flightToScotland = new Flight("Edinburgh");
        Flight flightToAlgeria = new Flight("Algiers");
        Flight flightToQatar = new Flight("Doha");
        airline.addNewFlight(flightToSpain);
        airline.addNewFlight(flightToPortugal);
        airline.addNewFlight(flightToScotland);
        airline.addNewFlight(flightToAlgeria);
        airline.addNewFlight(flightToQatar);
        airline.cancelFlight(flightToPortugal);
        int expected = 4;
        int actual = airline.countNumberOfFlights();
        assertEquals(actual, expected);

    }

    @Test
    public void test_canBookPassengers_onto_Flight() {
        Flight flightToSpain = new Flight("Mallorca");
        Passenger nadia = new Passenger("Nadia", "nadia.djeridi@BNTA.com");
        Passenger harry = new Passenger("Harry", "harry.xyz@BNTA.com");
        airline.addNewFlight(flightToSpain);
        airline.bookPassengerOntoFlight(flightToSpain, nadia);
        airline.bookPassengerOntoFlight(flightToSpain, harry);


        ArrayList<Passenger> actual = flightToSpain.getPassengersOnFlight();
        System.out.println(flightToSpain.getPassengersOnFlight());

    }

    @Test
    public void test_display_of_all_flights(){
        Flight flightToSpain = new Flight("Mallorca");
        Flight flightToPortugal = new Flight("Lisbon");
        Flight flightToScotland = new Flight("Edinburgh");
        Flight flightToAlgeria = new Flight("Algiers");
        Flight flightToQatar = new Flight("Doha");
        airline.addNewFlight(flightToSpain);
        airline.addNewFlight(flightToPortugal);
        airline.addNewFlight(flightToScotland);
        airline.addNewFlight(flightToAlgeria);
        airline.addNewFlight(flightToQatar);

        airline.displayAllFlights();


    }

    @Test
    public  void test_adding_passengers_onto_airline_system() {
        Passenger nadia = new Passenger("Nadia", "nadia.djeridi@BNTA.com");
        Passenger harry = new Passenger("Harry", "harry.xyz@BNTA.com");
        airline.addPassengerOntoSystem(nadia);
        airline.addPassengerOntoSystem(harry);
        int expected = 2;
        int actual = airline.getAllPassengers().size();
        assertEquals(actual, expected);

    }





}
