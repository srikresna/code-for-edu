package jobsheetBFnDC;
import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================");
        System.out.print("Input the number of elementrs you want to count : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Input the data value to-" + (i+1) + " : ");
            fk[i].num = sc.nextInt();
        }
        System.out.println("=============================");
        System.out.println("Factorial Results with Brute Force");
        long start1 = 0;
        long end1 = 0;
        for (int i = 0; i < elemen; i++) {
            start1 = System.nanoTime();
            System.out.println("Factorial of value " + fk[i].num + " is : " + fk[i].FaktorialBF(fk[i].num));
            end1 = System.nanoTime();
        }
        System.out.println("How long time : " + (end1-start1));
        System.out.println("=============================");
        System.out.println("Factorial Results with Divide and Conquer");
        long start2 = 0;
        long end2 = 0;
        for (int i = 0; i < elemen; i++) {
            start2 = System.nanoTime();
            System.out.println("Factorial of value " + fk[i].num + " is : " + fk[i].FaktorialDC(fk[i].num));
            end2 = System.nanoTime();
        }
        System.out.println("How long time : " + (end2-start2));
        System.out.println("=============================");
    }

}
