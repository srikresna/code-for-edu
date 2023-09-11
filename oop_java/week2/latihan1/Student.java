package oop_java.week2.latihan1;

public class Student {
    public String id, name;
    Subject[] subjects = new Subject[3];

    //constructor
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public void showSubjectInfo() {
        for (int i = 0; i < subjects.length; i++) {
            subjects[i].showSubjectInfo();
        }
    }

    public void setSubject(Subject subject, int index) {
        subjects[index] = subject;
    }


}
