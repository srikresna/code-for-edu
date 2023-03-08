import java.util.Scanner;

public class jbs1no3qst {
    static Scanner input = new Scanner(System.in);
    static String flowersType[] = {"Aglaonema", "Taro", "Alocasia", "Rose"};
    static String branches[] = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"};
    static int prices[] = {75_000, 50_000, 60_000, 10_000};
    static int amount[][] = {
            {9, 3, 15, 2}, //before is 10, 5, 15, 7
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };

    public static void main(String[] args) {
        for (int row = 0; row < amount.length; row++) {
            int stock = 0;
            for (int col = 0; col < amount[0].length; col++) {
                stock+=amount[row][col];
            }
            System.out.println("Stock of Branch " + row + " = " + stock);
        }

        System.out.println("====================");
        System.out.println("Stock has decreased since the flowers are wither dead or dead");
        int income = 0;
        for (int i = 0; i < amount.length; i++) {
            income += amount[0][i] * prices[i];
        }
        System.out.println("Income of Royal Garden 1 if all flowers are sold out = " + income);

    }
}
