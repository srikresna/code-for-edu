package jobsheetStacking;

public class stackMain {
    public static void main(String[] args) {
        stack tumpukan = new stack(10);
        tumpukan.push(10);
        tumpukan.print();
        tumpukan.push(40);
        tumpukan.print();
        tumpukan.push(30);
        tumpukan.print();
        tumpukan.push(50);
        tumpukan.print();
        tumpukan.peek();
        tumpukan.pop();
        tumpukan.print();
        tumpukan.peek();
        tumpukan.pop();
        tumpukan.print();
        tumpukan.peek();
        tumpukan.clear();
        tumpukan.print();
    }
}
