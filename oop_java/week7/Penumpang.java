package oop_java.week7;

public class Penumpang {
    private String ktp, nama;

    public Penumpang() {
    }

    public Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public String getKtp() {
        return ktp;
    }

    public String getNama() {
        return nama;
    }

    public String setKtp(String ktp) {
        return this.ktp = ktp;
    }

    public String setNama(String nama) {
        return this.nama = nama;
    }

    public String info() {
        String info = "";
        info += "KTP: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
