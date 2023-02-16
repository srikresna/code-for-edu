import java.util.Scanner;

public class jbs4no3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double midEx1, midEx2, finEx1, finEx2, quiz1, quiz2, asg1, asg2, total;

        System.out.print("Input the midterm exam score = ");
        midEx1 = input.nextDouble();
        System.out.print("Input the final exam score = ");
        finEx1 = input.nextDouble();
        System.out.print("Input the quiz scores = ");
        quiz1 = input.nextDouble();
        System.out.print("Input the assignment scores = ");
        asg1 = input.nextDouble();

        midEx2 = midEx1 * 30 / 100;
        finEx2 = finEx1 * 40 / 100;
        quiz2 = quiz1 * 10 / 100;
        asg2 = asg1 * 20 / 100;

        total = midEx2 + finEx2 + quiz2 + asg2;

        if(total < 65){
            System.out.println("\nThe final score for student is " + total);
            System.out.println("\nThe student get a remedy");
        } else {
            System.out.println("\nThe final score for student is " + total);
            System.out.println("\nThe final score student is passed");
        }
        
    }
}