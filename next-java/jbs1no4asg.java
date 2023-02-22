import java.util.Scanner;

public class jbs1no4asg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Please select a shape to calculate its area:");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    double base, height;
                    System.out.print("Enter the base of the triangle: ");
                    base = input.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    height = input.nextDouble();
                    double triangleArea = calculateTriangleArea(base, height);
                    System.out.println("The area of the triangle is: " + triangleArea);
                    break;
                case 2:
                    double width, length;
                    System.out.print("Enter the width of the rectangle: ");
                    width = input.nextDouble();
                    System.out.print("Enter the length of the rectangle: ");
                    length = input.nextDouble();
                    double rectangleArea = calculateRectangleArea(width, length);
                    System.out.println("The area of the rectangle is: " + rectangleArea);
                    break;
                case 3:
                    double radius;
                    System.out.print("Enter the radius of the circle: ");
                    radius = input.nextDouble();
                    double circleArea = calculateCircleArea(radius);
                    System.out.println("The area of the circle is: " + circleArea);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateRectangleArea(double width, double length) {
        return width * length;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
