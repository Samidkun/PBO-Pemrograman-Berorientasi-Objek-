public class Smartphone extends MobileDevice {
    // Additional attributes
    private int cameraMegapixels;
    private boolean fingerprintSensor;
    private boolean is5GEnabled;
    private int numberOfCameras;

    // Constructor
    public Smartphone(String brand, String model, double weight, int batteryCapacity, boolean powerStatus,
                      String operatingSystem, double screenSize, String connectivity, int storageCapacity,
                      int cameraMegapixels, boolean fingerprintSensor, boolean is5GEnabled, int numberOfCameras) {
        super(brand, model, weight, batteryCapacity, powerStatus, operatingSystem, screenSize, connectivity, storageCapacity);
        this.cameraMegapixels = cameraMegapixels;
        this.fingerprintSensor = fingerprintSensor;
        this.is5GEnabled = is5GEnabled;
        this.numberOfCameras = numberOfCameras;
    }

    // Methods
    public void displaySmartphoneInfo() {
        super.displayMobileInfo(); // Call the parent class method
        System.out.println("Camera Megapixels: " + cameraMegapixels + " MP");
        System.out.println("Fingerprint Sensor: " + (fingerprintSensor ? "Yes" : "No"));
        System.out.println("5G Enabled: " + (is5GEnabled ? "Yes" : "No"));
        System.out.println("Number of Cameras: " + numberOfCameras);
    }

    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    public void unlockWithFingerprint() {
        if (fingerprintSensor) {
            System.out.println("Unlocked with fingerprint.");
        } else {
            System.out.println("This device does not have a fingerprint sensor.");
        }
    }
}

