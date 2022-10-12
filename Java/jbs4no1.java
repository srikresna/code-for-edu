import java.util.Scanner;

public class jbs4no1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.print("Input the first number = ");
        num1 = input.nextInt();
        System.out.print("Input the second number = ");
        num2 = input.nextInt();

        if(num1 > num2){
            System.out.println("Number " + num1 + " is larger than the second number");
        } else {
            System.out.println("Number " + num2 + " is larger than the first number");
        }

    }
}