public class Barang {
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;

    Barang(){
    }
    Barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    void tampilBarang(){
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Jenis Barang: " + jenisBarang);
        System.out.println("Stok: " + stok);
        System.out.println("Harga Satuan: " + hargaSatuan);
    }
    void tambahStok(int n){

        stok += n;
    }
    void kurangiStok(int n){
        if (stok >= n) {
            stok -= n;
        } else {
            System.out.println("Not enough stock");
        }
    }
    int hitungHargaTotal(int jumlah){

        return jumlah * hargaSatuan;
    }
}
