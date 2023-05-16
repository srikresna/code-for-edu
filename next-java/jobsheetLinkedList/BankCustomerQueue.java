package jobsheetLinkedList;

public class BankCustomerQueue {
    BankCustomers front;
    BankCustomers rear;

    public BankCustomerQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(String name, String address, String customerAccountNumber) {
        BankCustomers newNode = new BankCustomers(name, address, customerAccountNumber, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Customer " + front.name + " is served");
            front = front.next;
        }
    }

    public void printQueue() {
        if (!isEmpty()) {
            BankCustomers tmp = front;
            System.out.println("Queue content: ");
            while (tmp != null) {
                System.out.println("Name: " + tmp.name);
                System.out.println("Address: " + tmp.address);
                System.out.println("Customer Account Number: " + tmp.customerAccountNumber);
                System.out.println("------ < > ------");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Queue is empty");
        }
    }


}
