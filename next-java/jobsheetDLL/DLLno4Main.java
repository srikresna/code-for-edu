package jobsheetDLL;
import java.util.Scanner;

public class DLLno4Main {
    public static void main(String[] args) {
        DLLno4 dll = new DLLno4();
        Scanner sc = new Scanner(System.in);
        dll.addFirst("123", "Anang", 2.77);
        dll.addLast("233", "Suparjo", 3.7);
        int choice = 0;

        do {
            System.out.println("=========================");
            System.out.println("Student Data Management System");
            System.out.println("=========================");
            System.out.println("1. Add data from head");
            System.out.println("2. Add data from tail");
            System.out.println("3. Add data at specific index");
            System.out.println("4. Remove data from head");
            System.out.println("5. Remove data from tail");
            System.out.println("6. Remove data at specific index");
            System.out.println("7. Print data");
            System.out.println("8. Search by NIM");
            System.out.println("9. Sort by GPA - Descending");
            System.out.println("10. Exit");
            System.out.println("=========================");
            System.out.print(">> ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nimHead = sc.next();
                    System.out.print("Name: ");
                    String nameHead = sc.next();
                    System.out.print("GPA: ");
                    double gpaHead = sc.nextDouble();
                    dll.addFirst(nimHead, nameHead, gpaHead);
                    break;
                case 2:
                    System.out.print("NIM: ");
                    String nimTail = sc.next();
                    System.out.print("Name: ");
                    String nameTail = sc.next();
                    System.out.print("GPA: ");
                    double gpaTail = sc.nextDouble();
                    dll.addLast(nimTail, nameTail, gpaTail);
                    break;
                case 3:
                    System.out.print("NIM: ");
                    String nimIndex = sc.next();
                    System.out.print("Name: ");
                    String nameIndex = sc.next();
                    System.out.print("GPA: ");
                    double gpaIndex = sc.nextDouble();
                    System.out.print("in Index: ");
                    int insertIndex = sc.nextInt();
                    dll.addAtIndex(nimIndex, nameIndex, gpaIndex, insertIndex);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.print("Index: ");
                    int removeIndex = sc.nextInt();
                    dll.removeAt(removeIndex);
                    break;
                case 7:
                    dll.printData();
                    break;
                case 8:
                    System.out.print("Enter NIM to search: ");
                    String searchNIM = sc.next();
                    dll.searchNIM(searchNIM);
                    break;
                case 9:
                    dll.sortDescendingGPA();
                    System.out.println("Data sorted by GPA (descending order).");
                    break;
                case 10:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 10);
    }
}
