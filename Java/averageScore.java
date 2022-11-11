import java.util.Scanner;

public class averageScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[10];
        int length;
        double total = 0;
        double average = 0;
        
        System.out.print("Enter the number of students: ");
        length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            System.out.print("Enter student score " + (i + 1) + ": ");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            total += score[i];
        }
        average = total / length;
        System.out.println("The class average score is " + average);
    }
}
