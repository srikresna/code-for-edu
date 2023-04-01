//ODD 25
//25_SRI KRESNA MAHA DEWA

import java.util.Scanner;


public class quiz1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int numberFam;
        double salary1, salary2, salary3;
        double tax, aftertax;
        double insurance = 27000;
        double insurAmount;

        System.out.println("Input employee name = ");
        name = sc.nextLine();
        System.out.println("Input the number of family = ");
        numberFam = sc.nextInt();
        System.out.println("Input the basic salary = ");
        salary1 = sc.nextDouble();
        System.out.println("Input the percentages of tax = ");
        tax = sc.nextDouble();

        aftertax = tax / 100 * salary1;
        salary2 = salary1 - aftertax;
        insurAmount = numberFam * insurance;
        salary3 = salary2 - insurAmount;

        System.out.println(String.format("The net salary Mr. %s is %s", name, salary3));
        System.out.println("\n\n\n====THANK YOU====");

    } 
}