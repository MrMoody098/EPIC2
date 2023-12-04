package EPIC2;

public class Yacht implements Vehicle{
    private String registrationNumber;
    private Location location;
    private double driverRating;
    private String vehicleType;
    private boolean available;

    public Yacht(String registrationNumber, Location location, double driverRating) {
        this.registrationNumber = registrationNumber;
        this.location = location;
        this.driverRating = driverRating;
        this.vehicleType = "Limo";
        this.available = true; 
    
    }
    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public double getDriverRating() {
        return driverRating;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}