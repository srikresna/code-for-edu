package oop_java.week7;

public class Mac extends Leptop{
    public String security;

    public Mac() {
    }

    public Mac(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatrei, String security) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory, jnsBatrei);
        this.security = security;
    }

    public void tampilMac() {
        super.tampilLeptop();
        System.out.println("Security\t: " + security);
    }
}
