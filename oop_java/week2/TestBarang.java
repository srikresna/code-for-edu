package oop_java.week2;

public class TestBarang {
    public static void main(String[] args) {
        Barang2 brg1=new Barang2();
        brg1.namaBrg="Pensil";
        brg1.jenisBrg="ATK";
        brg1.stok=10;
        brg1.tampilBarang();
        // menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok baru adalah " + brg1.tambahStok(20));
    }
}
