package oop_java.week7;

public class Sopir {
    private String nama;
    private int biaya;

    public Sopir() {
    }

    public Sopir(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public String getNama() {
        return nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public String setNama(String nama) {
        return this.nama = nama;
    }

    public int setBiaya(int biaya) {
        return this.biaya = biaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}
