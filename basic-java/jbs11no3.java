import java.util.Scanner;

public class jbs11no3 {

    //fungsi rekursif untuk menentukan n bilangan prima atau tidak
    static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input value n : ");
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println(isPrime(n, 2));
            System.out.println("Input 0 to exit");
        }
    }
}
