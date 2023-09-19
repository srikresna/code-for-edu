public class Transaction {
    String namaItem;
    int jumlahItem;
    int hargaItem;

    public Transaction(String namaItem, int jumlahItem, int hargaItem) {
        this.namaItem = namaItem;
        this.jumlahItem = jumlahItem;
        this.hargaItem = hargaItem;
    }

    // method update_item_name
    public void update_item_name(String namaItem, String namaItemBaru) {
        this.namaItem = namaItemBaru;
    }

    // method update_item_qty
    public void update_item_qty(String namaItem, int jumlahItemBaru) {
        this.jumlahItem = jumlahItemBaru;
    }

    // method update_item_price
    public void update_item_price(String namaItem, int hargaItemBaru) {
        this.hargaItem = hargaItemBaru;
    }

    // method delete_item
    public void delete_item(String namaItem) {
        if (this.namaItem.equals(namaItem)) {
            this.namaItem = null;
            this.jumlahItem = 0;
            this.hargaItem = 0;
        } else {
            System.out.println("Item tidak ditemukan");
        }
    }

    // method reset_transaction
    public void reset_transaction() {
        this.namaItem = null;
        this.jumlahItem = 0;
        this.hargaItem = 0;
    }

    // method cetak pemesanan apa saja yang dilakukan
    public void print_order() {
        System.out.println("------------- Pesanan --------------");
        System.out.println("Nama Item: " + this.namaItem);
        System.out.println("Jumlah Item: " + this.jumlahItem);
        System.out.println("Harga Item: " + this.hargaItem);
    }

    // method check_order (print "pemesananan sudah benar" jika tidak ada kesalahan
    // input dan "terdapat kesalahan input" jika ada kesalahan input)
    public void check_order() {
        if (this.namaItem == "" || this.jumlahItem == 0 || this.hargaItem == 0) {
            System.out.println("terdapat kesalahan input");
        } else {
            System.out.println("pemesanan sudah benar");
        }

        // cetak pemesanan apa saja yang dilakukan
        print_order();
    }
}
