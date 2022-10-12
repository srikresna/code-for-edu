import java.util.Scanner;

public class jbs4no2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int age;

        System.out.print("--PROGRAM TO DETERMINE PERMISSION TO DRIVE--\n\n");
        System.out.print("Input the age = ");
        age = input.nextInt();

        if (age >= 17){
            System.out.println("Allowed to drive");
        } else {
            System.out.println("Not allowed to drive");
        }

        System.out.print("\nSTAY SAFE DRIVING");
    }
}