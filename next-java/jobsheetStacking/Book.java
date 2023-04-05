package jobsheetStacking;

public class Book {
    String title, authorName;
    int publishedYear, pagesAmount, price;

    public Book(String tt, String nm, int yr, int pam, int pr) {
        this.title = tt;
        this.authorName = nm;
        this.publishedYear = yr;
        this.pagesAmount = pam;
        this.price = pr;
    }
}
