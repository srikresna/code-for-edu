public class ArrayBlock {
    public static void main(String[] args) {
        Blocks[] b1Array = new Blocks[3];
        b1Array[0] = new Blocks(100, 30, 12);
        b1Array[1] = new Blocks(120, 40, 15);
        b1Array[2] = new Blocks(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume of block - " + i + " : " + b1Array[i].countVolume());
        }
    }
}
