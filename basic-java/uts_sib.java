import java.util.Scanner;

public class uts_sib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int perJam = 7000;
        int biaya = 0;
        double diskon = 0;
        boolean programJalan = true;

        while (programJalan) {
            System.out.println("PROGRAM PEMINJAMAN SEPEDA MOTOR");
            System.out.println("================================");
            System.out.print("Masukkan nama peminjam = ");
            String nama = sc.nextLine();
            System.out.print("Masukkan jenis kartu identitas (KTM/KTP) = ");
            String kartu = sc.nextLine();
            System.out.print("Masukkan lama peminjaman (jam) = ");
            int lama = sc.nextInt();
            sc.nextLine();

            if (kartu.equalsIgnoreCase("KTM")) {
                diskon = 0.02;
                if (lama < 2) {
                    biaya += 3000;
                } else {
                    biaya += 0;
                }
            } else {
                diskon = 0;
            }

            if (nama.equalsIgnoreCase("Sudi")) {
                diskon = 0.03;
            } else {
                diskon = 0;
            }

            biaya += lama * perJam;
            biaya -= biaya * diskon;

            System.out.println("================================");
            System.out.println("Nama peminjam = " + nama);
            System.out.println("Jenis kartu identitas = " + kartu);
            System.out.println("Lama peminjaman = " + lama + " jam");
            System.out.println("Biaya yang harus dibayar = Rp. " + biaya);
            System.out.println("Anda mendapat diskon = " + diskon * 100 + "%");
            System.out.println("================================");
            System.out.println("Apakah anda ingin mengulang program? (Y/N)");
            String ulang = sc.next();
            if (ulang.equalsIgnoreCase("N")) {
                programJalan = false;
            }
        }
    }
}