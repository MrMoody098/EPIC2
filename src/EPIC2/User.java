package EPIC2;

public class User {
    private String name;
    private Location currentLocation;
//basic info
    public User(String name, Location currentLocation) {
        this.name = name;
        this.currentLocation = currentLocation;

    }
    // request ride that sets our pickup and destination
    public Request makeRequest(Location destination,Location pickupLocation,Vehicles vehicles){
        //destination, pickup loc, time, vehicle 
        //when calling this function if the pickupLocation is entered as null we will use the User currentLocation as pickup
        if(pickupLocation == null){
            pickupLocation = currentLocation;
        }
        return new Request(pickupLocation,destination , name, vehicles);
    }
}
