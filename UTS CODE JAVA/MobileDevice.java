public class MobileDevice extends ElectronicDevice {
    // Additional attributes
    private String operatingSystem;
    private double screenSize;
    private String connectivity;
    private int storageCapacity;

    // Constructor
    public MobileDevice(String brand, String model, double weight, int batteryCapacity, boolean powerStatus,
                        String operatingSystem, double screenSize, String connectivity, int storageCapacity) {
        super(brand, model, weight, batteryCapacity, powerStatus); // Call superclass constructor
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
        this.connectivity = connectivity;
        this.storageCapacity = storageCapacity;
    }

    // Methods
    public void displayMobileInfo() {
        super.displayInfo(); // Call the parent class method
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Storage Capacity: " + storageCapacity + " GB");
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to network: " + network);
    }
}
