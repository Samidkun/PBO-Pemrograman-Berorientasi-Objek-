// Laptop Class - Subclass of ElectronicDevice
class Laptop extends ElectronicDevice {

    public Laptop(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is turning on...");
    }
}