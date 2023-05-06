package jobsheetQueue;
import java.util.Scanner;

public class QueueMain {
    
    public static void menu() {
        System.out.println("Choose menu : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("=========================");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert maximum queue : ");
        int n = sc.nextInt();

        Queue Q = new Queue(n);
        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Insert new data : ");
                    int newData = sc.nextInt();
                    Q.Enqueue(newData);
                    break;
                case 2:
                    int removeData = Q.Dequeue();
                    if (removeData != 0) {
                        System.out.println("Data removed : " + removeData);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (choose >= 1 && choose <= 5);
        }

    }

}
