package oop_java.week6.Tugas;

public class DaftarGaji{
    Pegawai[] listPegawai;

    public DaftarGaji(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
    }

    public void addPegawai(Pegawai pegawai) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                listPegawai[i] = pegawai;
                break;
            }
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] != null) {
                System.out.println("Nama: " + listPegawai[i].getNama());
                System.out.println("Gaji: " + listPegawai[i].getGaji());
                System.out.println();
            }
        }
    }
}
