import java.util.Scanner;

public class jbs8no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the number: ");
            array[i] = sc.nextInt();
        }
        System.out.println("-----------------------------------------------------");
        for (int j = 5; j > 0; j--) {
            System.out.println("Reverse number is " + array[j-1]);
        }
    }
}