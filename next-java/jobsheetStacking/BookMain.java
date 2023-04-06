package jobsheetStacking;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookStack st = new BookStack(8);

        char choose;
        do {
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
            System.out.print("Do you want to add new data to stack (y/n) ? ");
            choose = sc.next().charAt(0);
            sc.nextLine();
            st.push(bk);
        } while (choose == 'y' || choose == 'Y');
        st.print();
        st.pop();
        st.peek();
        st.print();
    }
}
