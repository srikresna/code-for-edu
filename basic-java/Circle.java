//jobsheet10no2
import java.util.Scanner;

public class Circle {
    static Scanner input = new Scanner(System.in);
    static double circumference(double r) {
        double pie = 3.14;
        double circum = 2 * pie * r;
        return circum;
    }
    static double area(double r) {
        double pie = 3.14;
        double areas = pie * r * r;
        return areas;
    }
    public static void main(String[] args) {
        System.out.print("Input radius = ");
double radius = input.nextInt();
        System.out.println("Circumference is " + circumference(radius));
        System.out.println("Area is " + area(radius));
    }
}
