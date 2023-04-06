package jobsheetStacking;

public class Book {
    String title, authorName;
    int publishedYear, pagesAmount, price;

    public Book(String title, String authorName, int publishedYear, int pagesAmount, int price) {
        this.title = title;
        this.authorName = authorName;
        this.publishedYear = publishedYear;
        this.pagesAmount = pagesAmount;
        this.price = price;
    }
}
