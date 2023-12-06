package EPIC2;
public class Request {
    private Location destination;
    private Location pickup;
    private String username;
    private Vehicles vehicleType;

    public Request(Location destination, Location pickup, String username, Vehicles vehicleType) {
        this.destination = destination;
        this.pickup = pickup;
        this.username = username;
        this.vehicleType = vehicleType;
    }
    
}
