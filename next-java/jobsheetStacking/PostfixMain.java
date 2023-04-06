package jobsheetStacking;

import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("insert mathematical expression (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";
        int total = Q.length();
        Postfix post = new Postfix(total);
        P = post.convert(Q);
        System.out.println("Postfix : " + P);

        //show the process
        System.out.println("Process : ");
        for (int i = 0; i < total; i++) {
            char c = Q.charAt(i);
            if (post.isOperand(c)) {
                System.out.println("push " + c + " to stack");
            } else if (post.isOperator(c)) {
                System.out.println("pop 2 element from stack");
                System.out.println("push " + c + " to stack");
            }
        }
        System.out.println("pop all element from stack");
        
    }
}
