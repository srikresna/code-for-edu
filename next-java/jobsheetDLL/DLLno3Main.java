package jobsheetDLL;
import java.util.Scanner;

public class DLLno3Main {
    public static void main(String[] args) {
        DLLno3 queue = new DLLno3();
        Scanner sc = new Scanner(System.in);
        queue.enqueue("146", "Rosi");
        queue.enqueue("135", "Johan");
        queue.enqueue("124", "Mely");

        int menu;
        do {
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println("Extravaganza Vaccine Queue");
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println("1. Add Vaccine Queue");
            System.out.println("2. Remove Vaccine qeueu");
            System.out.println("3. Display Vaccine Queue");
            System.out.println("4. Exit");
            System.out.println("++++++++++++++++++++++++++++");
            System.out.print(">> ");
            menu = sc.nextInt();

            switch (menu) {
                case 1: 
                    System.out.println("Add new Vaccine Queue");
                    System.out.print("Queue number : ");
                    String queueNumber = sc.next();
                    System.out.print("Name : ");
                    String name = sc.next();
                    queue.enqueue(queueNumber, name);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    System.out.println("Exiting..");
                    break;
                default:
                    System.out.println("Invalid menu!");
                    break;
            }
        } while (menu != 4);
    }    
}
