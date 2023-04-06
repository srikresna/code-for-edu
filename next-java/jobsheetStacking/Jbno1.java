package jobsheetStacking;

public class Jbno1 {
    //Create a program with Stack implementation to insert a sentence and display the reversed version of the sentence as a result!
    String sentence;
    int size;
    int top;
    char data[];

    public Jbno1(String sentence) {
        this.sentence = sentence;
        size = sentence.length();
        data = new char[size];
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

    public void push(char dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            char x = data[top];
            top--;
            System.out.print(x);
        } else {
            System.out.println("Stack is empty");
        }
    }
}
