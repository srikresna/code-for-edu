package jobsheetStacking;
import java.util.Scanner;

public class ReceiptMain {
        //Every Sunday, Dewi shops to a supermarket that is in her residential area. Everytime she
//finishes, she keeps the receipt of what she has bought in a wardrobe. After 2 months, She
//had 8 receipts. She plans to trade her 5 receipts in exchange for a voucher.
//Create a program using stack implementation to store Dewi’s receipt. As well as the
//retrieving the receipts.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReceiptStack stack = new ReceiptStack(8);

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
            System.out.print("Do you want to add new data to stack (y/n) ? ");
            choose = sc.next().charAt(0);
            sc.nextLine();
            stack.push(receipt);
        } while (choose == 'y' || choose == 'Y');

        if (stack.size() >= 5) {
            System.out.println("You can trade your 5 receipts in exchange for a voucher (y/n) ? ");
            choose = sc.next().charAt(0);
            sc.nextLine();
            if (choose == 'y' || choose == 'Y') {
                for (int i = 0; i < 5; i++) {
                    stack.pop();
                }
            } else {
                System.out.println("You can't trade your receipts in exchange for a voucher");
            }
        }

        System.out.println("Your receipts : ");
        stack.print();
    }
}
