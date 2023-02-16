import java.util.Scanner;

public class jbs1no2qst {
    static Scanner scanner = new Scanner(System.in);
    static String nim;
    static int n;
    static String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    static int getNIM() {
        n = Integer.parseInt(nim.substring(nim.length() - 2));
        return n;
    }
    static int getDays(){
        int daysIndex = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(days[daysIndex] + " ");
            daysIndex = (daysIndex + 1) % 7;
        }
        return daysIndex;
    }
    public static void main(String[] args) {
        System.out.print("Enter your NIM: ");
        nim = scanner.next();
        System.out.println("====================");
        System.out.printf("n : %d\n", getNIM());
        getDays();
    }
}
