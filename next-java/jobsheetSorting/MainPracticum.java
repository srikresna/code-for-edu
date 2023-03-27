package jobsheetSorting;

import java.util.Scanner;

public class MainPracticum {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        HighAchieverStudent data = new HighAchieverStudent();
        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Name: ");
            String name = s2.nextLine();
            System.out.print("Entrance Year: ");
            int entranceYear = s1.nextInt();
            System.out.print("Age: ");
            int age = s1.nextInt();
            System.out.print("GPA: ");
            double gpa = s1.nextDouble();

            Students s = new Students(name, entranceYear, age, gpa);
            data.add(s);
        }

        System.out.println("Unsorted student list: ");
        data.print();

        System.out.println("Sorted student list according to GPA: ");
        data.bubbleSort();
        data.print();

        System.out.println("Sorted student list according to GPA using selection sort: ");
        data.selectionSort();
        data.print();

        System.out.println("Sorted student list according to GPA using insertion sort with ascending order: ");
        data.insertionSort(true);
        data.print();
    }
}
