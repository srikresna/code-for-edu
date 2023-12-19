public class Main {

    static String menang(int n, int k, int m) {
        return (n - k + m) % 2 == 0 ? "Pertama" : "Kedua";
    }

    public static void main(String[] args) {

        String hasilPertama = menang(10, 1, 1);
        String hasilKedua = menang(9, 8, 2);

        System.out.println("Hasil pengujian:");
        System.out.println("10, 1, 1: " + hasilPertama);
        System.out.println("9, 8, 2: " + hasilKedua);
    }
}
