package jobsheetStacking;
import java.util.Scanner;

public class ReceiptStack {

    int size, top;
    Receipt data[];
    Scanner sc = new Scanner(System.in);

    public ReceiptStack(int size) {
        this.size = size;
        data = new Receipt[size];
        top = -1;
    }

    public int size() {
        return top + 1;
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
            System.out.println("Wardrobe is full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Receipt x = data[top];
            top--;
            System.out.println("Exchanging " + x.transactionID + " " + x.itemQuantity + " " + x.totalPrice + " " + x.date);
        } else {
            System.out.println("Wardrobe is empty");
        }
    }

    public void print() {
        System.out.println("Receipt in wardrobe  :");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].transactionID + " " + data[i].itemQuantity + " " + data[i].totalPrice + " " + data[i].date);
        }
        System.out.println("");
    }


    //function addReceipt
    public void addReceipt(ReceiptStack stack) {
        char choose;
        do {
            System.out.print("Transaction ID : ");
            int transactionID = sc.nextInt();

            System.out.print("Item Quantity : ");
            int itemQuantity = sc.nextInt();

            System.out.print("Total Price : ");
            int totalPrice = sc.nextInt();

            System.out.print("Date : ");
            String date = sc.next();

            Receipt receipt = new Receipt(transactionID, itemQuantity, totalPrice, date);
            System.out.print("Do you want to add new receipt to stack (y/n) ? ");
            choose = sc.next().charAt(0);
            sc.nextLine();
            stack.push(receipt);
        } while (choose == 'y' || choose == 'Y');
    }
    
    public void trade() {
        if (!isEmpty()) {
            for (int i = 0; i < 5; i++) {
                pop();
            }
            System.out.println("You have traded your 5 receipts");
            System.out.println("You got 1 voucher");
        } else {
            System.out.println("You don't have any receipts");
        }
    }

    //function tradeReceipt
    public void tradeReceipt(ReceiptStack stack) {
        char choose;
        if (stack.size() >= 5) {
            System.out.println("You have enough receipts to trade, your total receipts is " + stack.size());
            System.out.print("Do you want to trade your receipts (y/n) ? ");
            choose = sc.next().charAt(0);
            sc.nextLine();
            if (choose == 'y' || choose == 'Y') {
                trade();
            } else {
                System.out.println("Wardrobe is closed");
            }
        }
    }
}

