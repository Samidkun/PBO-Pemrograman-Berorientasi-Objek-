import java.util.ArrayList;
import java.util.List;

public class PolymorphismExample {

    public static void main(String[] args) {

        // Heterogeneous Collection: List that stores different types of ElectronicDevices
        List<ElectronicDevice> devices = new ArrayList<>();
        devices.add(new Phone("Apple", "iPhone 13"));
        devices.add(new Laptop("Dell", "XPS 13"));
        devices.add(new Tablet("Samsung", "Galaxy Tab S6"));

        // Iterating over the list to call methods (Polymorphic Arguments)
        for (ElectronicDevice device : devices) {
            device.turnOn();  // Polymorphic method call
            device.displayDetails();  // Common method for all devices
        }

        // Demonstrating Object Casting (Casting a superclass object to a subclass)
        ElectronicDevice myDevice = new Laptop("HP", "Pavilion");
        if (myDevice instanceof Laptop) {
            Laptop laptop = (Laptop) myDevice; // Casting to subclass
            System.out.println("Casted to Laptop: " + laptop.brand + " " + laptop.model);
        }

        // Using instanceof to check the type at runtime
        for (ElectronicDevice device : devices) {
            if (device instanceof Phone) {
                System.out.println(device.brand + " is a Phone.");
            } else if (device instanceof Laptop) {
                System.out.println(device.brand + " is a Laptop.");
            } else if (device instanceof Tablet) {
                System.out.println(device.brand + " is a Tablet.");
            }
        }
    }
}