package jobsheetStacking;

public class Stack {
    int size, top; 
    Book data[];
        
    public Stack(int size) {
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
            System.out.println("Removed data: " + x.title + " " + x.authorName + " " + x.publishedYear + " " + x.pagesAmount + " " + x.price);
        } else {
            System.out.println("Stack is empty");
        }
    }
    public void peek() {
        System.out.println("Top element: " + data[top].title + " " + data[top].authorName + " " + data[top].publishedYear + " " + data[top].pagesAmount + " " + data[top].price);
    }
    
    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].title + " " + data[i].authorName + " " + data[i].publishedYear + " " + data[i].pagesAmount + " " + data[i].price);
        }
        System.out.println("");
    }

}

