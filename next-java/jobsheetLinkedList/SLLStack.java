package jobsheetLinkedList;

public class SLLStack {
    StringNode top;

    public SLLStack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(String data) {
        StringNode newNode = new StringNode(data, null);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            StringNode temp = top;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void printLinkedList() {
        if (!isEmpty()) {
            StringNode tmp = top;
            System.out.print("Linked list content: \t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List is empty");
        }
    }

    public void getTop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top : " + top.data);
        }
    }
}
