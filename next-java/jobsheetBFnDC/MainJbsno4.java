package jobsheetBFnDC;

import java.util.Scanner;

public class MainJbsno4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.print("Input the number of candidate = ");
        int totElemen = sc.nextInt();
        Jbsno4 jbs = new Jbsno4(totElemen);
        jbs.elemen = totElemen;

        System.out.println("===========================================");
        for (int i = 0; i < jbs.elemen; i++) {
            System.out.print("Input the name from voting result - " + (i + 1) + " = ");
            jbs.name[i] = sc.next();
        }

        System.out.println("===========================================");
        System.out.println("Algorithm DC");
        System.out.println("The winner from election sort from the highest voting is : " 
                + jbs.totalDC(jbs.name, 0, jbs.elemen -1));
    }
}
