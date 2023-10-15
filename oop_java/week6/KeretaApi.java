package oop_java.week6;

public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi() {
    }

    public KeretaApi(String nama, String kelas, Pegawai masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public Pegawai getMasinis() {
        return masinis;
    }

    public Pegawai getAsisten() {
        return asisten;
    }

    public String setNama(String nama) {
        return this.nama = nama;
    }

    public String setKelas(String kelas) {
        return this.kelas = kelas;
    }

    public Pegawai setMasinis(Pegawai masinis) {
        return this.masinis = masinis;
    }

    public Pegawai setAsisten(Pegawai asisten) {
        return this.asisten = asisten;
    }

    public String info() {
        String info = "";
        info += "Nama: " + nama + "\n";
        info += "Kelas: " + kelas + "\n";
        info += "Masinis: " + masinis.info() + "\n";
        info += "Asisten: " + asisten.info() + "\n";
        return info;
    }

    public String infoMasinis() {
        String info = "";
        info += "Nama: " + nama + "\n";
        info += "Kelas: " + kelas + "\n";
        info += "Masinis: " + masinis.info() + "\n";
        return info;
    }
}
