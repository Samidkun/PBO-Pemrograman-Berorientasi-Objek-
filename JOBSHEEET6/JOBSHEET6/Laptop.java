class Laptop extends PerangkatElektronik {
    private int ukuranLayar; // Size in inches

    // No-argument constructor
    public Laptop() {
        super(); // Call the parent class no-argument constructor
        this.ukuranLayar = 0;
    }

    // Parameterized constructor
    public Laptop(String merk, String model, int tahunProduksi, int ukuranLayar) {
        super(merk, model, tahunProduksi); // Call the parent class parameterized constructor
        this.ukuranLayar = ukuranLayar;
    }

    // Getters and Setters
    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    // Method to display laptop information
    public void infoLaptop() {
        infoPerangkat(); // Call the parent class method
        System.out.println("Ukuran Layar: " + ukuranLayar + " inches");
    }
}
