package jobsheetQueue;
import java.util.Scanner;

public class QueueStudentMain {

    public static void menu() {
        System.out.println("Choose menu : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Check the first queue");
        System.out.println("4. Check the last queue");
        System.out.println("5. Check the queue position");
        System.out.println("6. Print all queue");
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert total students = ");
        int max = sc.nextInt();
        QueueStudent stdQueue = new QueueStudent(max);

        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Name : ");
                    String name = sc.nextLine();
                    System.out.print("Class Number : ");
                    int classNumber = sc.nextInt();
                    System.out.print("GPA : ");
                    double gpa = sc.nextDouble();
                    Student std = new Student(nim, name, classNumber, gpa);
                    sc.nextLine();
                    stdQueue.enqueue(std);
                    break;
                case 2:
                    Student data = stdQueue.dequeue();
                    if (!"".equals(data.nim) && !"".equals(data.name) &&
                            data.classNumber != 0 && data.gpa != 0) {
                        System.out.println("Data removed : " + data.nim + " "
                        + data.name + " " + data.classNumber + " " + data.gpa);
                        break;
                    }
                case 3:
                    stdQueue.peek();
                    break;
                case 4:
                    stdQueue.peekRear();
                    break;
                case 5:
                    System.out.print("NIM : ");
                    nim = sc.nextLine();
                    stdQueue.peekPosition(nim);
                    break;
                case 6:
                    System.out.println("Input Position : ");
                    int position = sc.nextInt();
                    stdQueue.printStudent(position);
            }
        } while (choose >= 1 && choose <= 6);
        sc.close();
    }
}
