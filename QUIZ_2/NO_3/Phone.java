// Phone Class - Subclass of ElectronicDevice
class Phone extends ElectronicDevice {

    public Phone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turning on...");
    }
}
