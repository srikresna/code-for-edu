package oop_java.week7.Tugas;

public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;
    private int gaji;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return gaji;
    }

    
}
