package jobsheetBFnDC;
import java.util.Scanner;

public class MainSquared {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.print("Input the number of elements you want to count : ");
        int elemen = sc.nextInt();

        Squared[] png = new Squared[elemen];

        for (int i = 0; i < elemen; i++) {
            png[i] = new Squared();
            System.out.print("Input the value to be squared to-" + (i + 1) + " : ");
            png[i].num = sc.nextInt();
            System.out.print("Input the squared value to-" + (i + 1) + " : ");
            png[i].squared = sc.nextInt();
        }

        System.out.println("===========================================");
        System.out.println("Results with Brute Force Squared");
        long start1 = 0;
        long end1 = 0;
        for (int i = 0; i < elemen; i++) {
            start1 = System.nanoTime();
            System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is : "
                    + png[i].squaredBF(png[i].num, png[i].squared));
            end1 = System.nanoTime();
        }
        System.out.println("How long time : " + (end1 - start1));
        System.out.println("===========================================");
        System.out.println("Results with Divide and Conquer Squared");
        long start2 = 0;
        long end2 = 0;
        for (int i = 0; i < elemen; i++) {
            start2 = System.nanoTime();
            System.out.println("Value " + png[i].num + " squared " + png[i].squared + " is : "
                    + png[i].squaredDC(png[i].num, png[i].squared));
            end2 = System.nanoTime();
        }
        System.out.println("How long time : " + (end2 - start2));
        System.out.println("===========================================");
    }
}
