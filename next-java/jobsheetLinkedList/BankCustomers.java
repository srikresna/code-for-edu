package jobsheetLinkedList;

public class BankCustomers {
    String name, address, customerAccountNumber;
    BankCustomers next;

    public BankCustomers(String name, String address, String customerAccountNumber, BankCustomers next) {
        this.name = name;
        this.address = address;
        this.customerAccountNumber = customerAccountNumber;
        this.next = next;
    }
}
