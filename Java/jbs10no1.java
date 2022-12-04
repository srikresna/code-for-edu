import java.util.Scanner;

public class jbs10no1 {
     static int Max3(int bil1, int bil2, int bil3) {
        int max = 0;
        if (bil1 > bil2 && bil1 > bil3) {
            max = bil1;
        } else if (bil2 > bil1 && bil2 > bil3) {
            max = bil2;
        } else {
            max = bil3;
        }
        return max;
     }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Input the first number = ");
        int a = input.nextInt();
        System.out.printf("Input the second number = ");
        int b = input.nextInt();
        System.out.printf("Input the third number = ");
        int c = input.nextInt();

        System.out.print("\nThe maximum value among the three number is " + Max3(a, b, c));

    }
}