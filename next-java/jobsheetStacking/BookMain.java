package jobsheetStacking;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookStack st = new BookStack(8);

        char choose;
        do {
            System.out.println("Select operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Title : ");
                    String title = sc.nextLine();

                    System.out.print("Author name : ");
                    String authorName = sc.nextLine();

                    System.out.print("Published year : ");
                    int publishedYear = sc.nextInt();

                    System.out.print("Pages amount : ");
                    int pagesAmount = sc.nextInt();

                    System.out.print("Price : ");
                    int price = sc.nextInt();

                    Book bk = new Book(title, authorName, publishedYear, pagesAmount, price);
                    st.push(bk);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.print();
                    break;
                default:
                    System.out.println("Invalid option!");
            }

            System.out.print("Do you want to continue (y/n) ? ");
            choose = sc.next().charAt(0);
            sc.nextLine();
        } while (choose == 'y' || choose == 'Y');
    }
}
