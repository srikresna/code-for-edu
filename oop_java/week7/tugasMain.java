package oop_java.week7;

public class tugasMain {
    public static void main(String[] args) {
        Mac m1 = new Mac("Macbook Pro 2020", "Intel i7", 3, 16, "Li-Ion", "Apple T2 Chip");
        m1.tampilMac();
        System.out.println();
        Windows w1 = new Windows("Asus Zenbook", "Intel i7", 3, 16, "Li-Ion", "Windows Hello");
        w1.tampilWindows();
        System.out.println();
        Pc gaming = new Pc("Asus ROG", "Intel i7", 3, 16, 32);
        gaming.tampilPc();
    }
}
