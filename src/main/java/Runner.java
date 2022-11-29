import java.sql.SQLOutput;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        // welcome message system out
        //Options 1 -5
        // want input from user
        //depending on option chosen perform the method
        //
        Airline airline = new Airline("BNTA Jets");
        boolean running = true;
        int uniqueId = 0;
        int flightId = 1;

        System.out.println("Welcome to BNTA Airline. Please choose one of the following options:");
        while (running == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----------------------------------------");
            System.out.println("To add a new flight: Enter 1");
            System.out.println("To display all available flights: Enter 2");
            System.out.println("To add a new passenger: Enter 3");
            System.out.println("To book a passenger onto a flight: Enter 4");
            System.out.println("To cancel a flight: Enter 5");
            System.out.println("To search fro flight to a specific destination: Enter 6");
            System.out.println("Finish enquiry: Enter 7");
            int choice = scanner.nextInt();

            if (choice == 1) {
                Scanner destinationScanner = new Scanner(System.in);
                System.out.println("Enter your desired destination: ");
                String destination = destinationScanner.nextLine().toLowerCase();

//                Scanner flightIdScanner = new Scanner(System.in);
//                System.out.println("Enter the flight id: ");
//                int flightId = flightIdScanner.nextInt();
                Flight flight = new Flight(destination);
                flightId *= 30;
                airline.addNewFlight(flight);
                System.out.println("You've successfully added a flight to " + destination + " with id " + flightId);

            }

            if (choice == 2) {
                System.out.println("Here are your available flights: ");
                airline.displayAllFlights();
                if(airline.countNumberOfFlights() == 0) {
                    System.out.println("There are currently no available flights.");
                }
            }

            if (choice == 3) {
                Scanner passengerName = new Scanner(System.in);
                System.out.println("Please enter the passenger's name: ");
                String name = passengerName.nextLine();

                Scanner passengerEmail = new Scanner(System.in);
                System.out.println("Please enter the passenger's email address: ");
                String email = passengerEmail.nextLine();

//                Scanner passengerId = new Scanner(System.in);
//                System.out.println("Please enter the passenger's id: ");
               //int uniqueId = passengerId.nextInt();


                Passenger passenger = new Passenger(name, email);
//                int uniqueId = passenger.getUniqueId();
                uniqueId ++;
                airline.addPassengerOntoSystem(passenger);

                System.out.println("You've successfully added " + name + " to the system. Unique Id number: "+ uniqueId);

            }

            if (choice == 4) {
                Scanner requestFlightId = new Scanner(System.in);
                System.out.println("Please enter the flight Id you wish to book your passenger onto: ");
                int flightIdInput = requestFlightId.nextInt();

                Scanner requestPassengerId = new Scanner(System.in);
                System.out.println("Please enter the passenger id to book onto flight " + flightIdInput);
                int passengerId = requestPassengerId.nextInt();

                for(Flight flight: airline.getAllFlights()) {
                    if(flight.getFlightId() == flightIdInput) {
                        for(Passenger passenger: airline.getAllPassengers()) {
                            if(passenger.getUniqueId() == passengerId) {
                                airline.bookPassengerOntoFlight(flight, passenger);
                            }
                        }
                    } else {
                        System.out.println("Incorrect id entered.");
                    }
                }

            }

            if(choice == 5) {
                Scanner cancelFlight = new Scanner(System.in);
                System.out.println("Which flight would you like to cancel? Please enter the flight id");
                int flightIdInput = cancelFlight.nextInt();

                for(Flight flight: airline.getAllFlights()) {
                    if(flight.getFlightId() == flightIdInput) {
                        airline.cancelFlight(flight);
                        System.out.println("Flight " + flight.getFlightId() + " has been successfully cancelled.");
                        break;
                    } else {
                        System.out.println("Flight does not exist.");
                    }
                }
            }

            if(choice == 6){
                Scanner searchDestination = new Scanner(System.in);
                System.out.println("Enter your destination to see available flights:");
                String destination = searchDestination.nextLine().toLowerCase();
                System.out.println("Flights to " + destination +":");
                for(Flight flight: airline.getAllFlights()){

                    if(flight.getDestination().equals(destination)){
                        System.out.println("Flight number " + flight.getFlightId());
                    }
                }
            }

            if (choice == 7) {
                running = false;
            }


        }


    }
}
