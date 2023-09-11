package oop_java.week2.latihan3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter width: ");
        int width = sc.nextInt();

        Rectangle rectangle = new Rectangle(length, width);
        rectangle.getInfo();
        
    }
}
