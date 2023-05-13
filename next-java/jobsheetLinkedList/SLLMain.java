package jobsheetLinkedList;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.print();
        sll.addFirst(890);
        sll.print();
        sll.addLast(760);
        sll.print();
        sll.addFirst(700);
        sll.print();
        sll.insertAfter(700, 999);
        sll.print();
        sll.insertAt(3, 833);
        sll.print();
    }
}
