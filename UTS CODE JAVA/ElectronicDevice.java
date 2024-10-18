public class ElectronicDevice {
    // Attributes
    private String brand;
    private String model;
    private double weight;
    private int batteryCapacity;
    private boolean powerStatus;

    // Constructor
    public ElectronicDevice(String brand, String model, double weight, int batteryCapacity, boolean powerStatus) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.batteryCapacity = batteryCapacity;
        this.powerStatus = powerStatus;
    }

    // Methods
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
        System.out.println("Power Status: " + (powerStatus ? "On" : "Off"));
    }

    public void turnOn() {
        powerStatus = true;
        System.out.println("The device is now ON.");
    }

    public void turnOff() {
        powerStatus = false;
        System.out.println("The device is now OFF.");
    }
}

