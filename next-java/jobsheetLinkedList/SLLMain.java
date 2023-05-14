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
        //2nd lab activity
        System.out.println("Data in 1st index : " + sll.getData(1));
        System.out.println("Data 3 is in index : " + sll.indexOf(760));
        sll.remove(999);
        sll.print();
        sll.removeAt(0);
        sll.print();
        sll.removeFirst();
        sll.print();
        sll.removeLast();
        sll.print();
    }
}
