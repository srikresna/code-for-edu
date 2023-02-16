import java.util.Scanner;

public class jbs8no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        int length;
        System.out.print("Enter the number of array elements: ");
        length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the value of element " + (i + 1) + ": ");
            int assign = sc.nextInt();
            array[i] = assign;
        }
        int max_number = array[0];

        for (int j : array) {
            if (j > max_number) {
                max_number = j;
            }
        }
        System.out.print("The largest number is " + max_number);
    }
}
