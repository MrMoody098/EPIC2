package EPIC2;
public class Taxi implements Vehicle {
    private String registrationNumber;
    private Location location;
    

    public Taxi(String registrationNumber, Location location) {
        this.registrationNumber = registrationNumber;
        this.location = location;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public Location getLocation() {
        return location;
    }

        //IGNORE THIS FOR NOW JUST IMPLEMETED MISSING METHODS
    @Override
    public double getDriverRating() {
        // TODO Auto-generated method stub
        return getDriverRating();
    }

    @Override
    public String getVehicleType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getVehicleType'");
    }

    @Override
    public boolean isAvailable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAvailable'");
    }

    // Add other taxi-related methods as needed
}