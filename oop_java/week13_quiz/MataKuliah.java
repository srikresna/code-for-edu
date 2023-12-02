package oop_java.week13_quiz;

public class MataKuliah {
    private String nama_matakuliah;
    private int sks;
    private int[] nilai_mahasiswa;

    public MataKuliah(String nama_matakuliah, int sks, int[] nilai_mahasiswa) {
        this.nama_matakuliah = nama_matakuliah;
        this.sks = sks;
        this.nilai_mahasiswa = nilai_mahasiswa;
    }

    public double hitung_bobot() {
        double totalBobot = 0;
        // hitung total nilai
        for (int i = 0; i < nilai_mahasiswa.length; i++) {
            totalBobot += nilai_mahasiswa[i];
        }
        return totalBobot / nilai_mahasiswa.length;
    }

    public double hitung_bobot(int bobot_mahasiswa) {
        double totalBobot = 0;
        int total_sks = 0;
        for (int i = 0; i < nilai_mahasiswa.length; i++) {
            // kalikan nilai dengan bobot sks
            totalBobot += nilai_mahasiswa[i] * bobot_mahasiswa;
            total_sks += bobot_mahasiswa;
        }
        return totalBobot / total_sks;
    }

    public String getNama_matakuliah() {
        return nama_matakuliah;
    }

    public int getSks() {
        return sks;
    }

    public int[] getNilai_mahasiswa() {
        return nilai_mahasiswa;
    }
    
}
