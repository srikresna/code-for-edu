import java.util.Scanner;

public class ListFilmMain {
    public static void main(String[] args) {
        DLL dll = new DLL();
        Scanner sc = new Scanner(System.in);
        dll.addFirst("123", "Anang dari BATAM", 2.77);
        dll.addLast("233", "Suparjo dari JAKARTA", 3.7);
        int choice = 0;

        do {
            System.out.println("=========================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("=========================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating - Descending");
            System.out.println("10. Keluar");
            System.out.println("=========================");
            System.out.print(">> ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Masukkan Data Film");
                    System.out.println("Urutan ke - " + (dll.size() + 1));
                    System.out.println("ID Film: ");
                    String idFilm = sc.next();
                    System.out.println("Judul Film: ");
                    String judulFilm = sc.next();
                    System.out.println("Rating Film: ");
                    double ratingFilm = sc.nextDouble();
                    dll.addFirst(idFilm, judulFilm, ratingFilm);
                    break;
                case 2:
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.println("ID Film: ");
                    String idFilmLast = sc.next();
                    System.out.println("Judul Film: ");
                    String judulFilmLast = sc.next();
                    System.out.println("Rating Film: ");
                    double ratingFilmLast = sc.nextDouble();
                    dll.addLast(idFilmLast, judulFilmLast, ratingFilmLast);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film");
                    System.out.println("Urutan ke - " + (dll.size() + 1));
                    System.out.println("ID Film: ");
                    String idFilmIndex = sc.next();
                    System.out.println("Judul Film: ");
                    String judulFilmIndex = sc.next();
                    System.out.println("Rating Film: ");
                    double ratingFilmIndex = sc.nextDouble();
                    System.out.print("Index: ");
                    int index = sc.nextInt();
                    dll.addAtIndex(idFilmIndex, judulFilmIndex, ratingFilmIndex, index);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Index: ");
                    int removeIndex = sc.nextInt();
                    dll.removeAt(removeIndex);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.println("Cari Data");
                    System.out.println("Masukkan ID Film yang dicari: ");
                    String idFilmSearch = sc.next();
                    System.out.println("Data id film " + idFilmSearch + " ditemukan pada index ke-" + dll.searchID(idFilmSearch));
                    break;
                case 9:
                    dll.sortDescRating();
                    dll.print();
                    break;
                case 10:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 10);
    }
}
