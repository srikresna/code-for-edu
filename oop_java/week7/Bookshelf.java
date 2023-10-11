package oop_java.week7;


public class Bookshelf {
    private String location;
    private int capacity;
    private Book[] books;

    public Bookshelf(String location, int capacity, Book[] books) {
        this.location = location;
        this.capacity = capacity;
        this.books = books;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public Book[] getBooks() {
        return books;
    }   

    public String setLocation(String location) {
        return this.location = location;
    }

    public int setCapacity(int capacity) {
        return this.capacity = capacity;
    }

    public Book[] setBooks(Book[] books) {
        return this.books = books;
    }

    public void addBook(Book book) {
        if (books == null) {
            books = new Book[capacity];
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    public void removeBook(Book book) {
        if (books == null) {
            return;
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                books[i] = null;
                break;
            }
        }
    }

}
