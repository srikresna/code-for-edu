package jobsheetDLL;

import java.util.Scanner;

public class DLLno1Main {
    public static void main(String[] args) {
        DLLno1 dll = new DLLno1();
        Scanner sc = new Scanner(System.in);
        dll.addFirst(23);
        dll.addTail(67);
        dll.addTail(44);
        dll.addTail(90);
        dll.addTail(99);

        int menu;
        do {
            System.out.println("==========================================");
            System.out.println("Data manipulation with Double Linked List");
            System.out.println("==========================================");
            System.out.println("1. Add First");
            System.out.println("2. Add Tail");
            System.out.println("3. Add Data in nth index");
            System.out.println("4. Remove First");
            System.out.println("5. Remove Last");
            System.out.println("6. Remove data by index");
            System.out.println("7. Print");
            System.out.println("8. Search Data");
            System.out.println("9. Sort Data");
            System.out.println("10. Exit");
            System.out.println("==========================================");
            System.out.print(">> ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Enter the data in head position: ");
                    int dataToAdd = sc.nextInt();
                    dll.addFirst(dataToAdd);
                    break;
                case 2:
                    System.out.print("Enter the data in tail position: ");
                    dataToAdd = sc.nextInt();
                    dll.addTail(dataToAdd);
                    break;
                case 3:
                    System.out.print("Enter the data to add: ");
                    dataToAdd = sc.nextInt();
                    System.out.print("Enter the index: ");
                    int index = sc.nextInt();
                    try {
                        dll.add(dataToAdd, index);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        dll.removeFirst();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        dll.removeLast();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.print("Enter the index: ");
                    index = sc.nextInt();
                    try {
                        dll.remove(index);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Enter the data to search: ");
                    int searchData = sc.nextInt();
                    int result = dll.sequentialSearch(searchData);
                    if (result != -1) {
                        System.out.println("Data " + searchData + " is in index: " + result);
                    } else {
                        System.out.println("Data not found");
                    }
                    break;
                case 9:
                    dll.bubbleSort();
                    System.out.println("Data sorted");
                    break;
                case 10:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid menu choice");
                    break;
            }
        } while (menu != 10);
    }
}
