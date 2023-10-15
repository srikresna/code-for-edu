package oop_java.week6;

public class LibraryIntClass {
    public static void main(String[] args) {
        Book book1 = new Book("The Lord of The Rings", "J.R.R Tolkien", 1954);
        Book book2 = new Book("Harry Potter and The Philosopher's Stone", "J.K Rowling", 1997);
        Book book3 = new Book("The Hobbit", "J.R.R Tolkien", 1937);

        LibraryMember sucipto = new LibraryMember("Sucipto", "123456");
        LibraryMember budi = new LibraryMember("Budi", "654321");

        Librarian pakde = new Librarian("Pakde", "123456789", "001");

        Bookshelf bookshelf1 = new Bookshelf("A1", 10, null);
        Bookshelf bookshelf2 = new Bookshelf("B2", 10, null);

        bookshelf1.addBook(book1);
        bookshelf1.addBook(book2);
        bookshelf2.addBook(book3);

        sucipto.findBook(pakde, book3);
        for (int i = 0; i < bookshelf1.getBooks().length; i++) {
            if (bookshelf1.getBooks()[i] == book3) {
                System.out.println("Book " + book3.getTitle() + " is found in bookshelf " + bookshelf1.getLocation());
                break;
            } else if (bookshelf2.getBooks()[i] == book3) {
                System.out.println("Book " + book3.getTitle() + " is found in bookshelf " + bookshelf2.getLocation());
                break;
            } else {
                System.out.println("Book " + book3.getTitle() + " is not found");
                break;
            }
        }

        System.out.println("=====================================");
        sucipto.borrow(pakde, book1);
        pakde.processBorrow(sucipto, book1);

        System.out.println("=====================================");
        sucipto.returnBook(pakde, book1);
        pakde.processReturn(sucipto, book1);

    }
}