package jobsheetSearching;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa mhs = new Mahasiswa();
        mhs.printArray();
        System.out.println("Masukkan nama mahasiswa yang dicari ");
        String cari = sc.nextLine();

        int[] posisi = mhs.usingSequentialSearch(cari);
        if (posisi[0] == -1 && posisi[1] == -1) {
            System.out.println("Data " + cari + " tidak ditemukan");
        } else {
            System.out.println("Mahasiswa bernama " + cari + " berada pada kelompok ke-" + (posisi[0]+1) + "dan urutan ke-" + (posisi[1]+1) + " dalam kelompok");
        }
    }
}
