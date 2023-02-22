import java.util.Scanner;


public class jbs1no1qst {
    static Scanner sc = new Scanner(System.in);
    static int taskScore, midScore, finalScore;
    static double calculateFinalGrade() {
        double finalGrade = 0;
        finalGrade = (taskScore * 0.2) + (midScore * 0.35) + (finalScore * 0.45);
        return finalGrade;
    }
    static String getGrade() {
        String grade = "";
        if (calculateFinalGrade() > 80 && calculateFinalGrade() <= 100) {
            grade = "A";
        } else if (calculateFinalGrade() > 73 && calculateFinalGrade() <= 80) {
            grade = "B+";
        } else if (calculateFinalGrade() > 65 && calculateFinalGrade() <= 73) {
            grade = "B";
        } else if (calculateFinalGrade() > 60 && calculateFinalGrade() <= 65) {
            grade = "C+";
        } else if (calculateFinalGrade() > 50 && calculateFinalGrade() <= 60) {
            grade = "C";
        } else if (calculateFinalGrade() > 39 && calculateFinalGrade() <= 50) {
            grade = "D";
        } else {
            grade = "E";
        }
        return grade;
    }
    static String getPassed() {
        String passed = "";
        if (getGrade().equals("A") || getGrade().equals("B+") || getGrade().equals("B") || getGrade().equals("C+") || getGrade().equals("C")) {
            passed = "Passed";
        } else {
            passed = "Failed";
        }
        return passed;
    }
    public static void main(String[] args) {

        System.out.println("Program to Calculate Final Grade");
        System.out.println("====================");
        System.out.print("Input Task Score : ");
        taskScore = sc.nextInt();
        System.out.print("Input Mid Score : ");
        midScore = sc.nextInt();
        System.out.print("Input Final Score : ");
        finalScore = sc.nextInt();
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("Final Grade : " + calculateFinalGrade());
        System.out.println("Grade : " + getGrade());
        System.out.println("====================");
        System.out.println(getPassed());
    }
}
    