import java.util.Scanner;

public class jbs1no4qst {
    static Scanner input = new Scanner(System.in);
    //function to display fibonacci row using loop
    static void fibonacciLoop(int n){
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    //function to display fibonacci row using recursion
    static int fibonacciRecursion(int n){
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }
    public static void main(String[] args) {
        //fibonnaci row: 0, 1, 1, 2, 3, 5, 8, 13, 21
        System.out.print("Enter the number of fibonacci row: ");
        int n = input.nextInt();
        System.out.println("====================");
        System.out.println("Fibonacci row using loop");
        fibonacciLoop(n);
        System.out.println("\n====================");
        System.out.println("Fibonacci row using recursion");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }

    }
}
