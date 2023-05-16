package jobsheetLinkedList;

public class SLLno2 {
    CharNode head; // initial position in linked list
    CharNode tail; // last position in linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            CharNode tmp = head;
            System.out.print("Linked list conctent: \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List is empty");
        }
    }

    public void addFirst(char input) {
        CharNode ndInput = new CharNode(input, null);
        if (isEmpty()) { // if linked list is empty
            head = ndInput; // head and tail is equal with node input
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(char input) {
        CharNode ndInput = new CharNode(input, null);
        if (isEmpty()) { // if linked list is empty
            head = ndInput; // head and tail is equal with node input
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, char input) {
        CharNode ndInput = new CharNode(input, null);
        CharNode temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, char input) {
        if (index < 0) {
            System.out.println("Wrong index");
        } else if (index == 0) {
            addFirst(input);
        } else {
            CharNode temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new CharNode(input, temp.next);
            if (temp.next.next == null)
                tail = temp.next;
        }
    }

}