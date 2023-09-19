import java.util.Scanner;

public class TransactionMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berapa banyak pesanan anda = ");
        int banyakPesanan = sc.nextInt();
        Transaction[] transactions = new Transaction[banyakPesanan];

        for (int i = 0; i < transactions.length; i++) {
            System.out.print("Masukkan nama item " + (i + 1) + " = ");
            String namaItem = sc.next();
            System.out.print("Masukkan jumlah item " + (i + 1) + " = ");
            int jumlahItem = sc.nextInt();
            System.out.print("Masukkan harga item " + (i + 1) + " = ");
            int hargaItem = sc.nextInt();
            transactions[i] = new Transaction(namaItem, jumlahItem, hargaItem);
        }

        boolean menu = true;

        while (menu) {
            System.out.println("----- SUPERMARKET PENJAJAH 2M (MADURA MINANG) -----");
            System.out.println("1. Check order");
            System.out.println("2. Update item name");
            System.out.println("3. Update item qty");
            System.out.println("4. Update item price");
            System.out.println("5. Delete item");
            System.out.println("6. Reset transaction");
            System.out.println("7. Print order");
            System.out.println("8. Checkout");
            System.out.println("9. Exit");
            System.out.print("Masukkan pilihan anda = ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    for (int i = 0; i < transactions.length; i++) {
                        transactions[i].check_order();
                    }
                    break;
                case 2:
                    System.out.print("Masukkan nama item yang ingin diubah = ");
                    String namaItem = sc.next();
                    System.out.print("Masukkan nama item baru = ");
                    String namaItemBaru = sc.next();
                    for (int i = 0; i < transactions.length; i++) {
                        if (transactions[i].namaItem.equals(namaItem)) {
                            transactions[i].update_item_name(namaItem, namaItemBaru);
                        } else {
                            System.out.println("Item tidak ditemukan");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nama item yang ingin diubah = ");
                    String namaItem2 = sc.next();
                    System.out.print("Masukkan jumlah item baru = ");
                    int jumlahItemBaru = sc.nextInt();
                    for (int i = 0; i < transactions.length; i++) {
                        if (transactions[i].namaItem.equals(namaItem2)) {
                            transactions[i].update_item_qty(namaItem2, jumlahItemBaru);
                        } else {
                            System.out.println("Item tidak ditemukan");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama item yang ingin diubah = ");
                    String namaItem3 = sc.next();
                    System.out.print("Masukkan harga item baru = ");
                    int hargaItemBaru = sc.nextInt();
                    for (int i = 0; i < transactions.length; i++) {
                        if (transactions[i].namaItem.equals(namaItem3)) {
                            transactions[i].update_item_price(namaItem3, hargaItemBaru);
                        } else {
                            System.out.println("Item tidak ditemukan");
                        }
                    }
                    break;
                case 5:
                    System.out.print("Masukkan nama item yang ingin dihapus = ");
                    String namaItem4 = sc.next();
                    for (int i = 0; i < transactions.length; i++) {
                        if (transactions[i].namaItem.equals(namaItem4)) {
                            transactions[i].delete_item(namaItem4);
                        } else {
                            System.out.println("Item tidak ditemukan");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Apakah anda ingin mereset seluruh pesanan ? (y/n) = ");
                    String yesNo = sc.nextLine();
                    if (yesNo.equals("y")) {
                        for (int i = 0; i < transactions.length; i++) {
                            transactions[i].reset_transaction();
                        }
                    } else {
                        System.out.println("Pesanan tidak direset");
                    }
                case 7:
                    for (int i = 0; i < transactions.length; i++) {
                        transactions[i].print_order();
                    }
                    break;
                case 8:
                    int total = 0;
                    for (int i = 0; i < transactions.length; i++) {
                        total += transactions[i].jumlahItem * transactions[i].hargaItem;
                    }
                    if (total > 500000) {
                        System.out.println("Anda mendapatkan diskon 10%");
                    } else if (total > 300000) {
                        System.out.println("Anda mendapatkan diskon 8%");
                    } else if (total > 200000) {
                        System.out.println("Anda mendapatkan diskon 5%");
                    } else if (total < 200000) {
                        System.out.println("Anda tidak mendapatkan diskon");
                    }
                    System.out.println("---------------------------------------------");
                    System.out.println("Total harga = " + total_price(total));
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        }

    }

    // method total_price (print total harga)
    // jika total belanja Andi diatas 200.000 maka akan mendapatkan diskon 5%
    // jika total belanja Andi diatas 300.000 maka akan mendapatkan diskon 8%
    // jika total belanja Andi diatas 500.000 maka akan mendapatkan diskon 10%
    static int total_price(int total) {
        if (total > 500000) {
            total = total - (total * 10 / 100);
        } else if (total > 300000) {
            total = total - (total * 8 / 100);
        } else if (total > 200000) {
            total = total - (total * 5 / 100);
        }
        return total;
    }
}
