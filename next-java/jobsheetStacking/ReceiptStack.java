package jobsheetStacking;

public class ReceiptStack {

    int size, top;
    Receipt data[];

    public ReceiptStack(int size) {
        this.size = size;
        data = new Receipt[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Receipt dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Receipt x = data[top];
            top--;
            System.out.println("Remove data : " + x.transactionID + " " + x.itemQuantity + " " + x.totalPrice + " " + x.date);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void print() {
        System.out.println("Data in stack : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].transactionID + " " + data[i].itemQuantity + " " + data[i].totalPrice + " " + data[i].date);
        }
        System.out.println("");
    }

    public void trade() {
        if (!isEmpty()) {
            for (int i = 0; i < 5; i++) {
                pop();
            }
            System.out.println("You have traded your 5 receipts");
        } else {
            System.out.println("You don't have any receipts");
        }
    }

    public int size() {
        return top + 1;
    }
}

