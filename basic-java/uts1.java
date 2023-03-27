import java.util.Scanner;

public class uts1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daily, middleEx, finalEx, quiz;

        System.out.print("Input the daily score = ");
        daily = sc.nextInt();
        System.out.print("Input the middle exam score = ");
        middleEx = sc.nextInt();
        System.out.print("Input the final exam score = ");
        finalEx = sc.nextInt();
        System.out.print("Input the quiz score = ");
        quiz = sc.nextInt();

        double finalScore;
        double percDaily, percMiddle, percFinal, percQuiz;
        percDaily = 0.25;
        percMiddle = 0.3;
        percFinal = 0.4;
        percQuiz = 0.05;

        finalScore = (daily * percDaily) + (middleEx * percMiddle) + (finalEx * percFinal) + (quiz * percQuiz);

        System.out.println("The final score is " + finalScore);
    }
}