package jobsheetSearching;
import java.util.Scanner;

public class Array2DMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array2D arr2D = new Array2D();

        System.out.println("Program Searching Sequential");
        System.out.println("============================================");
        arr2D.printArray();
        System.out.println("============================================");
        System.out.print("Search for: ");
        int search = sc.nextInt();

        int[] position = arr2D.usingSequentialSearch(search);
        if (position[0] == -1 && position[1] == -1) {
            System.out.println("Data " + search + " not found");
        } else {
            System.out.println("Data " + search + " found at row " + position[0] + " and column " + position[1]);
        }
    }
}
