// Tablet Class - Subclass of ElectronicDevice
class Tablet extends ElectronicDevice {

    public Tablet(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Tablet is turning on...");
    }
}