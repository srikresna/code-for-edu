package jobsheetStacking;

public class BookStack {
    int size;
    int top;
    Book data[];

    public BookStack(int size) {
        this.size = size;
        data = new Book[size];
        top = -1;
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(Book dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack is full");
        }
    }
    public void pop() {
        if (!isEmpty()) {
            Book x = data[top];
            top--;
            System.out.println("Remove data : " + x.title + " " + x.authorName + " " + x.publishedYear + " " + x.pagesAmount + " " + x.price);
        } else {
            System.out.println("Stack is empty");
        }
    }
    public void peek() {
        System.out.println("Top data : " + data[top]);
    }
    public void print() {
        System.out.println("Data in stack : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].title + " " + data[i].authorName + " " + data[i].publishedYear + " " + data[i].pagesAmount + " " + data[i].price);
        }
        System.out.println("");
    }
    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack is now empty");
        } else {
            System.out.println("Failed ! Stack is still empty ");
        }
    }
}
