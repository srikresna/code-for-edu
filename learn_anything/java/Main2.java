package learn_anything.java;

import java.util.Scanner;

public class Main2 {
    // memanfaatkan konsep queue
    // terdapat class pembeli dan class pesanan
    // Pada sistem informasi antrian pembeli pada resto royal delish yang dibuat
    // terdapat menu
    // 1. tambah antrian
    // 2. cetak antrian
    // 3. hapus antrian, maka pembeli akan input makanan yang dipesan oleh pembeli
    // 4. laporan pengurutan pesanan by nama
    // 5. hitung total pendapatan
    // 6. keluar

    public static void main(String[] args) {
        System.out.println("dibuat oleh : ");
        System.out.println("NIM :");
        System.out.println("Absen :");
        System.out.println("=========================================");
        System.out.println("Sistem Antrian Resto Royal Delish");

        int pilih;
        Scanner input = new Scanner(System.in);
        Queue q = new Queue(20);
        Pesanan data[] = new Pesanan[20];

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan Pesanan by Nama");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nomor Antrian :");
                    String noAntrian = input.nextLine();
                    System.out.print("Masukkan nama pembeli : ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan nomor telepon : ");
                    String noTelp = input.nextLine();
                    Pembeli pembeli = new Pembeli(nama, noTelp, noAntrian);
                    q.Enqueue(pembeli);
                    break;
                case 2:
                    q.print();
                    break;
                case 3:
                    q.Dequeue();
                    System.out.println("--- Transaksi Pesanan ---");
                    System.out.print("Masukkan nomor pesanan : ");
                    int kodePesanan = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan nama pesanan : ");
                    String namaPesanan = input.nextLine();
                    System.out.print("Masukkan harga pesanan : ");
                    int harga = input.nextInt();
                    input.nextLine();
                    Pesanan pesanan = new Pesanan(kodePesanan, namaPesanan, harga);
                    q.addPesanan(pesanan);
                    q.printPesanan();
                    break;
                case 4:
                    q.sort(data);
                    q.printPesanan();
                    break;
                case 5:
                    System.out.println("Total Pendapatan : " + q.totalPendapatan());
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }

    }
}
