package jobsheetCollection.assignment;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static Queue<Mahasiswa> mahasiswas = new LinkedList<>();
    static Queue<MataKuliah> mataKuliahs = new LinkedList<>();
    static Queue<Nilai> nilais = new LinkedList<>();

    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("Menu");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Hapus Data Nilai");
        System.out.println("6. Keluar");
        System.out.print("Pilih: ");
    }

    static void inputNilai() {
        System.out.println("--- INPUT NILAI ---");
        System.out.print("Masukkan nilai : ");
        double nilai = sc.nextDouble();
        sc.nextLine();
        // print daftar mahasiswa
        System.out.println("DAFTAR MAHASISWA");
        System.out.println("**********************************************************************");
        System.out.println("NIM          Nama                 Telf");
        // print mahasiswa data
        mahasiswas.forEach((mhs) -> {
            System.out.printf("%-3s          %-10s          %-10s\n", mhs.getNim(), mhs.getNama(), mhs.getTelf());
        });
        System.out.println("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        // print daftar mata kuliah
        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("**********************************************************************");
        System.out.println("Kode          Mata Kuliah          SKS");
        // print mata kuliah data
        mataKuliahs.forEach((mk) -> {
            System.out.printf("%-5s          %-10s          %-2s\n", mk.getKode(), mk.getMataKuliah(), mk.getSks());
        });
        System.out.println("Masukkan Kode Mata Kuliah : ");
        String kode = sc.nextLine();

        // get nama mahasiswa
        String nama = "";
        for (Mahasiswa mhs : mahasiswas) {
            if (mhs.getNim().equals(nim)) {
                nama = mhs.getNama();
            }
        }

        // get mata kuliah
        String mataKuliah = "";
        String sks = "";
        for (MataKuliah mk : mataKuliahs) {
            if (mk.getKode().equals(kode)) {
                mataKuliah = mk.getMataKuliah();
                sks = mk.getSks();
            }
        }

        // add nilai
        nilais.add(new Nilai(nim, nama, mataKuliah, sks, nilai));
    }

    static void tampilNilai() {
        // print daftar nilai
        System.out.println("DAFTAR NILAI");
        System.out.println("***********************************************************************");
        System.out.println("NIM            Nama              Mata Kuliah            SKS         Nilai");
        // print nilai data
        nilais.forEach((n) -> {
            System.out.printf("%-5s          %-10s          %-10s          %-2s          %-4s\n", n.getNim(),
                    n.getNama(), n.getMataKuliah(), n.getSks(), n.getNilai());
        });

    }

    static void cariNilai() {
        tampilNilai();
        System.out.println("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        // pencarian menggunakan sequential search
        boolean found = false;
        for (Nilai n : nilais) {
            if (n.getNim().equals(nim)) {
                System.out.println("NIM            Nama              Mata Kuliah            SKS         Nilai");
                System.out.printf("%-5s          %-10s          %-10s          %-2s          %-4s\n", n.getNim(),
                        n.getNama(), n.getMataKuliah(), n.getSks(), n.getNilai());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }

    static void sortData() {
        // sorting menggunakan bubble sort
        Nilai[] nilaiArr = new Nilai[nilais.size()];
        int i = 0;
        for (Nilai n : nilais) {
            nilaiArr[i] = n;
            i++;
        }
        for (int j = 0; j < nilaiArr.length - 1; j++) {
            for (int k = 0; k < nilaiArr.length - j - 1; k++) {
                if (nilaiArr[k].getNilai() < nilaiArr[k + 1].getNilai()) {
                    Nilai temp = nilaiArr[k];
                    nilaiArr[k] = nilaiArr[k + 1];
                    nilaiArr[k + 1] = temp;
                }
            }
        }
        // apply ke nilais
        nilais.clear();
        for (Nilai n : nilaiArr) {
            nilais.add(n);
        }

    }

    static void hapusData() {
        tampilNilai();
        System.out.println("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();
        // pencarian menggunakan sequential search
        boolean found = false;
        for (Nilai n : nilais) {
            if (n.getNim().equals(nim)) {
                nilais.remove(n);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        // populating mahasiswa data
        mahasiswas.add(new Mahasiswa("123", "Budi", "08123456789"));
        mahasiswas.add(new Mahasiswa("124", "Andi", "08123456789"));
        mahasiswas.add(new Mahasiswa("125", "Caca", "08123456789"));
        mahasiswas.add(new Mahasiswa("126", "Dedi", "08123456789"));

        // populating mata kuliah data
        mataKuliahs.add(new MataKuliah("MK001", "IOT", "3"));
        mataKuliahs.add(new MataKuliah("MK002", "WEB", "3"));
        mataKuliahs.add(new MataKuliah("MK003", "AI", "3"));
        mataKuliahs.add(new MataKuliah("MK004", "ML", "3"));

        // populating nilai data
        nilais.add(new Nilai("123", "Budi", "AI", "3", 90));
        nilais.add(new Nilai("124", "Andi", "ML", "3", 80));

        int pilih = 0;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilai();
                    break;
                case 4:
                    sortData();
                    break;
                case 5:
                    hapusData();
                    break;
                case 6:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }
        } while (pilih != 6);
    }
}
