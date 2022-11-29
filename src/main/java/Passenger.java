public class Passenger {

    //properties

    private String name;
    private String emailAddress;
    private int uniqueId;

    public Passenger(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.uniqueId = 1;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", uniqueId=" + uniqueId +
                '}';
    }
// getters and setters

    public String getName(){
        return this.name;
    }

    public String getEmailAddress(){
        return this.emailAddress;
    }
    public int getUniqueId(){
        return this.uniqueId;
    }

    public void setName (String name) {this.name = name;}
    public void setPhoneNumber(String emailAddress ) {this.emailAddress = emailAddress;}
    public void setUniqueId (int uniqueId) {this.uniqueId = uniqueId;}



}
