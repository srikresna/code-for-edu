import java.util.Scanner;

public class jbs11no2 {
    static int recursiveAddition(int a) {
        if (a > 0) {
            return (a + recursiveAddition(a - 1));
        } else {
            return (0);
        }
    }

    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input value n : ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println("Factorial number is " + recursiveAddition(n));
            System.out.println("Input 0 to exit");
        }
    }
}
