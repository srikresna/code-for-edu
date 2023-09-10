package oop_java.week2;

public class SourceErrorExp {
    public static void main(String[] args) {
        System.out.println("Awal program");

        int x = 10;

        /*
         * Contoh error :
         */
        // x = x / 0;

        // System.out.println(x);
        // System.out.println("Akhir program");

        try {
            x = x / 0;
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Error karena pembagian nol");
        }
        System.out.println(x);
        System.out.println("Akhir program");
    }
}
