package jobsheetStacking;

import java.util.Scanner;

public class ReceiptMain {
    // Every Sunday, Dewi shops to a supermarket that is in her residential area.
    // Everytime she
    // finishes, she keeps the receipt of what she has bought in a wardrobe. After 2
    // months, She
    // had 8 receipts. She plans to trade her 5 receipts in exchange for a voucher.
    // Create a program using stack implementation to store Dewi’s receipt. As well
    // as the
    // retrieving the receipts.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReceiptStack stack = new ReceiptStack(10);
        Receipt receipt1 = new Receipt(1, 2, 100000, "01-01-2020");
        Receipt receipt2 = new Receipt(2, 3, 150000, "02-01-2020");
        Receipt receipt3 = new Receipt(3, 4, 200000, "03-01-2020");
        Receipt receipt4 = new Receipt(4, 5, 250000, "04-01-2020");
        Receipt receipt5 = new Receipt(5, 6, 300000, "05-01-2020");
        Receipt receipt6 = new Receipt(6, 7, 350000, "06-01-2020");
        Receipt receipt7 = new Receipt(7, 8, 400000, "07-01-2020");
        Receipt receipt8 = new Receipt(8, 9, 450000, "08-01-2020");

        stack.push(receipt1);
        stack.push(receipt2);
        stack.push(receipt3);
        stack.push(receipt4);
        stack.push(receipt5);
        stack.push(receipt6);
        stack.push(receipt7);
        stack.push(receipt8);

        int menu;
        do {
            stack.print();
            System.out.println("WARDROBE OPTIONS");
            System.out.println("1. Add new receipts to wardrobe");
            System.out.println("2. Trade your receipts in exchange for a voucher");
            System.out.println("3. Exit");
            System.out.print("Choose : ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    stack.addReceipt(stack);
                    break;
                case 2:
                    stack.tradeReceipt(stack);
                    break;
                case 3:
                    System.out.println("Wardrobe is closed");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (menu != 3);
    }
}
