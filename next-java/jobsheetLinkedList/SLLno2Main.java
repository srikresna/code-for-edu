package jobsheetLinkedList;

public class SLLno2Main {
    public static void main(String[] args) {
        SLLno2 sll = new SLLno2();
        // make A B C D E using 4 methods
        sll.addFirst('A');
        sll.addLast('B');
        sll.insertAfter('B', 'C');
        sll.insertAt(3, 'D');
        sll.addLast('E');
        sll.print();
    }

}
