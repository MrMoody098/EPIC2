package EPIC2;

public class Limo implements Vehicle {
    private String registrationNumber;
    private Location location;
    private double driverRating;
    private String vehicleType;
    private boolean available;

    public Limo(String registrationNumber, Location location, double driverRating) {
        this.registrationNumber = registrationNumber;
        this.location = location;
        this.driverRating = driverRating;
        this.vehicleType = "Limo";
        this.available = true; // Assuming a newly created Limo is available
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

    // Implement other methods as needed
}
