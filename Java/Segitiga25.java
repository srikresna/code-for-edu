import org.omg.PortableServer.ImplicitActivationPolicyOperations;

public class Segitiga25 {

    public static void main(String[] args){
        Import java.util.Scanner;
        Scanner sc = new Scanner(System.in);
        
        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi; ");
        tinggi = sc.nextInt();

        luas = alas * tinggi / 2;
        System.out.print("Luas segitiga: " + luas);
    }
}