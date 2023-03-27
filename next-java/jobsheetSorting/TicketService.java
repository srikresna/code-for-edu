package jobsheetSorting;

public class TicketService {
    Tickets list[] = new Tickets[5];
    int index;

    // add method
    void add(Tickets t) {
        if (index < list.length) {
            list[index] = t;
            index++;
        } else {
            System.out.println("The ticket list is already full-filled");
        }
    }
    // display method
    void displayAll() {
        for (Tickets t : list) {
            System.out.println("Airlines = " + t.airlines);
            System.out.println("Destination = " + t.destination);
            System.out.println("Origin = " + t.origin);
            System.out.println("Price = " + t.price);
            System.out.println("==================================");
        }
    }
    // bubble sort method
    void bubbleSort(boolean isAscending) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 1; j < list.length - i; j++) {
                if (isAscending) {
                    if (list[j].price < list[j - 1].price) {
                        // SWAP
                        Tickets tmp = list[j];
                        list[j] = list[j - 1];
                        list[j - 1] = tmp;
                    }
                } else {
                    if (list[j].price > list[j - 1].price) {
                        // SWAP
                        Tickets tmp = list[j];
                        list[j] = list[j - 1];
                        list[j - 1] = tmp;
                    }
                }
            }
        }
    }
    // selection sort method
    void selectionSort(boolean isAscending) {
        for (int i = 0; i < list.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if (isAscending) {
                    if (list[j].price < list[idxMin].price) {
                        idxMin = j;
                    }
                } else {
                    if (list[j].price > list[idxMin].price) {
                        idxMin = j;
                    }
                }
            }
            // SWAP
            Tickets tmp = list[idxMin];
            list[idxMin] = list[i];
            list[i] = tmp;
        }
    }
}
