public class Barang {
    // Atribut
    String kode;
    String nama;
    double hargaKotor;
    double diskon;

    // Konstruktor
    public Barang(String kode, String nama, double hargaKotor, double diskon) {
        this.kode = kode;
        this.nama = nama;
        this.hargaKotor = hargaKotor;
        this.diskon = diskon;
    }

    // Metode untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga Kotor: " + hargaKotor);
        System.out.println("Diskon: " + (diskon * 100) + "%");
        System.out.println("Harga Setelah Diskon: " + getHargaBersih());
    }

    // Metode untuk mendapatkan harga bersih setelah diskon
    public double getHargaBersih() {
        return hargaKotor - (diskon * hargaKotor);
    }
}
