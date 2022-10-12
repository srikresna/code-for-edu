import java.util.Scanner;

public class jbs3no2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        float temperature, celcius, reamur, fahrenheit, kelvin;
 
        System.out.println("Input temperature : ");
        temperature = sc.nextInt();

        celcius = temperature;
        reamur = 4F / 5F * celcius;
        fahrenheit = (9F / 5F * celcius) + 32F;
        kelvin = celcius + 273F;

        System.out.println("The temperature today is " + celcius + " Celcius");
        System.out.println("The temperature today is " + reamur + " Reamur");
        System.out.println("The temperature today is " + fahrenheit + " Fahrenheit");
        System.out.println("The temperature today is " + kelvin + " Kelvin");
    }
}