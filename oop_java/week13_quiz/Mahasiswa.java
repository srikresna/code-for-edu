package oop_java.week13_quiz;

public class Mahasiswa {
    private String nama, nim;
    private int[] nilai;

    public Mahasiswa(String nama, String nim, int[] nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public double hitung_ipk() {
        double total = 0;
        // hitung total nilai
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total / nilai.length;
    }

    public double hitung_ipk(int[] nilai_sks) {
        // buat variabel dan inisialisasi nilai awal
        double total = 0;
        int total_sks = 0;
        for (int i = 0; i < nilai.length; i++) {
            // kalikan nilai dengan bobot sks
            total += nilai[i] * nilai_sks[i];
            total_sks += nilai_sks[i];
        }
        return total / total_sks;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int[] getNilai() {
        return nilai;
    }
}
