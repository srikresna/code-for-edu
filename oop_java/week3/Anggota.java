package oop_java.week3;

public class Anggota {
    private String nama;
    private String alamat;
    private float simpanan;

    Anggota(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public float getSimpanan() {
        return this.simpanan;
    }

    public void setor(float uang) {
        this.simpanan += uang;
    }

    public void pinjam(float uang) {
        this.simpanan -= uang;
    }
}
