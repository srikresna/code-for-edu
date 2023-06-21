package jobsheetCollection.assignment;

public class MataKuliah {
    String kode, mataKuliah, sks;

    public MataKuliah(String kode, String mataKuliah, String sks) {
        this.kode = kode;
        this.mataKuliah = mataKuliah;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public String getSks() {
        return sks;
    }
}
