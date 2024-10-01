package source.inheritence;

import source.test_package.Pegawai;

public class Dosen extends Pegawai {
    public String nidn;

    // Modified constructor
    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji); // Call the constructor of Pegawai
        this.nidn = nidn;
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += "NIDN      : " + this.nidn + "\n";
        return info;
    }
}
