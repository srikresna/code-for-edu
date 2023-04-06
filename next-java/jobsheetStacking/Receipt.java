package jobsheetStacking;

public class Receipt {
    int transactionID, itemQuantity, totalPrice;
    String date;

    public Receipt(int transactionID, int itemQuantity, int totalPrice, String date) {
        this.transactionID = transactionID;
        this.itemQuantity = itemQuantity;
        this.totalPrice = totalPrice;
        this.date = date;
    }
}
