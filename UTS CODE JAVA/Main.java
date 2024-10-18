public class Main {
    public static void main(String[] args) {
        // Create a Smartphone object
        Smartphone myPhone = new Smartphone(
                "Xiaomi", "Redmi Note 12 Pro 4G", 0.169, 5000, false,
                "Android", 6.2, "4G", 128,
                108, true, false, 4
        );

        // Display the smartphone information
        myPhone.displaySmartphoneInfo();

        // Turn on the smartphone
        myPhone.turnOn();

        // Connect to a network
        myPhone.connectToNetwork("Wi-Fi");

        // Take a photo
        myPhone.takePhoto();

        // Unlock the smartphone using fingerprint
        myPhone.unlockWithFingerprint();

        // Turn off the smartphone
        myPhone.turnOff();
    }
}

