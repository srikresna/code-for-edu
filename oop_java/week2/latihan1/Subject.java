package oop_java.week2.latihan1;

public class Subject {
    public String code, name;
    public float grade;


    //constructor
    public Subject(String code, String name, float grade) {
        this.code = code;
        this.name = name;
        this.grade = grade;
    }

    public void showSubjectInfo() {
        System.out.println("Subject Code: " + code);
        System.out.println("Subject Name: " + name);
        System.out.println("Grade: " + grade);
    }



}
