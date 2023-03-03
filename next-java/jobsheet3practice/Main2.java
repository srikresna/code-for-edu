package jobsheet3practice;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many lands: ");
        int a = sc.nextInt();

        Land[] companyLand = new Land[a];

        for(int i = 0; i < companyLand.length; i++) {
            companyLand[i] = new Land();

            System.out.println("Land " + (i + 1));
            System.out.print("Length: ");
            companyLand[i].length = sc.nextInt();
            System.out.print("Width: ");
            companyLand[i].width = sc.nextInt();
        }

        for(int i = 0; i < companyLand.length; i++) {
            System.out.println("Land Area " + (i + 1) + ": " + companyLand[i].getArea());
        }

        System.out.println("The widest land is Land " + companyLand[0].getWidestArea(companyLand));
    }
}
