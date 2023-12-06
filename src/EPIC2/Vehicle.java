package EPIC2;
public class Vehicle {
    
     
        private String registrationNumber;
        public Vehicle(String registrationNumber, Location location, double driverRating,Vehicles vehicleType) {
        this.registrationNumber = registrationNumber;
        this.location = location;
        this.driverRating = driverRating;
        this.vehicleType = vehicleType;
        this.available = true; // Assuming a newly created Limo is available
    }
     

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    private Location location;
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    private double driverRating;
    public double getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(double driverRating) {
        this.driverRating = driverRating;
    }

    private Vehicles vehicleType;
    public Vehicles getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicles vehicleType) {
        this.vehicleType = vehicleType;
    }

    private boolean available;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    

}
