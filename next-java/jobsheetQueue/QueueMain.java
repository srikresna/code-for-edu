package jobsheetQueue;

import java.util.Scanner;

public class QueueMain {

    public static void menu() {
        System.out.println("Choose menu : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Check first queue");
        System.out.println("4. Check all queue");
        System.out.println("5. Peek rear");
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("insert maximum queue : ");
        int max = sc.nextInt();
        QueuePassenger Q = new QueuePassenger(max);

        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Name: ");
                    String nm = sc.nextLine();
                    sc.nextLine();
                    System.out.print("City origin: ");
                    String cOrg = sc.nextLine();
                    System.out.print("City destination: ");
                    String cDest = sc.nextLine();
                    System.out.print("Ticket amount: ");
                    int ticket = sc.nextInt();
                    System.out.print("Price: ");
                    int price = sc.nextInt();
                    Passengers p = new Passengers(nm, cOrg, cDest, ticket, price);
                    sc.nextLine();
                    Q.Enqueue(p);
                    break;
                case 2:
                    Passengers data = Q.Dequeue();
                    if (!"".equals(data.name) && !"".equals(data.cityOrigin) &&
                            !"".equals(data.cityDestination) && data.ticketAmount
                            != 0 && data.price != 0) {
                        System.out.println("Data removed : " + data.name + " "
                        + data.cityOrigin + " " + data.cityDestination + " "
                        + data.ticketAmount + " " + data.price);
                        break;
                    }

                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.peekRear();
                    break;
            }
        } while (choose >= 1 && choose <= 5);
        sc.close();
    }
}
