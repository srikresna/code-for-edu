package oop_java.week2;

import java.util.Scanner;

public class GameBorrower {
    public String id, name;
    public String gameTitle = "None";
    public int price = 25000;
    public int borrowTime = 0;
    Scanner sc = new Scanner(System.in);

    public GameBorrower(String name) {
        this.id = randomId();
        this.name = name;
    }

    public void getUserDetail() {
        System.out.println("------- USER DETAIL -------");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Game title: " + this.gameTitle);
        System.out.println("Price: " + getPrice());
        System.out.println("---------------------------");
    }

    public void borrowGame() {
        if (isBorrowed()) {
            System.out.println("You cannot borrow another game before you return the previous one");
        } else {
            System.out.println("<HELLO " + this.name.toUpperCase() + ">");
            System.out.print("What game do you want to borrow? ");
            this.gameTitle = sc.nextLine();
            sc.nextLine();
            System.out.print("How long do you want to borrow? ");
            this.borrowTime = sc.nextInt();
            System.out.println("---------------------------");
            System.out.println("Thank you for borrowing " + this.gameTitle + " for " + this.borrowTime + " day(s)");
            System.out.println("----- Your total price is " + getPrice() + " -----");
        }
    }

    public void returnGame() {
        if (isBorrowed()) {
            System.out.println("Thank you for returning " + this.gameTitle);
            this.gameTitle = "None";
            this.borrowTime = 0;
        } else {
            System.out.println("You haven't borrowed any game");
        }
    }

    public int getPrice() {
        return this.price * this.borrowTime;
    }

    public boolean isBorrowed() {
        if (this.borrowTime > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String randomId() {
        int random = (int) (Math.random() * 100);
        return String.valueOf(random);
    }
}
