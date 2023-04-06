package jobsheetStacking;

public class StackMain {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        stk.push(15);
        stk.push(30);
        stk.push(45);
        stk.push(60);
        stk.push(75);
        stk.print();
        stk.push(34);
        stk.pop();
        stk.peek();
        stk.print();
    }
}
