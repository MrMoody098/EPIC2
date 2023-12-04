package EPIC2;

import java.util.List;

public class TaxiApp implements VehicleHiringTest {
    public static void main (String[] args){
        System.err.println("lala");
    }
    private List<Vehicle> vehicles; // Assuming a list to store vehicles

    // Implement methods from VehicleHiringTest interface
    // ...

    // Additional methods for managing the application logic
    public void assignTaxiToPassenger(Passenger passenger) {
        // Implement logic to find and assign a taxi to a passenger
    }

        //IGNORE THIS AS WELL FOR NOW
    @Override
    public boolean testAddToMap(String reg, Location loc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testAddToMap'");
    }

    @Override
    public boolean testMoveVehicle(String reg, Location loc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testMoveVehicle'");
    }

    @Override
    public boolean testRemoveVehicle(String reg) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testRemoveVehicle'");
    }

    @Override
    public Location testGetVehicleLoc(String reg) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testGetVehicleLoc'");
    }

    @Override
    public List<String> testGetVehiclesInRange(Location loc, int r) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'testGetVehiclesInRange'");
    }

    // Add other methods as needed
}
