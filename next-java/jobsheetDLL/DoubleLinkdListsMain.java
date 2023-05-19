package jobsheetDLL;

import javax.xml.transform.Source;

public class DoubleLinkdListsMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===============================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
        // 2nd lab activity
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        System.out.println("Size : " + dll.size());
        System.out.println("===============================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===============================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("===============================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());
    }
}
