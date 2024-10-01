class PerangkatElektronik {
    private String merk;
    private String model;
    private int tahunProduksi;

    // No-argument constructor
    public PerangkatElektronik() {
        this.merk = "Unknown";
        this.model = "Unknown";
        this.tahunProduksi = 0;
    }

    // Parameterized constructor
    public PerangkatElektronik(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    // Getters and Setters
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    // Method to display device information
    public void infoPerangkat() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }
}
