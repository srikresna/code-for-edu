package oop_java.week13_quiz;
import java.util.ArrayList;
import java.util.List;


public class Perwalian {
    private List<Mahasiswa> mahasiswas;
    private List<MataKuliah> matakuliahs;

    public Perwalian() {
        this.mahasiswas = new ArrayList<>();
        this.matakuliahs = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswas.add(mahasiswa);
    }

    public void tambahMataKuliah(MataKuliah mataKuliah) {
        this.matakuliahs.add(mataKuliah);
    }

    public void tampilkanDaftarMahasiswa() {
        System.out.println("Daftar Mahasiswa & Mata Kuliah");
        // tampilkan daftar mahasiswa dan mata kuliah
        for (int i = 0; i < mahasiswas.size(); i++) {
            System.out.println("Mahasiswa: " + mahasiswas.get(i).getNama());
            System.out.println("NIM: " + mahasiswas.get(i).getNim());
            System.out.println("IPK: " + mahasiswas.get(i).hitung_ipk());
            System.out.println("Mata Kuliah: " + matakuliahs.get(i).getNama_matakuliah());
            System.out.println("SKS: " + matakuliahs.get(i).getSks());
            System.out.println("Bobot: " + matakuliahs.get(i).hitung_bobot());
            System.out.println();
        }
    }
}
