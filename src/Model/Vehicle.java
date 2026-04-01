package Model;

public class Vehicle {
    private int vehicleId;
    private String model;
    private String type;
    private double pricePerDay;
    private boolean isAvailable;

    public Vehicle(int vehicleId, String model, String type, double pricePerDay) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.type = type;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

    public int getVehicleId() {
        return vehicleId;
    }
    public String getModel() {
        return model;
    }
    public double getPricePerDay() {
        return pricePerDay;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
