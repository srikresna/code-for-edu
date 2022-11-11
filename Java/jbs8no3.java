import java.util.Scanner;

public class jbs8no3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[100];
        int length;

        System.out.print("Enter the number of array elements: ");
        length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the value of element " + (i + 1) + ": ");
            int assign = sc.nextInt();
            array[i] = assign;
        }

        for (int j = 0; j < length; j++) {
            if (array[j] % 2 == 0) {
                System.out.println("Even number is: " + array[j]);
            }
        }
        for (int k = 0; k < length; k++) {
            if(array[k] % 2 == 1) {
                System.out.println("Odd number is: " + array[k]);
            }
        } 
    }
}
