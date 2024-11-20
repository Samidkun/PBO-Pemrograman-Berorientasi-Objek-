import java.util.ArrayList;
import java.util.List;

// Base Class
abstract class ElectronicDevice {
    String brand;
    String model;

    public ElectronicDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Polymorphic method
    public abstract void turnOn();
    
    // Display device details
    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}
