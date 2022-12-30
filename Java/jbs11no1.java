import java.util.Scanner;

public class jbs11no1 {
    static int recursive(int n) {
        if (n == -1) {
            return (0);
        } else {
            System.out.print(n + " ");
            return (recursive(n - 1));
        }
    }
    static int iterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        return (0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Input value n : ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            System.out.print("Recursive : ");
            recursive(n);
            System.out.println();
            System.out.print("Iterative : ");
            iterative(n);
            System.out.println("\nInput 0 to exit");
        }
    }
}
