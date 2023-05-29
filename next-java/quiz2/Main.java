package quiz2;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList dll = new SingleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        dll.deleteFirst();
        dll.print();
        // continue to call addLast, deleteLast,
        // merge, split,
        split(dll);
    }

    // 2.A.
    public static void merge(SingleLinkedList l1,
            SingleLinkedList l2) {
        // complete this method
    }

    // 2.B. this will split sll to be 2 sll

    public static void split(SingleLinkedList l) {
    // ex: 2,3,4,34,2,3,45,4 (original list)
    // 1-> 2,3,4,34
    // 2-> 2,3,45,4
        // create new list
        SingleLinkedList l1 = new SingleLinkedList();
        SingleLinkedList l2 = new SingleLinkedList();
        // determine mid
        int mid = l.size / 2;
        // create new node
        Node tmp = l.head;
        // loop until mid
        for (int i = 0; i < mid; i++) {
            // add to l1
            l1.addFirst(tmp.data);
            // move to next node
            tmp = tmp.n;
        }
        // loop until end
        while (tmp != null) {
            // add to l2
            l2.addFirst(tmp.data);
            // move to next node
            tmp = tmp.n;
        }
        // print l1
        System.out.println("The first list is: ");
        l1.print();
        // print l2
        System.out.println("The second list is: ");
        l2.print();
    }
}
