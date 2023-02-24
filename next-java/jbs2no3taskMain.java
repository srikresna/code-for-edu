public class jbs2no3taskMain {
    public static void main(String[] args) {
        jbs2no3task task1 = new jbs2no3task("Laptop", 1000000, 1);
        System.out.println("Total Price: " + task1.calculateTotalPrice());
        System.out.println("Discount: " + task1.calculateDiscount());
        System.out.println("Final Price: " + task1.calculateFinalPrice());
     }
}
