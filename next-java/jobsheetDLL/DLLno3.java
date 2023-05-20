package jobsheetDLL;

public class DLLno3 {
    VaccineQueue head, tail;
    int queueLength;

    public DLLno3() {
        head = null;
        tail = null;
        queueLength = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void enqueue(String no, String name) {
        if (isEmpty()) {
            head = tail = new VaccineQueue(no, name);
        } else {
            VaccineQueue newNode = new VaccineQueue(no, name);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        queueLength++;
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("No vaccine queue available.");
            return;
        }
        System.out.println(head.name + " has been vaccinated!");
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        queueLength--;
    }   
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("No vaccine queue available.");
            return;
        }
        VaccineQueue current = head;
        System.out.println("Current vaccine queue :");
        while (current != null) {
            System.out.printf("| %-8s | %-10s |\n", current.queueNumber, current.name);
            current = current.next;
        }
        //print queue left
        System.out.println("Queue left : " + queueLength);
    }
}
