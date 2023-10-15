package oop_java.week6;

public class Laptop {
    private String merk;
    private Processor proc;

    public Laptop() {
    }

    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public String getMerk() {
        return merk;
    }

    public Processor getProc() {
        return proc;
    }

    public String setMerk(String merk) {
        return this.merk = merk;
    }

    public Processor setProc(Processor proc) {
        return this.proc = proc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }

}
