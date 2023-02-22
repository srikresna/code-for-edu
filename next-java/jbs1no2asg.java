public class jbs1no2asg {
    public static void main(String[] args) {
        double balance = 1000000;
        double targetBalance = 1500000;
        double interestPerMonth = 0.02;
        int month = 0;

        while (balance < targetBalance) {
            balance += balance * interestPerMonth;
            month++;
        }

        System.out.println("Target balance will be reached in " + month + " months.");
    }
}
