package RumahSakit;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatKonsultasi;

    // Constructor
    public Pasien(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<Konsultasi>();
    }

    // Getter for noRekamMedis
    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    // Setter for noRekamMedis
    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    // Getter for nama
    public String getNama() {
        return nama;
    }

    // Setter for nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method to add consultation
    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat) {
        Konsultasi konsultasi = new Konsultasi();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }

    // Method to get information about the patient and their consultations
    public String getInfo() {
        String info = "";
        info += "No Rekam Medis     : " + this.noRekamMedis + "\n";
        info += "Nama               : " + this.nama + "\n";

        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi :\n";

            for (Konsultasi konsultasi : riwayatKonsultasi) {
                info += konsultasi.getInfo() + "\n"; // Add new line for each consultation
            }
        } else {
            info += "Belum Ada Riwayat Konsultasi\n";
        }

        return info;
    }
}
