package jobsheetCollection.assignment;

public class Nilai {
    String nim, nama, mataKuliah, sks;
    double nilai;

    public Nilai(String nim, String nama, String mataKuliah, String sks, double nilai) {
        this.nim = nim;
        this.nama = nama;
        this.mataKuliah = mataKuliah;
        this.sks = sks;
        this.nilai = nilai;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public String getSks() {
        return sks;
    }

    public double getNilai() {
        return nilai;
    }


}
