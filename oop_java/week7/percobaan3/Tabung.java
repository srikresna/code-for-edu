package oop_java.week7.percobaan3;

public class Tabung extends Bangun{
    protected int t;
    public void setSuperPhi(double phi) {
        super.phi = phi;
    }
    public void setSuperR(int r) {
        super.r = r;
    }
    public void setT(int t) {
        this.t = t;
    }

    public void volume() {
        System.out.println("Volume tabung adalah : " + (super.phi * super.r * super.r * t));
    }
}
