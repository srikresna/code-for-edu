import java.util.Scanner;

public class jbs1no3asg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        for (int i = 2; i <= n * 2; i += 2) {
            if (i % 4 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
