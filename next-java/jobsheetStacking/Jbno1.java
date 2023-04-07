package jobsheetStacking;

public class Jbno1 {
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

    public void push(char dt) {
        top++;
        data[top] = dt;
    }
    public void pop() {
        char dt = data[top];
        top--;
        System.out.print(dt);
    }
}
