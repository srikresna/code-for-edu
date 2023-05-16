package jobsheetLinkedList;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        BankCustomerLists list = new BankCustomerLists();
        Scanner sc = new Scanner(System.in);

        int menu;
        do {
            System.out.println("BANK MENU");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Print");
            System.out.println("4. Remove");
            System.out.println("5. Exit");
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
                    list.addFirst(name, address, customerAccountNumber);
                    break;
                case 2:
                    System.out.print("Name: ");
                    name = sc.next();
                    System.out.print("Address: ");
                    address = sc.next();
                    System.out.print("Customer Account Number: ");
                    customerAccountNumber = sc.next();
                    list.addLast(name, address, customerAccountNumber);
                    break;
                case 3:
                    list.printLinkedList();
                    break;
                case 4:
                    System.out.print("Customer Account Number: ");
                    customerAccountNumber = sc.next();
                    list.remove(customerAccountNumber);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input");
            }
        } while (menu != 5);

    }
}
