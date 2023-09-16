package oop_java.week3;

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        boolean menu = true;

        while (menu) {
            System.out.println("Menu:");
            System.out.println("1. Pinjam");
            System.out.println("2. Angsur");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jumlah pinjaman: ");
                    int pinjam = sc.nextInt();
                    donny.pinjam(pinjam);
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                case 2:
                    System.out.print("Masukkan jumlah angsuran: ");
                    int angsur = sc.nextInt();
                    donny.angsur(angsur);
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                case 3:
                    menu = false;
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
                    break;
            }
        }
    }
}
