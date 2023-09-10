package oop_java.week2;

import java.util.Scanner;

public class MainGameBorrower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;


        System.out.println("------ Welcome to Game Rental ------");
        System.out.println("Before you can borrow a game, please fill in your details");
        System.out.print("Name: ");
        String name = sc.nextLine();
        GameBorrower user = new GameBorrower(name);
        System.out.println("---- Thank you for your details ----");

        while (menu) {
            System.out.println("=== MENU ===");
            System.out.println("1. Borrow a game");
            System.out.println("2. Return a game");
            System.out.println("3. User detail");
            System.out.println("4. Exit");
            System.out.println("============");
            System.out.print("Choose menu: ");
            int menuChoice = sc.nextInt();

            switch(menuChoice) {
                case 1:
                    user.borrowGame();
                    break;
                case 2:
                    user.returnGame();
                    break;
                case 3:
                    user.getUserDetail();
                    break;
                case 4:
                    menu = false;
                    break;
            }
        }
    }
}
