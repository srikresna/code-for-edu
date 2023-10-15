package oop_java.week7.Tugas;

public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int TARIF_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        TARIF_SKS = 100000;
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }

}
