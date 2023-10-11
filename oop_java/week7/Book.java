package oop_java.week7;


public class Book {
    private String title, author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String setTitle(String title) {
        return this.title = title;
    }

    public String setAuthor(String author) {
        return this.author = author;
    }

    public int setYear(int year) {
        return this.year = year;
    }

    public void getBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}
