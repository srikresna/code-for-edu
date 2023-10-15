package oop_java.week7.Tugas;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(10);
        Dosen dosen1 = new Dosen("123", "Dosen 1", "Alamat 1");
        Dosen dosen2 = new Dosen("456", "Dosen 2", "Alamat 2");
        Dosen dosen3 = new Dosen("789", "Dosen 3", "Alamat 3");
        dosen1.setSKS(10);
        dosen2.setSKS(20);
        dosen3.setSKS(30);
        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);
        daftarGaji.addPegawai(dosen3);
        daftarGaji.printSemuaGaji();
    }
}