import java.util.Scanner;

public class uts2 {
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

        boolean passed;
        if (finalScore == 100) {
            System.out.println("\nPassed! Congrats!");
            passed = true;
        } else if (finalEx >= 55 || middleEx >= 55) {
            System.out.println("\nPassed!");
            passed = true;
        } else {
            System.out.println("\nSorry, You not passed");
            passed = false;
        }

        if (passed = true){
            if(finalScore < 70 || (daily > 65 && finalEx > 65 && middleEx > 65 && quiz > 65) ){
                System.out.println("You accept in Software Engineering major");
            } else if(daily > 70 && finalEx == 70 && quiz > 70){
                System.out.println("You accept in Multimedia major");
            } else {
                System.out.println("You accept in Information System major");
            }
        } else {
            System.out.println("Don't be sad, keep study and try again");
        }

    }
}