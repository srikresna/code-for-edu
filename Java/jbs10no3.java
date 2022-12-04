import java.util.Scanner;

public class jbs10no3 {
    static Scanner input = new Scanner(System.in);
    static void input(int[] score) {
        for (int i = 0; i < score.length; i++) {
            System.out.printf("Input the score of student %d = ", i + 1);
            score[i] = input.nextInt();
        }
    }
    static double average(int[] score) {
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        double avr = 0;
        avr = sum / score.length;
        return avr;
    }
    public static void main(String[] args) {

        int[] B = new int[10];
        input(B);
        System.out.print("\nAverage from all student is " + average(B));
    }
}
