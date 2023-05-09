package jobsheetQueue;

public class Student {
    String nim, name;
    int classNumber;
    double gpa;

    public Student (String nim, String name, int classNumber, double gpa) {
        this.nim = nim;
        this.name = name;
        this.classNumber = classNumber;
        this.gpa = gpa;
    }

    //method nim
    public String getNim() {
        return nim;
    }

    //nim
    public void setNim(String nim) {
        this.nim = nim;
    }
}
