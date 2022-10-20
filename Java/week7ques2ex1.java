import java.util.Scanner;

public class week7ques2ex1 {

    public static void main(String[] args) {
        
    
    /*for example: user input n has been stored in variable n */
    Scanner input = new Scanner(System.in);
    int n;
    int i = 0;

    System.out.print("Input n : ");
    n = input.nextInt();

    while(i < n){
        System.out.print("*");
        i++;
        }
    }
}
