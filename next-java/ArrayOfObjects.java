import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Rectangle[] rectanglesArray = new Rectangle[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            rectanglesArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);

            System.out.print("Input length: ");
            rectanglesArray[i].length = sc.nextInt();

            System.out.print("Input width: ");
            rectanglesArray[i].width = sc.nextInt();

        }

        for (int i = 0;i < 10; i++) {
            System.out.println("Rectangle " + i);
            System.out.println("width: " + rectanglesArray[0].width + ", length: " + rectanglesArray[0].length);
        }
    }
}
