import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diskon = 0;
        boolean programJalan = true;
        int biaya;

        while (programJalan) {
            System.out.print("masukan tipe kendaran (2 / 4)");
            int jenis = sc.nextInt();
            System.out.print("masukan nomor plat angka pertama = ");
            String plat1 = sc.next();
            System.out.print("masukan nomor plat angka kedua = ");
            String plat2 = sc.next();
            System.out.print("masukan nomor plat angka ketiga = ");
            String plat3 = sc.next();

            if (plat1.equals("5")) {
                diskon = 0.05;
                System.out.println("anda dapat diskon sejumlah 5%");
            } else {
                System.out.println("tidak dapat diskon");
            }

            if (jenis == 2) {
                biaya = 2000 - (int) (diskon * 2000);
                System.out.println("jumlah diskon anda adalah " + diskon * 2000);
                System.out.println("kendaran anda adalah roda dua dengan biaya parkir sebesar " + biaya);
            } else {
                biaya = 5000 - (int) (diskon * 5000);
                System.out.println("jumlah diskon anda adalah " + diskon * 5000);
                System.out.println("kendaran anda adalah roda empat dengan biaya parkir sebesar " + biaya);
            }
            System.out.println("PLAT NOMOR ANDA ADALAH " + (plat1 + plat2 + plat3));

            System.out.print("Apakah anda ingin mengulang program? (y/n) ");
            String ulang = sc.next();
            if (ulang.equals("y")) {
                programJalan = true;
            } else {
                programJalan = false;
            }
        }
    }
}
