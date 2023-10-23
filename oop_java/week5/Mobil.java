package oop_java.week5;

public class Mobil {
    private String merk;
    private int biaya;

    public Mobil() {
    }

    public Mobil(String merk, int biaya) {
        this.merk = merk;
        this.biaya = biaya;
    }

    public String getMerk() {
        return merk;
    }

    public int getBiaya() {
        return biaya;
    }

    public String setMerk(String merk) {
        return this.merk = merk;
    }

    public int setBiaya(int biaya) {
        return this.biaya = biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }

}
