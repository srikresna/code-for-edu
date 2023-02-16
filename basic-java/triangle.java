import java.util.Scanner;

public class triangle{
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);

        int base, height;
        float area;

        System.out.println("Insert base: ");
        base = sc.nextInt();
        System.out.println("Insert height: ");
        height = sc.nextInt();

        area = base * height / 2;
        System.out.println("Area of triangle is " + area);
    }

}