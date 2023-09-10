package oop_java.week2;

public class Lingkaran {
    public double phi;
    public double r;

    public Lingkaran(double phi, double r) {
        this.phi = phi;
        this.r = r;
    }

    public double hitungLuas() {
        return this.phi * this.r * this.r;
    }

    public double hitungKeliling() {
        return 2 * this.phi * this.r;
    }
}
