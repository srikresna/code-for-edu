

import java.util.Scanner;

public class MultiLevelLogin {
    static Scanner sc = new Scanner(System.in);
    static String[][] accountCredentials = { 
        { "admin", "admin" }, 
        { "user", "user" } 
    };
    static String[] getAccount = new String[2];

    static void loginPage() {
        System.out.println("Login Page");
        System.out.print("Username: ");
        getAccount[0] = sc.nextLine();
        System.out.print("Password: ");
        getAccount[1] = sc.nextLine();
    }

    static boolean checkAccount(String level) {
        if (level.equals("admin")) {
            if (getAccount[0].equals(accountCredentials[0][0]) && getAccount[1].equals(accountCredentials[0][1])) {
                return true;
            }
        } else if (level.equals("user")) {
            if (getAccount[0].equals(accountCredentials[1][0]) && getAccount[1].equals(accountCredentials[1][1])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        loginPage();
        if (checkAccount("admin")) {
            System.out.println("Welcome Admin");
        } else if (checkAccount("user")) {
            System.out.println("Welcome User");
        } else {
            System.out.println("Invalid Account");
        }
    }
}
