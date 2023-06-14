import java.util.Scanner;

public class Main {
    // global variable
    static Scanner sc = new Scanner(System.in);
    static int menu, itemIndex;
    static String itemCode, yesNo;
    static String statusOrder = "belum lunas";
    static boolean mainProcess, menuProcess, inputProcess, validationUser;
    static String[] userMain = { "admin", "admin" };
    static String[] getUser = new String[2];
    static String[][] dataOrder = {
            { "A1", "sunarmi", "nasi kotak premium", "30", "30000", "10000", "12-12-2012", "lunas", "910000" },
            { "A2", "sutejo", "nasi kotak klasik", "30", "30000", "10000", "12-12-2013", "lunas", "910000" },
            { "A3", "narmi", "nasi kotak biasa", "30", "30000", "10000", "12-12-2014", "lunas", "910000" },
    };

    static String[][] foodMenu = {
            { "nasi kotak premium", "30000" },
            { "nasi kotak klasik", "40000" },
            { "nasi kotak biasa", "20000" },
            { "nasi kotak murah", "10000" },
    };

    static String[][] shippingCostTable = {
            { "0 - 1 km", "10000" },
            { "1 - 2 km", "20000" },
            { "2 - 3 km", "30000" },
            { " > 3 km", "40000" },
    };
    static String[][] arrayOrder = new String[50][9];

    // validation user function
    static boolean validationUser(String username, String password) {
        return username.equals(userMain[0]) && password.equals(userMain[1]);
    }

    // assign data to arrayOrder
    static void setFrameOrder() {
        for (int i = 0; i < dataOrder.length; i++) {
            arrayOrder[i][0] = dataOrder[i][0];
            arrayOrder[i][1] = dataOrder[i][1];
            arrayOrder[i][2] = dataOrder[i][2];
            arrayOrder[i][3] = dataOrder[i][3];
            arrayOrder[i][4] = dataOrder[i][4];
            arrayOrder[i][5] = dataOrder[i][5];
            arrayOrder[i][6] = dataOrder[i][6];
            arrayOrder[i][7] = dataOrder[i][7];
            arrayOrder[i][8] = dataOrder[i][8];
        }
    }

    // login function
    static void loginPage() {
        System.out.println("\n===== Login =====");
        System.out.print("Input username : ");
        getUser[0] = sc.nextLine();
        System.out.print("Input password : ");
        getUser[1] = sc.nextLine();
        validationUser = validationUser(getUser[0], getUser[1]);
    }

    // print data transaction
    static void detailTransactions() {
        System.out
                .println(
                        "\n============================================================ DETAIL ============================================================");
        System.out.println(
                "| No | Code | Customer Name | Order              | Amount | Price      | Shipping Cost | Date       | Status      | Total      |");
        for (int i = 0; i < arrayOrder.length; i++) {
            if (arrayOrder[i][0] != null) {
                System.out.printf("| %-2d | %-4s | %-13s | %-18s | %-6s | %-10s | %-13s | %-10s | %-11s | %-10s |\n",
                        (i + 1), arrayOrder[i][0], arrayOrder[i][1], arrayOrder[i][2], arrayOrder[i][3],
                        arrayOrder[i][4], arrayOrder[i][5], arrayOrder[i][6], arrayOrder[i][7],
                        arrayOrder[i][8]);
            }
        }

        // print customer yang belum lunas
        System.out.println(
                "\n===================================================== CUSTOMER BELUM LUNAS =====================================================");
        System.out.println(
                "| No | Code | Customer Name | Order              | Amount | Price      | Shipping Cost | Date       | Status      | Total      |");
        for (int i = 0; i < arrayOrder.length; i++) {
            if (arrayOrder[i][0] != null && arrayOrder[i][7].equals("belum lunas")) {
                System.out.printf("| %-2d | %-4s | %-13s | %-18s | %-6s | %-10s | %-13s | %-10s | %-11s | %-10s |\n",
                        (i + 1), arrayOrder[i][0], arrayOrder[i][1], arrayOrder[i][2], arrayOrder[i][3],
                        arrayOrder[i][4], arrayOrder[i][5], arrayOrder[i][6], arrayOrder[i][7],
                        arrayOrder[i][8]);
            }
        }

        System.out.println(
                "\n======================================= SEGERA HIMBAU CUSTOMER UNTUK MELUNASI PESANANNYA =======================================");
    }

    // function input new customer
    static void inputNewCustomer() {
        // print menu
        System.out.println("\n===== MENU CATHERING =====\t\t\t\t");
        for (int i = 0; i < foodMenu.length; i++) {
            System.out.printf("%d. %s - Rp.%s\n", (i + 1), foodMenu[i][0], foodMenu[i][1]);
        }

        for (int i = 0; i < arrayOrder.length; i++) {
            if (arrayOrder[i][0] == null) {
                System.out.println("\n================== INPUT NEW CUSTOMER =================");
                int itemCode = i + 1;
                arrayOrder[i][0] = "A" + itemCode;
                System.out.print("Input customer name : ");
                arrayOrder[i][1] = sc.nextLine();
                System.out.print("Input order : ");
                arrayOrder[i][2] = sc.nextLine();
                System.out.print("Input amount : ");
                arrayOrder[i][3] = sc.nextLine();
                if (arrayOrder[i][2].equalsIgnoreCase("nasi kotak premium")) {
                    arrayOrder[i][4] = "30000";
                } else if (arrayOrder[i][2].equalsIgnoreCase("nasi kotak klasik")) {
                    arrayOrder[i][4] = "40000";
                } else if (arrayOrder[i][2].equalsIgnoreCase("nasi kotak biasa")) {
                    arrayOrder[i][4] = "20000";
                } else if (arrayOrder[i][2].equalsIgnoreCase("nasi kotak murah")) {
                    arrayOrder[i][4] = "10000";
                } else {
                    arrayOrder[i][4] = "0";
                }

                System.out.println("\n===== ONGKOS KIRIM =====");
                for (int j = 0; j < shippingCostTable.length; j++) {
                    System.out.printf("%d. %s - Rp.%s\n", (j + 1), shippingCostTable[j][0], shippingCostTable[j][1]);
                }

                System.out.print("Input shipping range : ");
                double shippingRange = sc.nextDouble();
                if (shippingRange > 0 && shippingRange <= 1) {
                    arrayOrder[i][5] = "10000";
                } else if (shippingRange > 1 && shippingRange <= 2) {
                    arrayOrder[i][5] = "20000";
                } else if (shippingRange > 2 && shippingRange <= 3) {
                    arrayOrder[i][5] = "30000";
                } else {
                    arrayOrder[i][5] = "40000";
                }
                sc.nextLine();

                System.out.print("Input date : ");
                arrayOrder[i][6] = sc.nextLine();
                arrayOrder[i][7] = statusOrder;
                // sum total
                int amount = Integer.parseInt(arrayOrder[i][3]);
                int price = Integer.parseInt(arrayOrder[i][4]);
                int shippingCost = Integer.parseInt(arrayOrder[i][5]);
                int total = (amount * price) + shippingCost;
                arrayOrder[i][8] = String.valueOf(total);
                System.out.println();
                System.out.println("---------------------- STRUCK ------------------------");
                System.out.println("\t\t\t\t" + arrayOrder[i][6]);
                System.out.println("\t\t\t\tTransaction Code " + arrayOrder[i][0]);
                System.out.println("Name : " + arrayOrder[i][1]);
                System.out.println("Order : " + arrayOrder[i][2]);
                System.out.println("Amount : " + arrayOrder[i][3]);
                System.out.println("Price : Rp. " + arrayOrder[i][4]);
                System.out.println("Shipping Cost : Rp. " + arrayOrder[i][5]);
                System.out.println("------------------------------------------------------");
                System.out.println("\t\t\t\tTotal : Rp. " + arrayOrder[i][8]);
                System.out.println("================ STATUS : " + arrayOrder[i][7] + " ================");
                System.out.println("=== MOHON SELESAIKAN PEMBAYARAN DI MENU PEMBAYARAN ===");

                System.out.print("\nApakah anda ingin menambahkan data lagi? (y/n)");
                String yesNo = sc.nextLine();
                if (yesNo.equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
    }

    // function cari data transaksi via nama
    static int cariDataByNama(String[][] arrayOrder, String nama) {
        for (int i = 0; i < arrayOrder.length; i++) {
            if (arrayOrder[i][1] != null) {
                if (arrayOrder[i][1].equalsIgnoreCase(nama)) {
                    return i;
                }
            }
        }
        return -1;
    }

    // function cari data transaksi via tanggal
    static int cariDataByDate(String[][] arrayOrder, String date) {
        for (int i = 0; i < arrayOrder.length; i++) {
            if (arrayOrder[i][6] != null) {
                if (arrayOrder[i][6].equalsIgnoreCase(date)) {
                    return i;
                }
            }
        }
        return -1;
    }

    // function cari data transaksi via pesanan
    static int cariDataByPesanan(String[][] arrayOrder, String pesanan) {
        for (int i = 0; i < arrayOrder.length; i++) {
            if (arrayOrder[i][2] != null) {
                if (arrayOrder[i][2].equalsIgnoreCase(pesanan)) {
                    return i;
                }
            }
        }
        return -1;
    }

    // cari data
    static void findData() {
        itemIndex = 0;
        boolean subMenuFind = true;
        String custName, date, orderName;

        System.out.println("\n====== CARI DATA TRANSAKSI ======");
        System.out.print("Cari melalui : \n1. Nama \n2. Tanggal \n3. Pesanan \n4. Kembali ke menu utama \nSelect option 1 - 4 : ");
        menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
                System.out.print("Input nama yang ingin dicari : ");
                custName = sc.nextLine();
                itemIndex = cariDataByNama(arrayOrder, custName);
                break;
            case 2:
                System.out.print("Input tanggal yang ingin dicari : ");
                date = sc.nextLine();
                itemIndex = cariDataByDate(arrayOrder, date);
                break;
            case 3:
                System.out.print("Input nama pesanan yang ingin dicari : ");
                orderName = sc.nextLine();
                itemIndex = cariDataByPesanan(arrayOrder, orderName);
                break;
            case 4:
                subMenuFind = false;
                break;
            default:
                System.out.println("\t\tInvalid option! select option correctly");
                break;
        }

        if (itemIndex == -1) {
            System.out.println("\t\tData tidak ditemukan");
        } else {
            while (subMenuFind) {
                System.out.println("Data ditemukan! Ini data yang kamu cari");
                System.out.println(
                        "| No | Code | Customer Name | Order              | Amount | Price      | Shipping Cost | Date       | Status      | Total      |");
                               System.out.printf("| %-2d | %-4s | %-13s | %-18s | %-6s | %-10s | %-13s | %-10s | %-11s | %-10s |\n",
                        (itemIndex + 1), arrayOrder[itemIndex][0], arrayOrder[itemIndex][1], arrayOrder[itemIndex][2],
                        arrayOrder[itemIndex][3], arrayOrder[itemIndex][4], arrayOrder[itemIndex][5],
                        arrayOrder[itemIndex][6], arrayOrder[itemIndex][7], arrayOrder[itemIndex][8]);
                if (arrayOrder[itemIndex][7].equalsIgnoreCase("belum lunas")) {
                    System.out.print("\nOPTION \n1. Bayar tagihan \n2. Kembali ke menu utama\n");
                    System.out.print("Select option 1 - 2 : ");
                    menu = sc.nextInt();
                    sc.nextLine();

                    switch(menu) {
                        case 1:
                            // bayar();
                            break;
                        case 2:
                            subMenuFind = false;
                            break;
                        default:
                            System.out.println("\t\tInvalid option! select option correctly");
                            break;
                    }
                } else {
                    System.out.print("\nOPTION \n1. Kembali ke menu utama\n");
                    System.out.print("Select option : ");
                    menu = sc.nextInt();
                    sc.nextLine();

                    switch (menu) {
                        case 1:
                            subMenuFind = false;
                            break;
                        default:
                            System.out.println("\t\tInvalid option! select option correctly");
                            break;
                    }
                }
            }
        }
    }

    // detail transaksi
    static void inputTransactions() {
        inputProcess = true;
        while (inputProcess) {
            System.out.println(
                    "\nOPTION \n1. Pesan \n2. Back to main menu ");
            System.out.print("Select option 1 - 2 : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    inputNewCustomer();
                    break;
                case 2:
                    inputProcess = false;
                    break;

                default:
                    System.out.println("\t\tInvalid option! select option correctly");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        setFrameOrder();
        String line = "===========================================";
        System.out.printf("%s\n\tWANGGSAFF CATHERING \n%s", line, line);
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
                            System.out.println(
                                    "\nMENU \n1. Input Pesanan \n2. Pembayaran \n3. Cari Data \n4. Detail Transaksi \n5. Exit Program");
                            System.out.print("Choose menu 1 - 4 : ");
                            menu = sc.nextInt();
                            sc.nextLine();

                            switch (menu) {
                                case 1:
                                    inputTransactions();
                                    break;

                                case 2:
                                    // bayar();
                                    break;

                                case 3:
                                    findData();
                                    break;

                                case 4:
                                    detailTransactions();
                                    break;
                                case 5:
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

                case 2:
                    mainProcess = false;
                    break;

                default:
                    System.out.println("\t\tInvalid menu! Choose menu correctly");
                    break;
            }
        }
    }
}
