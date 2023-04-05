package jobsheetStacking;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        Stack st = new Stack(8);
        Scanner sc = new Scanner(System.in);

        char choose;
        do {
            System.out.println("Title : ");
            String title = sc.nextLine();
            System.out.println("Author Name : ");
            String authorName = sc.nextLine();
            System.out.println("Published Year : ");
            int publishedYear = sc.nextInt();
            System.out.println("Pages Amount : ");
            int pagesAmount = sc.nextInt();
            System.out.println("Price : ");
            int price = sc.nextInt();

            Book bk = new Book(title, authorName, publishedYear, pagesAmount, price);
            System.out.print("Do you want to add new data to stack (y/n)? ");
            choose = sc.nextLine().charAt(0);
            sc.nextLine();
            st.push(bk);
        } while (choose == 'y' || choose == 'Y');
        st.print();
        st.pop();
        st.peek();
        st.print();
    }
}