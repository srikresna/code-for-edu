import java.util.Scanner;

public class jbs7no4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENter value N : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = n; j >= 1; j--) {
                    System.out.print(j);
                }
            } else {
                for (int k = 1; k <= n; k++) {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}
