public class Demo {
    public static void main(String[] args) {
        // Instantiate the Laptop class using the parameterized constructor
        Laptop laptop = new Laptop("Asus", "ZenBook", 2021, 15);
        laptop.infoLaptop(); // Print initial laptop info
        System.out.println();

        // Instantiate the Smartphone class using the parameterized constructor
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21", 2021, 4000);
        smartphone.infoSmartphone(); // Print initial smartphone info
        System.out.println();

        // Modify the attribute values
        laptop.setUkuranLayar(17);
        smartphone.setKapasitasBaterai(4500);
        smartphone.setMerk("Xiaomi"); // Modify inherited attribute

        // Print modified laptop info
        System.out.println("Modified Laptop Info");
        laptop.infoLaptop();
        System.out.println();

        // Print modified smartphone info
        System.out.println("Modified Smartphone Info");
        smartphone.infoSmartphone();
    }
}
