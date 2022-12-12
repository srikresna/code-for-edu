import java.util.Scanner;
public class Main {
    //global variable
    static Scanner sc = new Scanner(System.in);
    static int menu, itemIndex;
    static String itemCode, itemName, yesNo;
    static boolean mainProcess, menuProcess, inventoryProcess, borrowingProcess, validationUser;
    static String[] userData = {"admin", "admin"};
    static String[] getUser = new String[2];
    static String[][] inventory = {
            {"A1", "monitor", "20", "3"},
            {"A2", "keyboard", "78", "11"},
            {"A3", "mouse", "87", "7"},
            {"A4", "table", "130", "10"},
            {"A5", "chair", "20", "4"},
            {"A6", "projector", "9", "0"},
            {"A7", "switch", "24", "1"},
            {"A8", "laptop", "2", "5"}
    };
    static String[][] borrowItem = {
            {"7-12-2022", "A8", "laptop", "1"},
            {"7-12-2022", "A7", "Switch", "2"},
            {"7-12-2022", "A6", "Projector", "1"}
    };

    static String[][] frameInventory = new String[50][4];
    static String[][] frameBorrowing = new String[50][4];

    //validation user function
    static boolean validationUser(String username, String password) {
        return username.equals(userData[0]) && password.equals(userData[1]);
    }

    //array-maker function
    static void setFrameItem() {
        for (int i = 0; i < inventory.length; i++) {
            frameInventory[i][0] = inventory[i][0];
            frameInventory[i][1] = inventory[i][1];
            frameInventory[i][2] = inventory[i][2];
            frameInventory[i][3] = inventory[i][3];

        }
        int i = 0;
        while (i < borrowItem.length) {
            frameBorrowing[i][0] = borrowItem[i][0];
            frameBorrowing[i][1] = borrowItem[i][1];
            frameBorrowing[i][2] = borrowItem[i][2];
            frameBorrowing[i][3] = borrowItem[i][3];
            i++;
        }
    }

    //login function
    static void loginPage() {
        System.out.println("\n===== Login =====");
        System.out.print("Input username : ");
        getUser[0] = sc.nextLine();
        System.out.print("Input password : ");
        getUser[1] = sc.nextLine();
        validationUser = validationUser(getUser[0], getUser[1]);
    }

    //print inventory function
    static void showInventory() {
        System.out.println("\n================== INVENTORY ==================");
        System.out.println("| No | Code | Item Name      | Stock | Broken |");
        for (int i = 0; i < frameInventory.length; i++) {
            if (frameInventory[i][0] != null) {
                System.out.printf("| %-2d | %-4s | %-14s | %-5s | %-6s |\n", (i + 1), frameInventory[i][0], frameInventory[i][1], frameInventory[i][2], frameInventory[i][3]);
            }
        }
    }

    //input new item function
    static void inputNewItem(){
        String yesNo;
        for (int i = inventory.length; i < frameInventory.length; i++) {
            System.out.print("Input item code : ");
            frameInventory[i][0] = sc.nextLine();
            System.out.print("Input item name : ");
            frameInventory[i][1] = sc.nextLine();
            System.out.print("Input new stock : ");
            frameInventory[i][2] = sc.nextLine();
            System.out.print("Input total broken :");
            frameInventory[i][3] = sc.nextLine();
            System.out.print("Do you want to input again? ( y / n ) : ");
            yesNo = sc.nextLine();

            if (yesNo.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    //edit item function
    static void editItem(){
        boolean menuEdit = true, subMenuEdit = true;
        itemIndex = frameInventory.length;

        while (menuEdit){
            System.out.print("Input item code to edit : ");
            itemCode = sc.nextLine();

            for (int i = 0; i <= frameInventory.length; i++){
                if(frameInventory[i][0].equals(itemCode)){
                    itemIndex = i;
                    break;
                }
            }

                while(subMenuEdit){
                    System.out.println("\nItem found! Here's item that you want edit : ");
                    System.out.println("| Code | Item Name      | Stock | Broken |");
                    System.out.printf("| %-4s | %-14s | %-5s | %-6s |\n", frameInventory[itemIndex][0], frameInventory[itemIndex][1], frameInventory[itemIndex][2], frameInventory[itemIndex][3]);
                    System.out.println("\nWhat do you want to edit? \n1. Item code \n2. Item name \n3. Item stock \n4. Item broken \n5. Nothing");
                    System.out.print("Select option 1 - 5 : ");
                    menu = sc.nextInt();
                    sc.nextLine();

                    switch (menu) {
                        case 1:
                            System.out.print("Input new item code : ");
                            frameInventory[itemIndex][0] = sc.nextLine();
                            break;

                        case 2:
                            System.out.print("Input new item name : ");
                            frameInventory[itemIndex][1] = sc.nextLine();
                            break;

                        case 3:
                            System.out.print("Input new item stock : ");
                            frameInventory[itemIndex][2] = sc.nextLine();
                            break;

                        case 4:
                            System.out.print("Input total broken condition : ");
                            frameInventory[itemIndex][3] = sc.nextLine();
                            break;

                        case 5:
                            subMenuEdit = false;
                            break;

                        default:
                            System.out.println("\t\tInvalid option! select option correctly");
                            break;
                    }
                }


            System.out.print("Do you want to edit again? ( y / n ) : ");
            yesNo = sc.nextLine();
            if (yesNo.equalsIgnoreCase("n")){
                menuEdit = false;
            }
        }
    }

    //find item function
    static void findItem() {
        itemIndex = frameInventory.length;
        boolean subMenuFind = true;

        //nambah pencarian dari nama item
        System.out.println("============ Search Item ============");
        System.out.print("What do you want to search ? \n1. Item code \n2. Item name \nSelect option 1 - 2 : ");
        menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
                System.out.print("Input item code : ");
                itemCode = sc.nextLine();
                for (int i = 0; i <= frameInventory.length; i++) {
                    if (frameInventory[i][0].equals(itemCode)) {
                        itemIndex = i;
                        break;
                    }
                }
                break;

            case 2:
                System.out.print("Input item name : ");
                itemName = sc.nextLine();
                for (int i = 0; i <= frameInventory.length; i++) {
                    if (frameInventory[i][1].equals(itemName)) {
                        itemIndex = i;
                        break;
                    }
                }
                break;

            default:
                System.out.println("\t\tInvalid option! select option correctly");
                break;
        }

            while (subMenuFind) {
                System.out.println("\nItem found! Here's item that you want");
                System.out.println("| Code | Item Name      | Stock | Broken |");
                System.out.printf("| %-4s | %-14s | %-5s | %-6s |\n", frameInventory[itemIndex][0], frameInventory[itemIndex][1], frameInventory[itemIndex][2], frameInventory[itemIndex][3]);
                System.out.print("\nOPTION \n1. Edit item \n2. Go back\n");
                System.out.print("Select option 1 - 2 : ");
                menu = sc.nextInt();
                sc.nextLine();

                switch (menu) {
                    case 1:
                        editItem();
                        break;
                    case 2:
                        subMenuFind = false;
                        break;

                    default:
                        System.out.println("\t\tInvalid option! select option correctly");
                        break;
                }
            }
        }

    // show borrowing function
    static void showBorrow() {
        System.out.println("\n==================== List Borrowing Data ====================");
        System.out.println("| No | Borrowing date | Item code | Item Name      | Amount |");
        for (int i = 0; i < frameBorrowing.length; i++) {
            if (frameBorrowing[i][0] != null) {
                System.out.printf("| %-2d | %-14s | %-9s | %-14s | %-6s |\n", (i + 1), frameBorrowing[i][0], frameBorrowing[i][1], frameBorrowing[i][2], frameBorrowing[i][3]);
            }
        }
    }

    // input new borrowing function
    static void inputBorrow() {
        boolean subMenuBorrow = true;
        itemIndex = frameInventory.length;
        int itemStock;
        showInventory();

        while (subMenuBorrow) {
            System.out.print("Search item code to borrow : ");
            itemCode = sc.nextLine();

            for (int i = 0; i < frameInventory.length; i++) {
                if (frameInventory[i][0].equals(itemCode)) {
                    itemIndex = i;
                    break;
                }
            }

                System.out.println("\nItem found! Here's item that you want");
                System.out.println("| Code | Item Name      | Stock | Broken |");
                System.out.printf("| %-4s | %-14s | %-5s | %-6s |\n", frameInventory[itemIndex][0], frameInventory[itemIndex][1], frameInventory[itemIndex][2], frameInventory[itemIndex][3]);
                System.out.print("How many stock to borrow : ");
                itemStock = sc.nextInt();
                sc.nextLine();

                if (Integer.parseInt(frameInventory[itemIndex][2]) >= itemStock) {
                    frameInventory[itemIndex][2] = String.valueOf(Integer.parseInt(frameInventory[itemIndex][2]) - itemStock);

                    String yesNo;
                    for (int i = borrowItem.length; i < frameBorrowing.length; i++) {
                        System.out.print("Input date ( dd-mm-yyyy ) : ");
                        frameBorrowing[i][0] = sc.nextLine();
                        frameBorrowing[i][1] = itemCode;
                        System.out.print("Input name :");
                        frameBorrowing[i][2] = sc.nextLine();
                        frameBorrowing[i][3] = String.valueOf(itemStock);
                        System.out.println("Item borrowed!");
                        System.out.print("Do you want to input again? ( y / n ) : ");
                        yesNo = sc.nextLine();

                        if (yesNo.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    showBorrow();
                    break;
                } else {
                    System.out.println("Item stock is not enough!");
                }

            System.out.print("Do you want to borrow again? ( y / n ) : ");
            yesNo = sc.nextLine();
            if (yesNo.equalsIgnoreCase("n")) {
                subMenuBorrow = false;
            }
        }
    }

    //menu 1 : inventory data function
    static void inventoryDataMenu() {
        inventoryProcess = true;
        while (inventoryProcess) {
            showInventory();
            System.out.println("\nOPTION \n1. Input new item \n2. Edit item \n3. Find item \n4. Back to main menu ");
            System.out.print("Select option 1 - 4 : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    inputNewItem();
                    break;
                case 2:
                    editItem();
                    break;
                case 3:
                    findItem();
                    break;
                case 4:
                    inventoryProcess = false;
                    break;

                default:
                    System.out.println("\t\tInvalid option! select option correctly");
                    break;
            }
        }
    }

    //menu 2 : borrowing data function
    static void borrowingDataMenu() {
        borrowingProcess = true;
        while (borrowingProcess) {
            System.out.println("\nOPTION \n1. Show borrowing data \n2. Input borrowing \n3. Back to main menu");
            System.out.print("Select option 1 - 3 : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    showBorrow();
                    break;
                case 2:
                    inputBorrow();
                    break;
                case 3:
                    borrowingProcess = false;
                    break;

                default:
                    System.out.println("\t\tInvalid option! select option correctly");
                    break;
            }
        }
    }

    //main program
    static void mainProgram() {
        mainProcess = true;
        while (mainProcess) {
            System.out.println("\nPLEASE LOGIN TO CONTINUE ACCESS THE PROGRAM \n1. Login \n2. Exit Program");
            System.out.print("Choose menu 1 - 2 : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    menuProcess = true;
                    loginPage();
                    if (validationUser) {
                        System.out.println("\nWELCOME ADMIN!!");
                        while (menuProcess) {
                            System.out.println("\nMENU \n1. Inventory Data \n2. Borrowing Data \n3. Logout");
                            System.out.print("Choose menu 1 - 3 : ");
                            menu = sc.nextInt();
                            sc.nextLine();

                            switch (menu) {
                                case 1:
                                    inventoryDataMenu();
                                    break;

                                case 2:
                                    borrowingDataMenu();
                                    break;

                                case 3:
                                    menuProcess = false;
                                    break;

                                default:
                                    System.out.println("\t\tInvalid menu! Choose menu correctly");
                                    break;

                            }
                        }
                    } else {
                        System.out.println("\t\tIncorrect account, Try again!");
                    }
                    break;

                case 2 :
                    mainProcess = false;
                    break;

                default:
                    System.out.println("\t\tInvalid menu! Choose menu correctly");
                    break;
            }
        }
    }


    public static void main(String[] args) {
        setFrameItem();
        String line = "===========================================";
        System.out.printf("%s\n\t\t\tPROCUREMENT OF CAMPUS \n%s", line, line);
        mainProgram();
    }
}

