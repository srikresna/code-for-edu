import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] price = { 20000, 5000, 5000000 };
        String[] item = { "Book", "Pencil", "Computer" };
        String[] stock = { "total stock", "damaged stock" };

        int[][] amount = new int[item.length][stock.length];
        for (int row = 0; row < item.length; row++) {
            System.out.println("Input stock " + item[row]);
            for (int colm = 0; colm < stock.length; colm++) {
                System.out.printf("Input %s ", stock[colm]);
                amount[row][colm] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.printf("%-10s", "");
        for (int i = 0; i < stock.length; i++) {
            System.out.printf("%-15s", stock[i]);
        }
        System.out.println();
        for (int row = 0; row < item.length; row++) {
            System.out.printf("%-10s", item[row]);
            for (int colm = 0; colm < stock.length; colm++) {
                System.out.printf("%-15d", amount[row][colm]);
            }
            System.out.println();
        }

        int[] borrowed = new int[item.length];
        for (int i = 0; i < item.length; i++) {
            borrowed[i] = amount[1][0] - amount[1][1];
            System.out.printf("%s can be borrow is %2d\n", item[i], amount[i][0] - amount[i][1]);
        }

        int turnoverFinal = 0;
        for (int i = 0; i < item.length; i++) {
            int borrow = amount[i][0] - amount[i][1];
            int turnover = borrow * price[i];
            System.out.printf("Total turnover of %s is %d \n", item[i], turnover);
            turnoverFinal += turnover;
        }
        System.out.printf("Final turnover is %d\n", turnoverFinal);


        int compare = 0;
        for (int i = 0; i < borrowed.length; i++) {
            if (compare < borrowed[i]) {
                compare = i;
            }
        }
        System.out.printf("Item with the most stock that can be borrowed is %s", item[compare]);
    }
}
