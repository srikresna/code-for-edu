package jobsheetBFnDC;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("Program for Calculating Total Profits");
        System.out.print("Input the Number of Months : ");
        int totElemen = sc.nextInt();
        Sum sm = new Sum(totElemen);
        sm.elemen = totElemen;

        System.out.println("===========================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Input the profit of the month to - " + (i + 1) + " = ");
            sm.profit[i] = sc.nextDouble();
        }

        System.out.println("===========================================");
        System.out.println("Algorithm Brute Force");
        System.out.println("Total profits of the company for " + sm.elemen + " month is = "
                + sm.totalBF(sm.profit));
        System.out.println("===========================================");
        System.out.println("Algorithm Divide and Conquer");
        System.out.println("Total profits of the company for " + sm.elemen + " month is = "
                + sm.totalDC(sm.profit, 0, sm.elemen - 1));
    }
}
