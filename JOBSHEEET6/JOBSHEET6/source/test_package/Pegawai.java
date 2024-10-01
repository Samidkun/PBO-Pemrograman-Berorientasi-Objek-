package source.test_package;

public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    // New constructor
    public Pegawai(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
        System.out.println("Objek dari class Pegawai dibuat");
    }

    public String getInfo() {
        String info = "";
        info += "NIP       : " + nip + "\n";
        info += "Nama      : " + nama + "\n";
        info += "Gaji      : " + gaji + "\n";
        return info;
    }
}
