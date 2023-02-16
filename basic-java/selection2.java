import java.util.Scanner;

public class selection2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score1, score2, avarage;

        System.out.print("Enter a score: ");
        score1 = input.nextInt();
        System.out.print("Enter a score: ");
        score2 = input.nextInt();

        avarage = (score1 + score2) / 2;

        if (avarage >= 100) {
            avarage -= 5;
        }
        System.out.println("The final score is " + avarage);
    }
}