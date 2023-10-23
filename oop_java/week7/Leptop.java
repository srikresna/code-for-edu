package oop_java.week7;

public class Leptop extends Komputer{
    public String jnsBatrei;

    public Leptop() {
    }

    public Leptop(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatrei) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory);
        this.jnsBatrei = jnsBatrei;
    }

    public void tampilLeptop() {
        super.tampilData();
        System.out.println("Jenis Baterai\t: " + jnsBatrei);
    }
}
