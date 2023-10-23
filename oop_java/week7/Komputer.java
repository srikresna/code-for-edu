package oop_java.week7;

public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer() {
    }

    public Komputer(String merk, String jnsProsesor, int kecProsesor, int sizeMemory) {
        this.merk = merk;
        this.jnsProsesor = jnsProsesor;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
    }

    public void tampilData() {
        System.out.println("Merk\t\t: " + merk);
        System.out.println("Jenis Prosesor\t: " + jnsProsesor);
        System.out.println("Kecepatan Prosesor\t: " + kecProsesor);
        System.out.println("Size Memory\t: " + sizeMemory);
    }
}
