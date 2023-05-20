package jobsheetDLL;

public class Student {
    String nim, name;
    double gpa;
    Student prev, next;

    public Student(Student prev, String nim, String name, double gpa, Student next) {
        this.prev = prev;
        this.nim = nim;
        this.name = name;
        this.gpa = gpa;
        this.next = next;
    }
}
