package jobsheetStacking;
import java.util.Scanner;

public class Jbno1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("insert Sentence : ");
        String sentence = sc.nextLine();
        Jbno1 jbno1 = new Jbno1(sentence);

        for (int i = 0; i < sentence.length(); i++) {
            jbno1.push(sentence.charAt(i));
        }
        
        System.out.println("Result : ");
        for (int i = 0; i < sentence.length(); i++) {
            jbno1.pop();
        }

    }
}
