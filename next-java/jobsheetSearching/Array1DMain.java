package jobsheetSearching;

import java.util.Scanner;

public class Array1DMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array1D arr1D = new Array1D();
        boolean program = true;
        while (program) {
            arr1D.printArray();
            System.out.println("");
            System.out.println("============================================");
            System.out.println("1. Search Value");
            System.out.println("2. Sort Array (ascending)");
            System.out.println("3. Sort Array (descending)");
            System.out.println("4. Get Biggest Value");
            System.out.print("Choose: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Search for: ");
                    int search = sc.nextInt();
                    int position = arr1D.usingSequentialSearch(search);
                    if (position == -1) {
                        System.out.println("Data " + search + " not found");
                    } else {
                        System.out.println("Data " + search + " found at index " + position);
                    }
                    break;
                case 2:
                    arr1D.insertionSort();
                    System.out.println("Array has been sorted (ascending)");
                    arr1D.printArray();
                    System.out.println("");
                    break;
                case 3:
                    arr1D.insertionSort(true);
                    System.out.println("Array has been sorted (descending)");
                    arr1D.printArray();
                    System.out.println("");
                    break;
                case 4:
                    int[] biggest = arr1D.getBiggestValue();
                    System.out.println("Biggest value is " + biggest[1] + " at index " + biggest[0]);
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
            System.out.print("Did you want to continue? (y/n)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("n")) {
                program = false;
            }
        }
    }
}
