package oop_java.week7.percobaan1;

public class ClassB extends ClassA{
    public int z;

    public void getNilaiZ() {
        System.out.println("nilai Z : " + z);
    }

    public void getJumlah() {
        System.out.println("jumlah : " + (x + y + z));
    }
}
