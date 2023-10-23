package oop_java.week5;

public class Pegawai {
    private String nip;
    private String nama;

    public Pegawai() {
    }

    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String setNip(String nip) {
        return this.nip = nip;
    }

    public String setNama(String nama) {
        return this.nama = nama;
    }

    public String info() { String info = "";
        info += "NIP: " + nip + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
