public class jbs3no1 {
    public static void main(String args[]) {

        String campus = "Polinema";
        byte grade = 1;
        char _class = 'I';
        byte integer = 10;
        float number = 3.33333F;
        char character = 'C';

        System.out.println(String.format("I am %s student, class %s%s", campus, grade, _class));
        System.out.println("i'm learning to display values");
        System.out.println("Integer " + integer);
        System.out.println(String.format("Floating point %.2f", number));
        System.out.println("Character " + character);
    }
}