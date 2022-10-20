import java.util.Scanner;

public class jbs6no2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, i;
        int count = 0;
        int sum = 0;
        float avarage;

        System.out.print("Enter a number range: ");
        n = input.nextInt();
        System.out.println("The number of even numbers from 1 to " + n + " is " + n/2 );
        for(i = 1; i <= n; i++){
            if(i % 2 != 0)
            continue; 
            count++;
            System.out.println(String.format("Even number %d is %d", count, i));
            sum += i;  
        }
        avarage = (float) sum / count;

        System.out.println("The sum of the even numbers from 1 to " + n + " is " + sum);
        System.out.println("The avarage of the even numbers from 1 to " + n + " is " + avarage);

    }
}