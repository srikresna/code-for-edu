import java.util.Scanner;

public class jbs4no4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double ita, ita2, itb, itb2, itc, itc2, to1, to2, to3, total, total2, dis1, dis2, dis3, disc;
        String discount;

        System.out.print("Input price item A = ");
        ita = input.nextDouble();
        System.out.print("Input quantity of item A = ");
        ita2 = input.nextDouble();
        System.out.print("Input price item B = ");
        itb = input.nextDouble();
        System.out.print("Input quantity of item B = ");
        itb2 = input.nextDouble();
        System.out.print("Input price item C = ");
        itc = input.nextDouble();
        System.out.print("Input quantity of item C = ");
        itc2 = input.nextDouble();

        to1 = ita * ita2;
        to2 = itb * itb2;
        to3 = itc * itc2;
        total = to1 + to2 + to3;
        dis1 = 0.02; //diskon 2%
        dis2 = 0.05; //diskon 5%
        dis3 = 0.1; //diskon 10%

        if(total > 200000 && total < 500000){
            disc = dis1 * total; 
            discount = "2%";
        } else if(total > 500000 && total < 1000000){
            disc = dis2 * total;
            discount = "5%";
        } else {
            disc = dis3 * total;
            discount = "10%";
        }

        total2 = total - disc;
        
        System.out.print("-----------------------------------------\n");
        System.out.print("\t\tNote Struct\t\t\n");
        System.out.print("-----------------------------------------\n");
        System.out.print("Name items | Price | Quantity | Total\n ");
        System.out.print(String.format("Item A\t\t%s %s \t%s\n", ita, ita2, to1));
        System.out.print(String.format(" Item B\t\t%s %s \t%s\n", itb, itb2, to2));
        System.out.print(String.format(" Item C\t\t%s %s \t%s\n", itc, itc2, to3));
        System.out.println("\tTotal\t\t: " + total);
        System.out.println("========================================== Get a Discount " + discount);
        System.out.println("\tDiscount\t: " + disc);
        System.out.println("\tTotal to Pay\t: " + total2);
    }
}