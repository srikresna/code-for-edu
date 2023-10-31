public class Film {
    String id, judul;
    double rating;
    Film prev, next;

    public Film(Film prev, String id, String judul, double rating, Film next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }
}
