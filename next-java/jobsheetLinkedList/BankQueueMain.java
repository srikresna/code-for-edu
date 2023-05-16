package jobsheetLinkedList;

import java.util.Scanner;

public class BankQueueMain {
    public static void main(String[] args) {
        BankCustomerQueue queue = new BankCustomerQueue();
        Scanner sc = new Scanner(System.in);

        int menu;
        do {
            System.out.println("BANK MENU");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Exit");
            System.out.print(">> ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Address: ");
                    String address = sc.next();
                    System.out.print("Customer Account Number: ");
                    String customerAccountNumber = sc.next();
                    queue.enqueue(name, address, customerAccountNumber);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input");
            }
        } while (menu != 4);
    }
}
