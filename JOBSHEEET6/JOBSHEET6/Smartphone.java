class Smartphone extends PerangkatElektronik {
    private int kapasitasBaterai; // Capacity in mAh

    // No-argument constructor
    public Smartphone() {
        super(); // Call the parent class no-argument constructor
        this.kapasitasBaterai = 0;
    }

    // Parameterized constructor
    public Smartphone(String merk, String model, int tahunProduksi, int kapasitasBaterai) {
        super(merk, model, tahunProduksi); // Call the parent class parameterized constructor
        this.kapasitasBaterai = kapasitasBaterai;
    }

    // Getters and Setters
    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    // Method to display smartphone information
    public void infoSmartphone() {
        infoPerangkat(); // Call the parent class method
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + " mAh");
    }
}
