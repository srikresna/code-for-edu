public class Buku {
    private String ISBN, judul;
    private Penulis penulis;
    private int harga;

    public Buku(String ISBN, String judul, Penulis penulis, int harga) {
        this.ISBN = ISBN;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        if (harga < 0) {
            this.harga = 0;
        } else {
            this.harga = harga;
        }
    }

    public String getPenulis() {
        return penulis.getNama();
    }

    public void setPenulis(String penulis) {
        this.penulis.setNama(penulis);
    }

}
