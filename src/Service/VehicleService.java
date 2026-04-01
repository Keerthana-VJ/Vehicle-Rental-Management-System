package Service;

import Model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleService {
    public static List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void showAvailableVehicles() {
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                System.out.println(v.getVehicleId() + " - " + v.getModel() + " - ₹" + v.getPricePerDay());
            }
        }
    }

    public Vehicle getVehicle(int id) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == id) return v;
        }
        return null;
    }
}
