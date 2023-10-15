package oop_java.week6;

public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public Pelanggan() {
    }

    public Pelanggan(String nama, Mobil mobil, Sopir sopir, int hari) {
        this.nama = nama;
        this.mobil = mobil;
        this.sopir = sopir;
        this.hari = hari;
    }

    public String getNama() {
        return nama;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public int getHari() {
        return hari;
    }

    public String setNama(String nama) {
        return this.nama = nama;
    }

    public Mobil setMobil(Mobil mobil) {
        return this.mobil = mobil;
    }

    public Sopir setSopir(Sopir sopir) {
        return this.sopir = sopir;
    }

    public int setHari(int hari) {
        return this.hari = hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}
