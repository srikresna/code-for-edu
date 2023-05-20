package jobsheetDLL;

public class DLLno2 {
    Book top;

    public DLLno2() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(String title) {
        Book newBook = new Book(null, title, null);
        if (isEmpty()) {
            top = newBook;
        } else {
            newBook.next = top;
            top.prev = newBook;
            top = newBook;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot get book");
            return;
        }
        top = top.next;
        if (top != null) {
            top.prev = null;
        }
        System.out.println("----------------------------");
        System.out.println("Book on top has been removed");
        System.out.println("----------------------------");
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("----------------------------");
            System.out.println("Stack is empty, cannot peek book");
            System.out.println("----------------------------");
            return null;
        }
        System.out.println("----------------------------");
        System.out.println("Peek book title from top");
        System.out.println("----------------------------");
        System.out.println(top.bookTitle);
        return top.bookTitle;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("No books in the stack");
            return;
        }
        System.out.println("----------------------------");
        System.out.println("Info all books");
        System.out.println("----------------------------");
        Book current = top;
        while (current != null) {
            System.out.println(current.bookTitle);
            current = current.next;
        }
    }
}