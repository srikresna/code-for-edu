package jobsheetDLL;

public class Book {
    String bookTitle;
    Book next, prev;

    public Book (Book prev, String title, Book next) {
        this.prev = prev;
        this.bookTitle = title;
        this.next = next;
    }
}
