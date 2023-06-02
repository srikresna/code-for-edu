package jobsheetTree;

import java.util.Scanner;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        Scanner sc = new Scanner(System.in);
        int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);

        int choice = 0;
        do {
            System.out.println("Menu");
            System.out.println("1. Add");
            System.out.println("2. Traverse InOrder");
            System.out.println("3. Traverse PreOrder");
            System.out.println("4. Traverse PostOrder");
            System.out.println("5. Exit");
            System.out.println("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Input data: ");
                    int input = sc.nextInt();
                    bta.add(input);
                    break;
                case 2:
                    bta.traverseInOrder(0);
                    System.out.println();
                    break;
                case 3:
                    bta.traversePreOrder(0);
                    System.out.println();
                    break;
                case 4:
                    bta.traversePostOrder(0);
                    System.out.println();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input!");
            }
        } while (choice != 5);
    }
}