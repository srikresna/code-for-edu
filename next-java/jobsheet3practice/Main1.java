package jobsheet3practice;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cube[] cubesArray = new Cube[2];
        Blocks[] blocksArray = new Blocks[2];
        Cylinder[] cylindersArray = new Cylinder[2];

        for(int i = 0; i < 2; i++) {
            cubesArray[i] = new Cube();
            blocksArray[i] = new Blocks();
            cylindersArray[i] = new Cylinder();

            System.out.println("Cube " + i);
            System.out.print("Input side length: ");
            cubesArray[i].side = sc.nextInt();

            System.out.println("Blocks " + i);
            System.out.print("Input length: ");
            blocksArray[i].length = sc.nextInt();
            System.out.print("Input width: ");
            blocksArray[i].width = sc.nextInt();
            System.out.print("Input height: ");
            blocksArray[i].height = sc.nextInt();

            System.out.println("Cylinder " + i);
            System.out.print("Input radius: ");
            cylindersArray[i].radius = sc.nextInt();
            System.out.print("Input height: ");
            cylindersArray[i].height = sc.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("===========================");
            System.out.println("Cube " + i);
            System.out.println("Volume: " + cubesArray[i].getVolume());
            System.out.println("Surface area: " + cubesArray[i].getSurfaceArea());
            System.out.println("Blocks " + i);
            System.out.println("Volume: " + blocksArray[i].getVolume());
            System.out.println("Surface area: " + blocksArray[i].getSurfaceArea());
            System.out.println("Cylinder " + i);
            System.out.println("Volume: " + cylindersArray[i].getVolume());
            System.out.println("Surface area: " + cylindersArray[i].getSurfaceArea());
        }
    }
}
