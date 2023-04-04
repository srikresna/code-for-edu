package jobsheetSearching;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        SearchStudent data = new SearchStudent();
        int amountStudent = 5;

        System.out.println("===============================");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("----------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Name\t: ");
            String name = s1.nextLine();
            System.out.print("Age\t: ");
            int age = s.nextInt();
            System.out.print("GPA\t: ");
            double gpa = s.nextDouble();

            Students student = new Students(nim, name, age, gpa);
            data.add(student);
        }
        System.out.println("-----------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("-----------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.print("Search Student by NIM :");
        int search = s.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);
        data.showData(search, position);

        System.out.println("===================================");
        System.out.print("Search Student by NIM :");
        int search2 = s.nextInt();
        System.out.println("Usign Binary Search");
        //sort first
        data.selectionSort();
        int position1 = data.findBinarySearch(search2, 0, data.listStd.length - 1);

        data.showPosition(search2, position1);
        data.showData(search2, position1);

        System.out.println("===================================");
        System.out.print("Search Student by Name :");
        String search3 = s1.nextLine();
        System.out.println("Usign Sequential Search");
        int position2 = data.findNameSequentialSearch(search3);

        data.showPositionName(search3, position2);
        data.showDataName(search3, position2);
    }
}
