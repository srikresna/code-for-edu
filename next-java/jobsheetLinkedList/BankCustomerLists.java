package jobsheetLinkedList;

public class BankCustomerLists {
    BankCustomers head;

    public BankCustomerLists() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String name, String address, String customerAccountNumber) {
        BankCustomers newNode = new BankCustomers(name, address, customerAccountNumber, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(String name, String address, String customerAccountNumber) {
        BankCustomers newNode = new BankCustomers(name, address, customerAccountNumber, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            BankCustomers temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printLinkedList() {
        if (!isEmpty()) {
            BankCustomers tmp = head;
            System.out.println("Linked list content: ");
            while (tmp != null) {
                System.out.println("Name: " + tmp.name);
                System.out.println("Address: " + tmp.address);
                System.out.println("Customer Account Number: " + tmp.customerAccountNumber);
                System.out.println("------ < > ------");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List is empty");
        }
    }

    public void remove(String customerAccountNumber) {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            BankCustomers temp = head;
            while (temp != null) {
                if (temp.customerAccountNumber.equals(customerAccountNumber)) {
                    if (temp == head) {
                        head = temp.next;
                        break;
                    } else {
                        BankCustomers prev = head;
                        while (prev.next != temp) {
                            prev = prev.next;
                        }
                        prev.next = temp.next;
                        break;
                    }
                }
                temp = temp.next;
            }
        }
    }

}
