package jobsheetSorting;

import java.util.Scanner;

public class MainTicket {
    public static void main(String[] args) {
        TicketService data = new TicketService();
        Scanner sc = new Scanner(System.in);
        data.add(new Tickets("Lion Air", "Jakarta", "Surabaya", 5000000));
        data.add(new Tickets("Garuda Indonesia", "Jakarta", "Surabaya", 6000000));
        data.add(new Tickets("Citilink", "Jakarta", "Surabaya", 4000000));
        data.add(new Tickets("Air Asia", "Jakarta", "Surabaya", 3000000));
        data.add(new Tickets("Sriwijaya Air", "Jakarta", "Surabaya", 2000000));

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("== AIRLINE TICKET SERVICE ==");
            System.out.println("Menu:");
            System.out.println("1. Show all tickets");
            System.out.println("2. Sort tickets by price (ascending)");
            System.out.println("3. Sort tickets by price (descending)");
            System.out.println("4. Exit");
            System.out.print("Choose menu: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("== ALL TICKETS ==");
                    data.displayAll();
                    break;
                case 2:
                    data.bubbleSort(true);
                    data.displayAll();
                    break;
                case 3:
                    data.selectionSort(false);
                    data.displayAll();
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid menu!");
                    break;
            }
        }
    }
}
