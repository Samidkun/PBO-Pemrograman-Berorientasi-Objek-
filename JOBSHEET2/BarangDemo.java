public class BarangDemo {
    public static void main(String[] args) {
        // Menginisialisasi objek Barang
        Barang barang1 = new Barang("ATK01", "Bolpoin Pilot Hitam", 3500.0, 0.1);
        Barang barang2 = new Barang("ATK02", "Pensil HB", 1500.0, 0.05);

        // Menampilkan informasi barang pertama
        System.out.println("Informasi Barang 1:");
        barang1.displayInfo();

        // Menampilkan informasi barang kedua
        System.out.println("\nInformasi Barang 2:");
        barang2.displayInfo();

        // Mengupdate atribut
        barang1.hargaKotor = 4000.0;
        barang1.diskon = 0.2;
        barang2.nama = "Pensil 2B";

        // Menampilkan informasi setelah update
        System.out.println("\nInformasi Barang 1 Setelah Update:");
        barang1.displayInfo();

        System.out.println("\nInformasi Barang 2 Setelah Update:");
        barang2.displayInfo();
    }
}
