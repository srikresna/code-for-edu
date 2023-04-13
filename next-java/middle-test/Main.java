

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //initialize a scanner object
        Scanner sc = new Scanner(System.in);
        //initialize the features object
        Features features = new Features();
        //initialize the items object
        Items item1 = new Items("16030927", "Indomilk", "drink", 100);
        Items item2 = new Items("16100617", "Sprite", "drink", 70);
        Items item3 = new Items("16240401", "Yakult", "drink", 500);
        Items item4 = new Items("16270525", "Indomie", "food", 250);
        Items item5 = new Items("16971204", "Orea", "food", 320);
        Items item6 = new Items("16100727", "Chocochips", "food", 120);
        Items item7 = new Items("16460329", "Ballpoint", "stationary", 75);
        Items item8 = new Items("16320421", "Pencil", "stationary", 110);
        Items item9 = new Items("16180729", "Book", "stationary", 57);

        //add the items to the array
        features.addItem(item1);
        features.addItem(item2);
        features.addItem(item3);
        features.addItem(item4);
        features.addItem(item5);
        features.addItem(item6);
        features.addItem(item7);
        features.addItem(item8);
        features.addItem(item9);
        
        //initialize the variable to store the user's choice
        int choice;
        //looping to display the menu
        do {
            System.out.println("==== STOCK MANAGAEMENT PROGRAM ====");
            System.out.println("MENU");
            System.out.println("1. Input/add Item data");
            System.out.println("2. Display all Item data");
            System.out.println("3. Sort Item data based on the stock values in ascending mode");
            System.out.println("4. Display Items data classified as food that have no stock");
            System.out.println("5. Search Item data based on the name keyword");
            System.out.println("6. Add the stock for certain Item");
            System.out.println("7. Decrease the stock for certain Item");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            //check the user's choice
            switch (choice) {
                //add the item
                case 1:
                    System.out.print("Enter item code: ");
                    String itemCode = sc.nextLine();
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter item category: ");
                    String category = sc.nextLine();
                    System.out.print("Enter item stock: ");
                    int stock = sc.nextInt();
                    sc.nextLine();
                    features.addItem(new Items(itemCode, name, category, stock));
                    break;
                //display all the items
                case 2:
                    features.displayAll();
                    break;
                //sort the items based on the stock
                case 3:
                    features.sortStock();
                    break;
                //display the food that have no stock
                case 4:
                    features.displayFoodNoStock();
                    break;
                //search the item based on the name keyword
                case 5:
                    System.out.print("Enter item name: ");
                    String keyword = sc.nextLine();
                    features.searchItem(keyword);
                    break;
                //increase the stock
                case 6:
                    System.out.print("Enter item code: ");
                    String itemCode1 = sc.nextLine();
                    System.out.print("Enter item stock: ");
                    int stock1 = sc.nextInt();
                    sc.nextLine();
                    features.addStock(itemCode1, stock1);
                    break;
                //decrease the stock
                case 7:
                    System.out.print("Enter item code: ");
                    String itemCode2 = sc.nextLine();
                    System.out.print("Enter item stock: ");
                    int stock2 = sc.nextInt();
                    sc.nextLine();
                    features.decreaseStock(itemCode2, stock2);
                    break;
                //exit the program
                case 8:
                    System.out.println("Thank you for using this program");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        //display the menu again if the user's choice is not 8
        } while (choice != 8);
    }
}
