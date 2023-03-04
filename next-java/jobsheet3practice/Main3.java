package jobsheet3practice;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Student[] studentsArray = new Student[3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < studentsArray.length; i++) {
            studentsArray[i] = new Student();

            System.out.println("Insert " + (i + 1) + " student data");
            System.out.print("insert name : ");
            studentsArray[i].name = sc.nextLine();
            System.out.print("Insert nim : ");
            studentsArray[i].nim = sc.nextLine();
            System.out.print("Insert gender : ");
            studentsArray[i].gender = sc.nextLine();
            System.out.print("Insert ipk : ");
            studentsArray[i].ipk = sc.nextDouble();
            sc.nextLine();
        }

        for (int i = 0; i < studentsArray.length; i++) {
            System.out.println((i + 1) + " Student Data");
            System.out.println("Name : " + studentsArray[i].name);
            System.out.println("Nim : " + studentsArray[i].nim);
            System.out.println("Gender : " + studentsArray[i].gender);
            System.out.println("Ipk score : " + studentsArray[i].ipk);
        }

        System.out.println("Average ipk of all students : " + studentsArray[0].getAvergaeIpk(studentsArray));
    }
}
