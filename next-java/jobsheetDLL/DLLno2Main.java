package jobsheetDLL;

import java.util.Scanner;

public class DLLno2Main {
    public static void main(String[] args) {
        DLLno2 dll = new DLLno2();
        Scanner sc = new Scanner(System.in);

        int menu;
        do {
            System.out.println("******************");
            System.out.println("Library data book");
            System.out.println("******************");
            System.out.println("1. Add new book");
            System.out.println("2. get book from top");
            System.out.println("3. Peek book title from top");
            System.out.println("4. Info all books");
            System.out.println("5. Exit");
            System.out.println("******************");
            System.out.print(">> ");
            menu = sc.nextInt();

            switch(menu) {
                case 1:
                    System.out.println("------------------");
                    System.out.println("Insert new book title");
                    System.out.println("------------------");
                    sc.nextLine();
                    String newBook = sc.nextLine();
                    dll.push(newBook);
                    break;
                case 2:
                    dll.pop();
                    break;
                case 3:
                    dll.peek();
                    break;
                case 4:
                    dll.display();
                    break;
                case 5:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid menu!");
                    break;
            }
        } while (menu != 5);
    }
}
