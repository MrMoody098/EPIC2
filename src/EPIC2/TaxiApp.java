package EPIC2;

import java.util.List;

public class TaxiApp implements VehicleHiringTest {
    public static void main (String[] args){
        System.out.println("lala");
    }
    private List<Vehicle> vehicles; // Assuming a list to store vehicles

    
    public void assignTaxiToPassenger(Passenger passenger) {
        //Vehicle (x,y) compared to passenger (x,y)
    }

        //IGNORE THIS AS WELL FOR NOW PLEASE
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
