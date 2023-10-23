package oop_java.week7;

public class Windows extends Leptop{
    String fitur;

    public Windows() {
    }

    public Windows(String merk, String jnsProsesor, int kecProsesor, int sizeMemory, String jnsBatrei, String fitur) {
        super(merk, jnsProsesor, kecProsesor, sizeMemory, jnsBatrei);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        super.tampilLeptop();
        System.out.println("Fitur\t: " + fitur);
    }
}
