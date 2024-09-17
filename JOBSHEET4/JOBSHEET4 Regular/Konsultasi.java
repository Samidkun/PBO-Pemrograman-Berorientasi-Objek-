package RumahSakit;
import java.time.LocalDate;

public class Konsultasi {
    private LocalDate tanggal;
    private Pegawai dokter;
    private Pegawai perawat; // Fixed capitalization

    // Getter for tanggal
    public LocalDate getTanggal() {
        return tanggal;
    }

    // Setter for tanggal
    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    // Getter for dokter
    public Pegawai getDokter() {
        return dokter;
    }

    // Setter for dokter
    public void setDokter(Pegawai dokter) {
        this.dokter = dokter; // Fixed assignment
    }

    // Getter for perawat
    public Pegawai getPerawat() {
        return perawat; // Corrected to return the perawat instance variable
    }

    // Setter for perawat
    public void setPerawat(Pegawai perawat) {
        this.perawat = perawat; // Fixed capitalization and assignment
    }

    // Method to get consultation info
    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ",   Dokter: " + dokter.getInfo();
        info += ",   Perawat: " + perawat.getInfo(); // Fixed capitalization

        return info;
    }
}
