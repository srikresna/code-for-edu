import java.util.Scanner;
public class ShoppingBillMain {
    public static void main(String[] args) {
        //initialize class that we will use
        ShoppingBill[] bills = new ShoppingBill[5];
        Scanner sc = new Scanner(System.in);

        //ask input from user
        for (int i = 0; i < bills.length; i++) {
            //initialize the array of object
            bills[i] = new ShoppingBill();

            //ask input
            System.out.println("Customer " + (i + 1));
            System.out.print("Enter bill id: ");
            bills[i].billid = sc.nextLine();
            System.out.print("Enter customer id: ");
            bills[i].customerId = sc.nextLine();
            System.out.print("Enter customer name: ");
            bills[i].customerName = sc.nextLine();
            System.out.print("Enter date: ");
            bills[i].date = sc.nextLine();
            System.out.print("Enter coupon code: ");
            bills[i].couponCode = sc.nextLine();
            System.out.print("Enter price of product 1: ");
            bills[i].price[0] = sc.nextDouble();
            System.out.print("Enter price of product 2: ");
            bills[i].price[1] = sc.nextDouble();
            System.out.print("Enter price of product 3: ");
            bills[i].price[2] = sc.nextDouble();
            System.out.print("Enter price of product 4: ");
            bills[i].price[3] = sc.nextDouble();
            System.out.print("Enter delivery distance: ");
            bills[i].deliveryDistance = sc.nextInt();
            sc.nextLine();
        }

        //looping for display shoppingbill detail from user input
        for (int i = 0; i < bills.length; i++) {
            System.out.println("\n=======================================\n");
            System.out.println("Customer " + (i + 1));
            System.out.println("Bill ID: " + bills[i].billid);
            System.out.println("Customer ID: " + bills[i].customerId);
            System.out.println("Customer Name: " + bills[i].customerName);
            System.out.println("Date: " + bills[i].date);
            System.out.println("Coupon Code: " + bills[i].couponCode);
            System.out.println("Price of product 1: " + bills[i].price[0]);
            System.out.println("Price of product 2: " + bills[i].price[1]);
            System.out.println("Price of product 3: " + bills[i].price[2]);
            System.out.println("Price of product 4: " + bills[i].price[3]);
            System.out.println("Delivery Distance: " + bills[i].deliveryDistance);
            System.out.println("Discount: " + bills[i].calcDiscount(0));
            System.out.println("Shipping Cost: " + bills[i].shippingCost());
            System.out.println("Total Payment: " + bills[i].calcTotalPayment());
            System.out.println();
        }

        //program to calculate the average total payment for shopping bill that has discount 17%
        double total = 0;
        int count = 0;
        // check in the array using looping if there is bills are use coupon GIFT17, then calculate
        for (int i = 0; i < bills.length; i++) {
            if (bills[i].couponCode.equals("GIFT17")) {
                total += bills[i].calcTotalPayment();
                count++;
            }
        }
        System.out.println("\nAverage total payment for shopping bill that has discount 17%: " + total / count);

        //program to display customer ID and customer name who has the biggest total payment
        int max = 0;
        int index = 0;
        //check the biggest total payment in the array using loop
        for (int i = 0; i < bills.length; i++) {
            if (bills[i].calcTotalPayment() > max) {
                max = bills[i].calcTotalPayment();
                index = i;
            }
        }
        System.out.println("\nCustomer ID and customer name who has the biggest total payment: " + bills[index].customerId + " " + bills[index].customerName);

        //program to calculate total discount from all bill
        int totalDiscount = 0;
        //looping to calculate
        for (int i = 0; i < bills.length; i++) {
            totalDiscount += bills[i].calcDiscount(0);
        }
        System.out.println("\nTotal discount from all bill: " + totalDiscount);
    }
}