package jobsheet3practice;

public class Student {
    public String name, nim, gender;
    public Double ipk;
    public Student() {
    }

    public Double getAvergaeIpk(Student[] studentsArray) {
        Double averageIpk = 0.0;
        for(int i = 0; i < studentsArray.length; i++) {
            averageIpk += studentsArray[i].ipk;
        }
        return averageIpk / studentsArray.length;
    }
}
