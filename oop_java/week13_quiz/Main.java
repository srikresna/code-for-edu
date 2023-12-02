package oop_java.week13_quiz;

public class Main {
    public static void main(String[] args) {
        // buat objek mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", "123456789", new int[]{80, 90, 70});
        Mahasiswa mahasiswa2 = new Mahasiswa("Andi", "987654321", new int[]{90, 80, 70});
        // buat objek mata kuliah
        MataKuliah mataKuliah1 = new MataKuliah("Pemrograman Berorientasi Objek", 3, new int[]{80, 90, 70});
        MataKuliah mataKuliah2 = new MataKuliah("Pemrograman Berbasis Web", 3, new int[]{90, 80, 70});
        // buat objek perwalian
        Perwalian perwalian = new Perwalian();
        perwalian.tambahMahasiswa(mahasiswa1);
        perwalian.tambahMahasiswa(mahasiswa2);
        perwalian.tambahMataKuliah(mataKuliah1);
        perwalian.tambahMataKuliah(mataKuliah2);
        // tampilkan daftar mahasiswa dan mata kuliah
        perwalian.tampilkanDaftarMahasiswa();
    }
}
